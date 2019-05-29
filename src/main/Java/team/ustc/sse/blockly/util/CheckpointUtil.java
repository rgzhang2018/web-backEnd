package team.ustc.sse.blockly.util;

import org.junit.Test;

import java.util.logging.Level;

/**
 * description:
 * author: rgzhang
 * create time: 2019-05-28
 **/
public class CheckpointUtil {

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

}
