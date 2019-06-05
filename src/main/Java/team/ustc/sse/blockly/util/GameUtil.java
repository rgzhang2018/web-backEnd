package team.ustc.sse.blockly.util;

import org.junit.Test;
import team.ustc.sse.blockly.entity.Checkoutpoint;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;

/**
 * description:
 * author: rgzhang
 * create time: 2019-05-28
 **/
public class GameUtil {
    public static final Integer MAX_LEVEL = 20;
    public static final Integer[] LEVEL_COUNTS = {0,1,18,18,1,1,16,18,1,11,10,18,17,1,15,18,11,1,18,18};    //第0个下标设置为0
    public static final String[] LEVEL_NAME = {
            "0.null","1.离线：七巧板","2.迷宫与蜜蜂","3.小艺术家","4.离线：封装变量","5.离线：疯狂填词","6.小艺术家：变量",
            "7.游戏实验室：变量","8.离线：计数循环的乐趣","9.蜜蜂：计数循环","10.小艺术家：计数循环","11.游戏实验室：计数循环",
            "12.小艺术家：函数","13.离线：用参数写歌","14.小艺术家：有参数的函数","15.游戏实验室：有参数的函数","16.蜜蜂：有参数的函数",
            "17.离线：二进制","18.小艺术家：二进制","19.超级挑战:变量"

    };

    private static String htmlCheckpoints = null;

    //所有关卡信息
    static {
        StringBuilder result = new StringBuilder();
        for(int i=1;i<GameUtil.MAX_LEVEL;i++){
            result.append("<tr><td>").append(LEVEL_NAME[i]).append("</td>");
            if(LEVEL_COUNTS[i]==1){
                result.append("<td><button type='button' class='am-btn am-btn-sm am-btn-default am-round'>线下的活动</button></td>");
            }else{
                result.append("<td>");
                for(int j=1;j<LEVEL_COUNTS[i]+1;j++){
                    String s = i+"-"+j;
                    result.append("<a href=\"/rest/game/getCheckpoint?level=").append(s).append("\" id=\"").append(s)
                            .append("\" type=\"button\" class=\"am-btn am-btn-sm am-btn-default  am-round\"> ").append(j).append(" </a>");
                }
                result.append("</td>");
            }
        }
        htmlCheckpoints = new String(result);
    }



    public static String getLevelName(String level){
        int checkpointID = turnStringToInt(level);
        int count = checkpointID/100;
        if(count<LEVEL_NAME.length){
            return LEVEL_NAME[count];
        }
        return null;
    }

    public static String getHtmlCheckpoints(){
        return htmlCheckpoints;
    }

    /**
    * @Description: 传入格式：2-1,3-1关（注意。默认限制为每关最多100小关），即对应id=201,id=301
    * @Param: [checkpoint]
    * @return: int
    * @Author: rgzhang
    */
    public static int turnStringToInt(String checkpoint){
        String[] result = checkpoint.split("-");
        System.out.println(result[0]);
        System.out.println(result[1]);
        int major = Integer.valueOf(result[0]);
        int count = Integer.valueOf(result[1]);
        int id = major*100 + count;
        return id;

    }

    /**
    * @Description: 将数值关卡转化为string，用于页面get请求
    * @Param: [id]
    * @return: java.lang.String
    * @Author: rgzhang
    */
    public static String turnIntToString(Integer id){

        int major = id/100;
        int count = id%100;
        String leval = ""+ major + "-" + count;
        return leval;

    }

    /**
    * @Description: 得到这一小关的int
    * @Param: [checkpoint]
    * @return: int
    * @Author: rgzhang
    */
    public static int getThisCount(String checkpoint){
        String[] result = checkpoint.split("-");
        return Integer.valueOf(result[1]);
    }


    //返回这个Sting对应是第几大关的INT
    public static int getThisMajor(String checkpoint){
        String[] result = checkpoint.split("-");
        return Integer.valueOf(result[0]);
    }

    public static int getCounts(String level){
        String[] result = level.split("-");
        int major = Integer.valueOf(result[0]);
        if(major<LEVEL_COUNTS.length){
            return LEVEL_COUNTS[major];
        }
        return 0;
    }



    //用于ajax获取某个用户闯关信息(已弃用)，传出格式为完整的List
    public static List<List<Boolean>> turnSuccessToList(List<Checkoutpoint> checkoutpoints){
        List<List<Boolean>> lists = new ArrayList<List<Boolean>>();
        for(int i=0;i<MAX_LEVEL;i++){
            List<Boolean>list = new ArrayList<Boolean>();
            for(int j = 0;j<LEVEL_COUNTS[i];j++){    //后面再改为具体每个大关有几个小关
                list.add(false);
            }
            lists.add(list);
        }
//        int[] checkoutpointID = new int[MAX_LEVEL*100];
        for (Checkoutpoint c: checkoutpoints) {
            if(c.getIssuccess()==1){
                int major = c.getCheckpointid()/100;
                int count = c.getCheckpointid()%100;
                lists.get(major).set(count,true);       //设置第major大关，第count小关为通过
            }
        }
        return lists;

    }

    //用于ajax获取某个用户闯关信息(已弃用)，传出格式为通过的关卡list:
    //1-1 , 2-3 ...
    public static List<String> turnSuccessToString(List<Checkoutpoint> checkoutpoints) {
        List<String> successList = new ArrayList<>();
        for (Checkoutpoint c: checkoutpoints) {
            if(c.getIssuccess()!=null && c.getIssuccess()==1){
                int major = c.getCheckpointid()/100;
                if(major == 0 || major>MAX_LEVEL)continue;
                int count = c.getCheckpointid()%100;
                if(count > LEVEL_COUNTS[major])continue;
                successList.add(turnIntToString(c.getCheckpointid()));
            }
        }
        return successList;
    }


}
