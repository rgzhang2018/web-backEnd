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
import team.ustc.sse.blockly.util.IPTool;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.List;

@Service
public class LoginServiceImpl implements LoginService {


//    private final HttpServletRequest request ;
//    private final HttpServletResponse response ;
    private final StudentloginMapper studentloginMapper;
    private final StudentMapper studentMapper;
    private final StudentloginmessageMapper studentloginmessageMapper;


    //注：idea建议 使用构造器的方式注入，而非@Autowired
    public LoginServiceImpl(StudentloginMapper studentloginMapper, StudentMapper studentMapper, StudentloginmessageMapper studentloginmessageMapper) {
        this.studentloginMapper = studentloginMapper;
        this.studentMapper = studentMapper;
        this.studentloginmessageMapper = studentloginmessageMapper;

//        this.request = request;
//        this.response = response;
//        , HttpServletRequest request, HttpServletResponse response,
    }

    @Override
    public boolean studentLogin(Studentlogin studentlogin, boolean remember) {

        //在数据库中查询这个用户信息
        Studentlogin studentInDB =  findByStudentAccount(studentlogin.getStudentaccount());
        if(studentInDB==null || !studentInDB.getStudentpassword().equals(studentlogin.getStudentpassword())){
            return false;//密码错误或者不存在用户
        }

        //设置session和cookie
//        setLoginSession(studentInDB,remember);
        //记录登录IP等信息
//        setStudentLoginMessage(studentInDB.getStudentid());
        return true;
    }

    @Override
    public boolean studentRegister(Studentlogin studentlogin, Student student) {
        int id = studentloginMapper.insertSelective(studentlogin);
        student.setStudentregistertime(new Date());
        student.setStudentid(id);
        studentMapper.insertSelective(student);
        System.out.println("测试插入完成之后，主键是否会传回来："+ studentlogin.getStudentid());
//        setStudentLoginMessage(id);

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
//
//    private void setStudentLoginMessage(int studentID){
//        String ip = IPTool.getLocalIp(request);
//        Studentloginmessage studentloginmessage = new Studentloginmessage()
//                .setLogindata(new Date()).setStudentid(studentID).setLoginip(ip);
//        studentloginmessageMapper.insertSelective(studentloginmessage);
//        System.out.println("test primary key ===>"+ studentloginmessage.getStudentloginid());
//    }
//
//
//    private void setLoginSession(Studentlogin studentlogin,boolean remember){
//        HttpSession session = request.getSession();
//        //set session
//        session.setAttribute("loginFlag",true);
//        session.setAttribute("loginAccount",studentlogin.getStudentaccount());
//        //set cookie
//        if(remember){
//            Cookie cookie = new Cookie("loginAccount",studentlogin.getStudentaccount());
//            cookie.setMaxAge(60 * 60 * 24 *7 );
//            response.addCookie(cookie);
//        }
////        testCookieAndSession(session);
//    }
//
//
//    //显示当前session和cookie的保存状态
//    private void testCookieAndSession(HttpSession session){
//        System.out.println("session:======>" + session.getAttribute("loginFlag"));
//        Cookie[] cookies = request.getCookies();
//        for(Cookie cookie :cookies){
//            if(cookie.getName().equals("loginAccount")){
//                System.out.println("cookie:======>"+cookie.getName() +" | "+ cookie.getValue());
//            }
//        }
//    }
//
//    //从session或者cookie中获取登录用户，先放到这里了，后面再做切面
//    private void getMessgeFromSession(){
//        HttpSession session = request.getSession();
//        Cookie[] cookies = request.getCookies();
//        //检测session和cookie
//        if(session.getAttribute("loginFlag")!=null &&  session.getAttribute("loginFlag").equals(true)){
//            System.out.println("in session , then reset session" );
//            session.setAttribute("loginFlag",false);
//        }
//
//        for(Cookie cookie :cookies){
//            if(cookie.getName().equals("loginAccount")){
//                System.out.println("in cookie , then reset cookie" );
//            }
//        }
//    }
}
