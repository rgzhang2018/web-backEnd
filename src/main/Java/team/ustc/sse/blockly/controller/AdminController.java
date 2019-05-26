package team.ustc.sse.blockly.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import team.ustc.sse.blockly.entity.Admin;
import team.ustc.sse.blockly.service.inte.AdminService;

import javax.servlet.http.HttpServletRequest;

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
    public String login(HttpServletRequest request){
        System.out.println(request.getRequestURI());
        return "admin_login";
    }


    @RequestMapping(value = "/loginControl",method = {RequestMethod.GET})
    public String loginControl(Admin admin, HttpServletRequest request){
        System.out.println(request.getRequestURI());
        return "admin_login";
    }



}
