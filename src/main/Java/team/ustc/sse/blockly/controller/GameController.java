package team.ustc.sse.blockly.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import team.ustc.sse.blockly.entity.Checkoutpoint;
import team.ustc.sse.blockly.service.inte.GameService;
import java.util.Date;
import javax.servlet.http.HttpServletRequest;

/**
 * description: 读取游戏关卡信息、保存游戏进度信息、读取游戏进度信息
 * author: rgzhang
 * create time: 2019-04-14
 **/
@Controller
@RequestMapping("/gameControl")
public class GameController {
    @Autowired
    GameService gameServiceImpl;

    /**
    * @Description: 通过ajax对当前关卡信息进行保存
    * @Param: [request]
    * @return: void
    * @Author: rgzhang
    */
    @RequestMapping(value = "/saveCheckoutPoint",method = {RequestMethod.POST})
    public void saveCheckoutPoint(Checkoutpoint checkoutpoint){
//        Checkoutpoint checkoutpoint = new Checkoutpoint();
//        checkoutpoint.setProgram(request.getParameter("code"))
//                .setCheckpointid(Integer.valueOf(request.getParameter("checkpointID")))
//                .setStudentid(Integer.valueOf(request.getParameter("studentID")))
//                .setSavetime(new Date());



        boolean result = gameServiceImpl.saveCheckoutPoint(checkoutpoint);

    }

    /**
    * @Description: 通过ajax获取到该用户当前的闯关信息
    * @Param: [request]
    * @return: java.lang.String
    * @Author: rgzhang
    */
    @RequestMapping(value = "/getCheckoutPoint",method = {RequestMethod.POST})
    public void getCheckoutPoint(HttpServletRequest request){
        int studentID = Integer.valueOf(request.getParameter("studentID"));
        int checkpointID = Integer.valueOf(request.getParameter("checkpointID"));
        System.out.println(request.getRequestURI());
        Checkoutpoint checkoutpoint = gameServiceImpl.getCheckoutPoint(studentID,checkpointID);

    }





    /**
    * @Description: 获取到当前关卡的信息(待完成)
    * @Param: [request]
    * @return: java.lang.String
    * @Author: rgzhang
    */
    @RequestMapping(value = "/getCheckpoint",method = {RequestMethod.GET})
    public String getCheckpoint(HttpServletRequest request){
        System.out.println(request.getRequestURI());

        return "visitor_login";
    }

}
