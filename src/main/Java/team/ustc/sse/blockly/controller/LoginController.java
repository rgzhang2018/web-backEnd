package team.ustc.sse.blockly.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.bind.annotation.ResponseBody;
import team.ustc.sse.blockly.entity.Student;
import team.ustc.sse.blockly.entity.Studentlogin;
import team.ustc.sse.blockly.service.impl.LoginServiceImpl;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@Controller
@RequestMapping("/loginControl")
public class LoginController {
    @Autowired
    LoginServiceImpl studentLoginService;

    @RequestMapping(value = "/login",method = {RequestMethod.GET})
    public String login(HttpServletRequest request){
        System.out.println(request.getRequestURI());
        return "students/student_login";
    }

    @RequestMapping(value = "/register",method = {RequestMethod.GET})
    public String register(HttpServletRequest request){
        return "students/student_register";
    }


    @RequestMapping(value = "/studentLogin" ,method = {RequestMethod.POST})
    public String studentLogin(Studentlogin studentLogin, Boolean remember,HttpServletRequest request){
        if(remember == null)remember=false;
        if(studentLogin.getStudentaccount() ==null || studentLogin.getStudentpassword() == null){
            request.setAttribute("message","请输入用户名或和密码");
            return "demo/wrong";
        }
        boolean result = studentLoginService.studentLogin(studentLogin,remember,request );
        if(!result){
            request.setAttribute("message","用户名或密码错误");
            return "demo/wrong";
        }
        return "students/checkpoints";
    }

    @RequestMapping(value = "/studentRegister" ,method = {RequestMethod.POST})
    public String studentRegister(Studentlogin studentLogin, Student student,HttpServletRequest request){
        System.out.println(studentLogin);
        System.out.println(student);
        if(studentLogin.getStudentaccount() ==null || studentLogin.getStudentpassword() == null)return "demo/wrong";
        boolean result = studentLoginService.studentRegister( studentLogin,student,request);
        if(!result){
            request.setAttribute("message","注册失败，请重新尝试");
            return "demo/wrong";
        }else{
            request.setAttribute("redirectUrl","/rest/loginControl/login");
            request.setAttribute("message","注册成功，即将转跳到登录页面");
            return "demo/loginSuccess";
        }

    }

    @RequestMapping(value = "/checkStudentAccount" ,method = {RequestMethod.POST})
    public @ResponseBody String checkStudentAccount(@RequestBody Studentlogin studentlogin, HttpServletResponse response){
        response.setContentType("application/json; charset=utf-8");
        if(studentlogin == null || studentlogin.getStudentaccount()==null)return "0";
        Studentlogin result = studentLoginService.findByStudentAccount(studentlogin.getStudentaccount());
        if(result == null)return "1";
        return "0";
    }


}
