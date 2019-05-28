package team.ustc.sse.blockly.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import team.ustc.sse.blockly.service.impl.TestServiceImpl;

import javax.servlet.http.HttpServletRequest;

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


    @RequestMapping("request")
    public String testRequest(HttpServletRequest request){
        System.out.println(request.getClass());
        try {
            throw new Exception("request stack trace");
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }




    @RequestMapping(value = "/ajax",method = {RequestMethod.GET})
    public String testAjax(){
        return "demo/ajaxDemo";
    }


    @RequestMapping(value = "/ajaxSend",method = {RequestMethod.GET})
    public String ajaxSend(){
        return "demo/ajaxSend";
    }
}
