package team.ustc.sse.blockly.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

/**
 * description:
 * author: rgzhang
 * create time: 2019-05-26
 **/
@Controller
@RequestMapping("/admin")
public class AdminController {

    @RequestMapping(value = "/login",method = {RequestMethod.GET})
    public String login(HttpServletRequest request){
        System.out.println(request.getRequestURI());
        return "admin_login";
    }



}
