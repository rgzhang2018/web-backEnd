package team.ustc.sse.blockly.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import team.ustc.sse.blockly.entity.Studentlogin;
import team.ustc.sse.blockly.service.impl.LoginServiceImpl;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@Controller
public class LoginController {
    @Autowired
    LoginServiceImpl studentLoginService;

    @RequestMapping(value = "login",method = {RequestMethod.GET})
    public String loginUI(){
        return "visitor_login";
    }


    /**
    * @Description: 登录信息验证，目前简单实现后期再加上加密等
    * @Param: [account, password, saveFlag, time]
    * @return: java.lang.String
    * @Author: rgzhang
    */
    @RequestMapping(value = "studentLogin" ,method = {RequestMethod.POST})
    public String loginControl(Studentlogin student, Boolean remember, HttpServletRequest request, HttpServletResponse response){

//        Student student = new Student().setStudentaccount(studentaccount).setStudentpassword(studentpassword);

//        System.out.println(studentaccount+ " | 111| "+ student+ " "+ remember + " ");
        System.out.println(student);
        HttpSession session = request.getSession();
        Cookie[] cookies = request.getCookies();
        //检测session和cookie

        if(session.getAttribute("loginFlag")!=null &&  session.getAttribute("loginFlag").equals(true)){
            System.out.println("in session , then reset session" );
            session.setAttribute("loginFlag",false);
            return "success";
        }

        
        for(Cookie cookie :cookies){
            if(cookie.getName().equals("loginAccount")){
                System.out.println("in cookie , then reset cookie" );
                return "hello";
            }
        }

        boolean result = studentLoginService.studentLoginCheck(student);
        if(!result)return "wrong";
        //set session
        session.setAttribute("loginFlag",true);
        session.setAttribute("loginAccount",student.getStudentaccount());

        if(remember){
            Cookie cookie = new Cookie("loginAccount",student.getStudentaccount());
            cookie.setMaxAge(60 * 60 * 24 *7 );
            response.addCookie(cookie);
        }
        return "success";
    }



}
