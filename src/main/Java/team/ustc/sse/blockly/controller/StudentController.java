package team.ustc.sse.blockly.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/student")
public class StudentController {

    /**
     * @Description: index
     * @Param: []
     * @return: java.lang.String
     * @Author: rgzhang
     * @Date: 2019/3/10
     */
    @RequestMapping(value = "index",method = {RequestMethod.GET})
    public String index(){
        return "index";
    }





}
