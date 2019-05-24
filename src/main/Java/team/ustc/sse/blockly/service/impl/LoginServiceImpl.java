package team.ustc.sse.blockly.service.impl;

import org.springframework.stereotype.Service;
import team.ustc.sse.blockly.entity.Student;
import team.ustc.sse.blockly.entity.Studentlogin;
import team.ustc.sse.blockly.entity.StudentloginExample;
import team.ustc.sse.blockly.entity.Studentloginmessage;
import team.ustc.sse.blockly.mapper.StudentMapper;
import team.ustc.sse.blockly.mapper.StudentloginMapper;
import team.ustc.sse.blockly.mapper.StudentloginmessageMapper;
import team.ustc.sse.blockly.service.inte.LoginService;
import team.ustc.sse.blockly.util.NetworkUtil;


import javax.servlet.http.*;
import java.util.Date;
import java.util.List;

@Service
public class LoginServiceImpl implements LoginService {

    private final StudentloginMapper studentloginMapper;
    private final StudentMapper studentMapper;
    private final StudentloginmessageMapper studentloginmessageMapper;


    private static int i = 0;
    static {
        i++;
        System.out.println("xxxxx =================> load service and i = "+i);
    }


    //注：idea建议 使用构造器的方式注入，而非@Autowired
    public LoginServiceImpl(StudentloginMapper studentloginMapper, StudentMapper studentMapper, StudentloginmessageMapper studentloginmessageMapper) {
        this.studentloginMapper = studentloginMapper;
        this.studentMapper = studentMapper;
        this.studentloginmessageMapper = studentloginmessageMapper;

        i++;
        System.out.println("xxxxx =================> load service and i = "+i);

    }

    @Override
    public boolean studentLogin(Studentlogin studentlogin, boolean remember,HttpServletRequest request) {
        //在数据库中查询这个用户信息
        Studentlogin studentInDB =  findByStudentAccount(studentlogin.getStudentaccount());
        if(studentInDB==null || !studentInDB.getStudentpassword().equals(studentlogin.getStudentpassword())){
            return false;//密码错误或者不存在用户
        }

//        设置session和cookie
        setLoginSession(studentInDB,remember,request);
//        记录登录IP等信息
        setStudentLoginMessage(studentInDB.getStudentid(),request);
        return true;
    }

    @Override
    public boolean studentRegister(Studentlogin studentlogin, Student student, HttpServletRequest request) {
        int id = studentloginMapper.insertSelective(studentlogin);
        student.setStudentregistertime(new Date());
        student.setStudentid(id);
        studentMapper.insertSelective(student);
//        System.out.println("测试插入完成之后，主键是否会传回来："+ studentlogin.getStudentid());
        setStudentLoginMessage(student.getStudentid(),request);

        return false;
    }


    @Override
    public Studentlogin findByStudentAccount(String account) {
        StudentloginExample studentExample = new StudentloginExample();
        StudentloginExample.Criteria criteria = studentExample.createCriteria();
        criteria.andStudentaccountEqualTo(account);
        List<Studentlogin> studentList = studentloginMapper.selectByExample(studentExample);
        if(studentList.isEmpty())return null;

        return studentList.get(0);
    }




    @Override
    public void updateByStudentNickname(String name, Studentlogin studentlogin) {

    }

    //写入登录信息
    private void setStudentLoginMessage(int studentID,HttpServletRequest request){
        try {
            throw new Exception();
        }catch (Exception e){
            e.printStackTrace();
        }

        String ip = NetworkUtil.getIpAddress(request);
        Studentloginmessage studentloginmessage = new Studentloginmessage()
                .setLogindata(new Date()).setStudentid(studentID).setLoginip(ip);
        studentloginmessageMapper.insertSelective(studentloginmessage);
//        System.out.println("test primary key ===>"+ studentloginmessage.getStudentloginid());
    }

    //写入session
    private void setLoginSession(Studentlogin studentlogin,boolean remember,HttpServletRequest request){
        HttpSession session = request.getSession();
        //set session
        session.setAttribute("loginFlag",true);
        session.setAttribute("loginAccount",studentlogin.getStudentaccount());
        System.out.println("======> set session in service");
    }

}
