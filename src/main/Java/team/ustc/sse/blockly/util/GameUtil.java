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
    private static final Integer MAX_LEVEL = 20;
    private static final Integer[] LEVEL_COUNTS = {0,1,9,9,1,1,9,9,1,9,9,9,9,1,9,9,9,1,9,9};    //第0个下标设置为0
    public static final String[] LEVEL_NAME = {
            "0.null","1.离线：七巧板","2.迷宫与蜜蜂","3.小艺术家","4.离线：封装变量","5.离线：疯狂填词","6.小艺术家：变量",
            "7.游戏实验室：变量","8.离线：计数循环的乐趣","9.蜜蜂：计数循环","10.小艺术家：计数循环"
    };


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
        int level = Integer.valueOf(result[0]);
        int count = Integer.valueOf(result[1]);
        int id = level*100 + count;
        return id;

    }

    /**
    * @Description: 将数值关卡转化为string，用于页面get请求
    * @Param: [id]
    * @return: java.lang.String
    * @Author: rgzhang
    */
    public static String turnIntToString(Integer id){

        int level = id/100;
        int count = id%100;
        String leval = ""+ level + "-" + count;
        return leval;

    }

    /**
    * @Description: 得到这一大关有多少小关，用于显示在闯关页面上
    * @Param: [checkpoint]
    * @return: int
    * @Author: rgzhang
    */
    public static int getCounts(String checkpoint){
        String[] result = checkpoint.split("-");
        return Integer.valueOf(result[1]);
    }


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
                int level = c.getCheckpointid()/100;
                int count = c.getCheckpointid()%100;
                lists.get(level).set(count,true);       //设置第level大关，第count小关为通过
            }
        }
        return lists;

    }


    public static List<String> turnSuccessToString(List<Checkoutpoint> checkoutpoints) {
        List<String> successList = new ArrayList<>();
        for (Checkoutpoint c: checkoutpoints) {
            if(c.getIssuccess()==1){
                int level = c.getCheckpointid()/100;
                if(level == 0 || level>MAX_LEVEL)continue;
                int count = c.getCheckpointid()%100;
                if(count > LEVEL_COUNTS[level])continue;
                successList.add(turnIntToString(c.getCheckpointid()));
            }
        }
        return successList;
    }


}
