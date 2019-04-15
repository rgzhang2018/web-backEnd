package team.ustc.sse.blockly.controller;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import team.ustc.sse.blockly.service.impl.TestServiceImpl;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @program: childrenCode
 * @description: 测试配置文件。注：spring不能访问springMVC控制下的controller部分。
 * @author: rgzhang
 * @create: 2019-03-10 15:32
 **/

@Controller
public class TestController {

    @Autowired
    TestServiceImpl testService;

    /**
    * @Description: test
    * @Param: []
    * @return: java.lang.String
    * @Author: rgzhang
    * @Date: 2019/3/10
    */
    @RequestMapping("index")
    public String index(HttpServletRequest request){
        HttpSession session = request.getSession();
        if(session.getAttribute("testMYService")!=null ){
            System.out.println("======> get session from controller" );
        }
        if(session.getAttribute("1111")!=null ){
            System.out.println("======> get session from service" );
        }
        Cookie[] cookies = request.getCookies();
        for(Cookie cookie :cookies){
            if(cookie.getName().equals("testMYService")){
                System.out.println("======> get cookie");
            }
        }
        return "index";
    }


}
