package team.ustc.sse.blockly.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import team.ustc.sse.blockly.entity.*;
import team.ustc.sse.blockly.service.inte.AdminService;
import team.ustc.sse.blockly.service.inte.GameService;
import team.ustc.sse.blockly.service.inte.StudentService;
import team.ustc.sse.blockly.util.SessionUtil;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * description:
 * author: rgzhang
 * create time: 2019-05-26
 **/
@Controller
@RequestMapping("/admin")
public class AdminController {
    private final AdminService adminServiceImpl;

    private final StudentService studentServiceImpl;

    private final GameService gameServiceImpl;

    public AdminController(AdminService adminServiceImpl, StudentService studentServiceImpl, GameService gameServiceImpl) {
        this.adminServiceImpl = adminServiceImpl;
        this.studentServiceImpl = studentServiceImpl;
        this.gameServiceImpl = gameServiceImpl;
    }


    /**
    * @Description: 管理员登录页面
    * @Param: [request]
    * @return: java.lang.String
    * @Author: rgzhang
    */
    @RequestMapping(value = "/login",method = {RequestMethod.GET})
    public String login(HttpServletRequest request){
        return "admin/admin_login";
    }


    //管理员主页，显示信息包括：
    //最近一周内登录次数
    //总注册用户数
    //最近一周闯关次数
    @RequestMapping(value = "/index",method = {RequestMethod.GET})
    public String index(HttpServletRequest request){
        int studentSize = studentServiceImpl.getAllStudents().size();
        int loginTimes = studentServiceImpl.getLoginMessagePast(7).size();   //获取最近一周的访问次数
        int checkoutpointCounts = gameServiceImpl.getCheckoutpointCountsPast(7);
        request.setAttribute("studentSize",studentSize);
//        model.addAttribute("studentSize",studentSize);
        request.setAttribute("loginTimes",loginTimes);
        request.setAttribute("checkoutpointCounts",checkoutpointCounts);
        return "admin/admin_index";
    }

    /**
    * @Description: 最近10次的loginmessage
    * @Param: [request]
    * @return: java.lang.String
    * @Author: rgzhang
    */
    @RequestMapping(value = "/recentLoginMessage",method = {RequestMethod.GET})
    public String recentLoginMessage(HttpServletRequest request){
        List<Studentloginmessage> list = studentServiceImpl.getTenStudentLoginMessages();
        request.setAttribute("list",list);
        return "admin/admin_recentLoginMessage";
    }

    /**
    * @Description: 管理员登出
    * @Param: [request]
    * @return: java.lang.String
    * @Author: rgzhang
    */
    @RequestMapping(value = "logout",method = {RequestMethod.GET})
    public String logout(HttpServletRequest request){
        SessionUtil.cleanSession(request);
        return "admin/admin_login";
    }

    /**
    * @Description: 修改管理员密码
    * @Param: [request]
    * @return: java.lang.String
    * @Author: rgzhang
    */
    @RequestMapping(value = "/changeAdminPassword",method = {RequestMethod.GET})
    public String changeAdminPassword(HttpServletRequest request){
        return "admin/admin_changeAdminPassword";
    }



    /**
    * @Description: 登录部分post验证
    * @Param: [admin, request]
    * @return: java.lang.String
    * @Author: rgzhang
    */
    @RequestMapping(value = "/loginControl",method = {RequestMethod.POST})
    public String login(Admin admin, HttpServletRequest request){
        System.out.println(admin);
        if(admin.getAdminaccount() == null || admin.getAdminpassword()==null)return "demo/wrong";
        boolean result = adminServiceImpl.adminLogin(admin,request);
        if(result)return "admin/admin_index";
        else return "admin/admin_login";
    }

    /**
    * @Description: 修改密码的POST验证
    * @Param: [oldPassword, newPassword, request]
    * @return: java.lang.String
    * @Author: rgzhang
    */
    @RequestMapping(value = "/setAdminPassword",method = {RequestMethod.POST})
    public String changeAdminPassword(String oldPassword, String newPassword, HttpServletRequest request){
        String account = SessionUtil.getAdminAccout(request);
        Admin admin = new Admin();
        admin.setAdminaccount(account);
        admin.setAdminpassword(oldPassword);
        boolean result = adminServiceImpl.changeAdminPassword(admin,newPassword);
        if(!result){
            request.setAttribute("message","密码错误");
            return "demo/wrong";
        }
        return "admin/admin_index";
    }

    /**
    * @Description: 管理员功能：得到用户列表
    * @Param: [request]
    * @return: java.lang.String
    * @Author: rgzhang
    */
    @RequestMapping(value = "/getStudents",method = {RequestMethod.GET})
    public String getStudents(HttpServletRequest request){
        List<Studentlogin> studentlogins = studentServiceImpl.getAllStudentLogins();
        List<Student> students = studentServiceImpl.getAllStudents();
        request.setAttribute("studentLoginList",studentlogins);
//        request.setAttribute("studentList",students);
        return "admin/admin_getStudents";
    }

    /**
    * @Description: 管理员功能：根据某个学生ID，得到他的闯关信息
    * @Param: [studentid, request]
    * @return: java.lang.String
    * @Author: rgzhang
    */
    @RequestMapping(value = "/showCheckoutPoint",method = {RequestMethod.GET})
    public String showCheckoutPoint(int studentid,HttpServletRequest request){
        List<Checkoutpoint> checkoutpointList = gameServiceImpl.getCheckoutpointByStudentID(studentid);
        request.setAttribute("checkoutpointList",checkoutpointList);
        return "admin/admin_getStudentGameMessage";
    }

    /**
    * @Description: 管理员功能：单个学生的loginmessage（Ip地址，登录日期）
    * @Param: [studentid, request]
    * @return: java.lang.String
    * @Author: rgzhang
    */
    @RequestMapping(value = "/showStudentLoginMessage",method = {RequestMethod.GET})
    public String showStudentLoginMessage(int studentid,HttpServletRequest request){
        List<Studentloginmessage> Studentloginmessage = studentServiceImpl.getStudentLoginMessages(studentid);
        request.setAttribute("LoginMessageList",Studentloginmessage);
        return "admin/admin_showStudentLoginMessage";
    }

    /**
    * @Description: 管理员功能：单个学生的信息
    * @Param: [studentid, request]
    * @return: java.lang.String
    * @Author: rgzhang
    */
    @RequestMapping(value = "/getStudentMessage",method = {RequestMethod.GET})
    public String getStudentMessage(int studentid,HttpServletRequest request){
        Studentlogin studentlogin = studentServiceImpl.getStudenloginByID(studentid);
        Student student = studentServiceImpl.getStudentMessageByID(studentid);
        request.setAttribute("student",student);
        request.setAttribute("studentlogin",studentlogin);
        request.setAttribute("sutdentid",studentid);
        return "admin/admin_getStudentMessage";
    }

    /**
    * @Description: 管理员功能：修改某个学生信息
    * @Param: [request, studentlogin, student, studentid]
    * @return: java.lang.String
    * @Author: rgzhang
    */
    @RequestMapping(value = "/changeStudentMessage",method = {RequestMethod.POST})
    public String changeStudentMessage(HttpServletRequest request, Studentlogin studentlogin,Student student,Integer studentid){
        if(studentid!=null){
            student.setStudentid(studentid);
            studentServiceImpl.changeStudentMessage(student);
            studentServiceImpl.changeStudentPassword(studentlogin.getStudentaccount(),studentlogin.getStudentpassword());
        }

        return "admin/admin_index";
    }
}
