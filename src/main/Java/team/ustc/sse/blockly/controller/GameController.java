package team.ustc.sse.blockly.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import team.ustc.sse.blockly.entity.Checkoutpoint;
import team.ustc.sse.blockly.service.inte.GameService;
import team.ustc.sse.blockly.util.GameUtil;
import team.ustc.sse.blockly.util.SessionUtil;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * description: 读取游戏关卡信息、保存游戏进度信息、读取游戏进度信息
 * author: rgzhang
 * create time: 2019-04-14
 **/
@Controller
@RequestMapping("/game")
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
    public @ResponseBody boolean saveCheckoutPoint(@RequestBody Checkoutpoint checkoutpoint, HttpServletResponse response){
        boolean result = gameServiceImpl.saveCheckoutPoint(checkoutpoint);
        response.setContentType("application/json; charset=utf-8");     //请求json，相应json，二者必须都是json格式
        return true;
    }



    /**
    * @Description: 通过ajax获取到该用户当前的闯关信息
    * @Param: [request]
    * @return: java.lang.String
    * @Author: rgzhang
    */
    @RequestMapping(value = "/getCheckoutPoint",method = {RequestMethod.POST})
    public @ResponseBody Checkoutpoint getCheckoutPoint(@RequestBody Checkoutpoint checkoutpoint, HttpServletResponse response){
        checkoutpoint = gameServiceImpl.getCheckoutPoint(checkoutpoint.getStudentid(),checkoutpoint.getCheckpointid());
        response.setContentType("application/json; charset=utf-8");     //请求json，相应json，二者必须都是json格式
        return checkoutpoint;
    }


    /**
    * @Description: 获取到当前关卡的信息(待完成)
    * @Param: [request]
    * @return: java.lang.String
    * @Author: rgzhang
    */
    @RequestMapping(value = "/getCheckpoint",method = {RequestMethod.POST})
    public String getCheckpoint(HttpServletRequest request){
        System.out.println(request.getRequestURI());
        return "students/student_login";
    }


    /**
     * @Description: 学生打开闯关页面，返回的successLists表示已经通过的关卡
     * @Param: [request, model]
     * @return: java.lang.String
     * @Author: rgzhang
     */
    @RequestMapping(value = "/checkpoints",method = {RequestMethod.GET})
    public String checkPoints(HttpServletRequest request){
//        if(SessionUtil.checkStudentLogin(request)){
//            Integer studentID = SessionUtil.getStudentID(request);
//            List<Checkoutpoint> checkoutpointList = gameServiceImpl.getSuccessMessageByStudent(studentID);
//            List<List<Boolean>> successLists = GameUtil.turnSuccessToList(checkoutpointList);
//            request.setAttribute("successLists",successLists);
//        }
        return "students/checkpoints";
    }

    @RequestMapping(value = "/checkpointsAjax",method = {RequestMethod.POST})
    public @ResponseBody List<String> checkPointsAjax(HttpServletRequest request,HttpServletResponse response){
        response.setContentType("application/json; charset=utf-8");
        if(SessionUtil.checkStudentLogin(request)){
            Integer studentID = SessionUtil.getStudentID(request);
            List<Checkoutpoint> checkoutpointList = gameServiceImpl.getSuccessMessageByStudent(studentID);
            List<String> successList = GameUtil.turnSuccessToString(checkoutpointList);
            System.out.println(successList);
            return successList;
        }
        return null;
    }


    @RequestMapping(value = "/getCheckpoint",method = {RequestMethod.GET})
    public String getCheckpoint(HttpServletRequest request,String level){
        if(level != null){      //get请求到具体的关卡
            System.out.println(level);
            if(level.endsWith(".html")){
                level = level.substring(0,level.length()-5);
            }
//            int counts = GameUtil.getCounts(level);
            request.setAttribute("level",level);
//            request.setAttribute("counts",counts);
        }
        return "students/getCheckpoint";
    }

}
