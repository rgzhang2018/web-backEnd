package team.ustc.sse.blockly.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import team.ustc.sse.blockly.entity.Student;
import team.ustc.sse.blockly.entity.Studentlogin;
import team.ustc.sse.blockly.service.impl.LoginServiceImpl;


import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@Controller
@RequestMapping("/loginControl")
public class LoginController {
    @Autowired
    LoginServiceImpl studentLoginService;

    @RequestMapping(value = "/login",method = {RequestMethod.GET})
    public String login(HttpServletRequest request){
        System.out.println(request.getRequestURI());

        return "visitor_login";
    }

    @RequestMapping(value = "/register",method = {RequestMethod.GET})
    public String register(HttpServletResponse response ,HttpServletRequest request){
        HttpSession session = request.getSession();
        session.setAttribute("testMYService",true);
        System.out.println("======> set session in controller");
        Cookie cookie2 = new Cookie("testMYService","1111");
        cookie2.setMaxAge(60 * 60 * 24 *7 );
        response.addCookie(cookie2);
        System.out.println("======> set cookie in controller");
        return "visitor_register";
    }


    @RequestMapping(value = "/studentLogin" ,method = {RequestMethod.POST})
    public String studentLogin(Studentlogin studentLogin, Boolean remember,HttpServletRequest request){
        if(remember == null)remember=false;
        if(studentLogin.getStudentaccount() ==null || studentLogin.getStudentpassword() == null)return "wrong";
        boolean result = studentLoginService.studentLogin(studentLogin,remember,request );
        if(!result)return "wrong";
        return "success";
    }

    @RequestMapping(value = "/studentRegister" ,method = {RequestMethod.POST})
    public String studentRegister(Studentlogin studentLogin, Student student,HttpServletRequest request){
        System.out.println(studentLogin);
        if(studentLogin.getStudentaccount() ==null || studentLogin.getStudentpassword() == null)return "wrong";
        boolean result = studentLoginService.studentRegister( studentLogin,student,request);
        if(!result)return "wrong";
        return "success";
    }



}
