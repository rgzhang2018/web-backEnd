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

    private final GameService gameServiceImpl;

    public GameController(GameService gameServiceImpl) {
        this.gameServiceImpl = gameServiceImpl;
    }

    /**
    * @Description: 通过ajax对当前关卡信息进行保存
    * @Param: [request]
    * @return: void
    * @Author: rgzhang
    */
    @RequestMapping(value = "/saveCheckoutPointAjax",method = {RequestMethod.POST})
    public @ResponseBody boolean saveCheckoutPointAjax(@RequestBody Checkoutpoint checkoutpoint, HttpServletResponse response,HttpServletRequest request){
        if(SessionUtil.checkStudentLogin(request)){
            checkoutpoint.setStudentid(SessionUtil.getStudentID(request));
            System.out.println(checkoutpoint.getProgram());
            System.out.println(checkoutpoint.getCheckpointid());
            System.out.println("====================");
            boolean result = gameServiceImpl.saveCheckoutPoint(checkoutpoint);
            response.setContentType("application/json; charset=utf-8");     //请求json，相应json，二者必须都是json格式
            return true;
        }

        return false;
    }



    /**
    * @Description: 通过ajax获取到该用户当前的闯关信息
    * @Param: [request]
    * @return: java.lang.String
    * @Author: rgzhang
    */
    @RequestMapping(value = "/getCheckoutPointAjax",method = {RequestMethod.POST})
    public @ResponseBody Checkoutpoint getCheckoutPointAjax(@RequestBody Checkoutpoint checkoutpoint,HttpServletRequest request, HttpServletResponse response){
        if(SessionUtil.checkStudentLogin(request)){
            checkoutpoint.setStudentid(SessionUtil.getStudentID(request));
            checkoutpoint = gameServiceImpl.getCheckoutPoint(checkoutpoint.getStudentid(),checkoutpoint.getCheckpointid());
            response.setContentType("application/json; charset=utf-8");     //请求json，相应json，二者必须都是json格式
            return checkoutpoint;
        }
        return null;
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
        String htmlCheckpoints = GameUtil.getHtmlCheckpoints();
        request.setAttribute("htmlCheckpoints",htmlCheckpoints);
        return "students/checkpoints";
    }

    /**
    * @Description: 用于闯关首页，ajax传输学生已通过的关卡并单独标记。
    * @Param: [request, response]
    * @return: java.util.List<java.lang.String> 传出格式为：2-1,3-2,12-1 等
    * @Author: rgzhang
    */
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

    /**
    * @Description: 关卡页面的渲染，根据GET请求获取到不同的关卡，渲染不同的关卡
    * @Param: [request, level]
    * @return: java.lang.String
    * @Author: rgzhang
    */
    @RequestMapping(value = "/getCheckpoint",method = {RequestMethod.GET})
    public String getCheckpoint(HttpServletRequest request,String level){
        if(level != null){      //get请求到具体的关卡
            System.out.println(level);
            if(level.endsWith(".html")){
                level = level.substring(0,level.length()-5);
            }
            String levelName = GameUtil.getLevelName(level);    //得到大关卡的名字
            int count = GameUtil.getThisCount(level);   //得到这一小关数字具体是几
            int major = GameUtil.getThisMajor(level);   //得到这关具体大关编号
            int countNum = GameUtil.getCounts(level);     //得到这一大关有多少小关
            request.setAttribute("level",level);
            request.setAttribute("levelName",levelName);
            request.setAttribute("major",major);
            request.setAttribute("count",count);
            request.setAttribute("countNum",countNum);
            return "students/getCheckpoint";
        }
        return "students/checkpoints";  //传入string为空时，返回关卡选择
    }

}
