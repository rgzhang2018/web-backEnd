package team.ustc.sse.blockly.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import team.ustc.sse.blockly.entity.Student;

@Controller
public class LoginController {

    @RequestMapping(value = "login",method = {RequestMethod.GET})
    public String loginUI(){
        return "login";
    }


    /**
    * @Description: 登录信息验证，目前简单实现后期再加上加密等
    * @Param: [account, password, saveFlag, time]
    * @return: java.lang.String
    * @Author: rgzhang
    */
    @RequestMapping(value = "login",method = {RequestMethod.POST})
    public String loginControl(String account ,String password, Boolean saveFlag, Integer time){

    }



}
