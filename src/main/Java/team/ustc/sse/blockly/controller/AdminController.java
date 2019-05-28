package team.ustc.sse.blockly.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import team.ustc.sse.blockly.entity.*;
import team.ustc.sse.blockly.service.inte.AdminService;

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
    @Autowired
    private AdminService adminServiceImpl;

    @RequestMapping(value = "/login",method = {RequestMethod.GET})
    public String login(){
        return "admin/admin_login";
    }


    //最近一周内登录次数
    //总注册用户数
    //最近一周闯关次数
    @RequestMapping(value = "/index",method = {RequestMethod.GET})
    public String index(HttpServletRequest request){
        int studentSize = adminServiceImpl.getAllStudents().size();
        int loginTimes = adminServiceImpl.getLoginMessagePast(7).size();   //获取最近一周的访问次数
        int checkoutpointCounts = adminServiceImpl.getCheckoutpointCountsPast(7);
        request.setAttribute("studentSize",studentSize);
//        model.addAttribute("studentSize",studentSize);
        request.setAttribute("loginTimes",loginTimes);
        request.setAttribute("checkoutpointCounts",checkoutpointCounts);
        return "admin/admin_index";
    }

    //最近10次的loginmessage
    @RequestMapping(value = "/recentLoginMessage",method = {RequestMethod.GET})
    public String recentLoginMessage(HttpServletRequest request){
        List<Studentloginmessage> list = adminServiceImpl.getTenStudentLoginMessages();
        request.setAttribute("list",list);
        return "admin/admin_recentLoginMessage";
    }

    @RequestMapping(value = "/changeAdminPassword",method = {RequestMethod.GET})
    public String changeAdminPassword(){
        return "admin/admin_changeAdminPassword";
    }



    @RequestMapping(value = "/getStudents",method = {RequestMethod.GET})
    public String getStudents(HttpServletRequest request){
        List<Studentlogin> studentlogins = adminServiceImpl.getAllStudentLogins();
        List<Student>students = adminServiceImpl.getAllStudents();
        request.setAttribute("studentLoginList",studentlogins);
        request.setAttribute("studentList",students);
        return "admin/admin_getStudents";
    }

    @RequestMapping(value = "/showCheckoutPoint",method = {RequestMethod.POST})
    public String showCheckoutPoint(int studentID,HttpServletRequest request){
        List<Checkoutpoint> checkoutpointList = adminServiceImpl.getCheckoutpointByStudentID(studentID);
        request.setAttribute("checkoutpointList",checkoutpointList);
        return "admin_showCheckoutPoint";
    }

    //单个学生的loginmessage
    @RequestMapping(value = "/showStudentLoginMessage",method = {RequestMethod.POST})
    public String showStudentLoginMessage(int studentID,HttpServletRequest request){
        List<Studentloginmessage> Studentloginmessage = adminServiceImpl.getStudentLoginMessages(studentID);
        request.setAttribute("LoginMessageList",Studentloginmessage);
        return "admin_showStudentLoginMessage";
    }


    //部分post请求
    @RequestMapping(value = "/loginControl",method = {RequestMethod.POST})
    public String login(Admin admin, HttpServletRequest request){
        if(admin.getAdminaccount() == null || admin.getAdminpassword()==null)return "demo/wrong";
        boolean result = adminServiceImpl.adminLogin(admin,request);
        if(result)return "admin/admin_index";
        else return "admin/admin_login";
    }

    @RequestMapping(value = "/setAdminPassword",method = {RequestMethod.POST})
    public String changeAdminPassword(String oldPassword, String newPassword, HttpServletRequest request){
        String account = (String) request.getSession().getAttribute("adminAccount");
        Admin admin = new Admin();
        admin.setAdminaccount(account);
        admin.setAdminpassword(oldPassword);
        adminServiceImpl.changeAdminPassword(admin,newPassword);
        return "admin/admin_index";
    }

}
