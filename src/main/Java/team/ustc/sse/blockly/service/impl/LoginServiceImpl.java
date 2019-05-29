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
import team.ustc.sse.blockly.util.HttpUtil;
import team.ustc.sse.blockly.util.SessionUtil;


import javax.servlet.http.*;
import java.util.Date;
import java.util.List;

@Service
public class LoginServiceImpl implements LoginService {

    private final StudentloginMapper studentloginMapper;
    private final StudentMapper studentMapper;
    private final StudentloginmessageMapper studentloginmessageMapper;




    //注：idea建议 使用构造器的方式注入，而非@Autowired
    public LoginServiceImpl(StudentloginMapper studentloginMapper, StudentMapper studentMapper, StudentloginmessageMapper studentloginmessageMapper) {
        this.studentloginMapper = studentloginMapper;
        this.studentMapper = studentMapper;
        this.studentloginmessageMapper = studentloginmessageMapper;
    }

    @Override
    public boolean studentLogin(Studentlogin studentlogin, boolean remember,HttpServletRequest request) {
        //在数据库中查询这个用户信息
        Studentlogin studentInDB =  findByStudentAccount(studentlogin.getStudentaccount());
        if(studentInDB==null || !studentInDB.getStudentpassword().equals(studentlogin.getStudentpassword())){
            return false;//密码错误或者不存在用户
        }

//        设置session和cookie
        SessionUtil.setStudentLogin(studentInDB,remember,request);
//        记录登录IP等信息到数据库
        setStudentLoginMessage(studentInDB,request);
        return true;
    }

    @Override
    public boolean studentRegister(Studentlogin studentlogin, Student student, HttpServletRequest request) {
        int result = studentloginMapper.insertSelective(studentlogin);  //写入登录检查表(登录信息)
        if(result<=0)return false;
        student.setStudentregistertime(new Date());
        student.setStudentid(studentlogin.getStudentid());
        result = studentMapper.insert(student);          //写入学生表(个人详细信息)。注：这里修改了mapper.xml，保证主键插入成功
        return result>0;
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
    private void setStudentLoginMessage(Studentlogin studentlogin,HttpServletRequest request){
        try {
            throw new Exception("test aop exception");
        }catch (Exception e){
            e.printStackTrace();
        }
        String ip = HttpUtil.getIpAddress(request);
        Studentloginmessage studentloginmessage = new Studentloginmessage()
                .setLogindata(new Date())
                .setStudentid(studentlogin.getStudentid())
                .setLoginip(ip)
                .setLoginmessage(studentlogin.getStudentaccount());
        studentloginmessageMapper.insertSelective(studentloginmessage);
//        System.out.println("test primary key ===>"+ studentloginmessage.getStudentloginid());
    }


}
