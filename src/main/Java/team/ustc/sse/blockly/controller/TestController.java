package team.ustc.sse.blockly.controller;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import team.ustc.sse.blockly.service.impl.TestServiceImpl;

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
    public String index(){
        System.out.println("hello!");
        return "index";
    }


}
