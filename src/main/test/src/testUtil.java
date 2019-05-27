package src;

import org.junit.Test;
import team.ustc.sse.blockly.util.TimeUtil;

import java.util.Date;

/**
 * description:
 * author: rgzhang
 * create time: 2019-05-27
 **/
public class testUtil {

    @Test
    public void testData(){
        System.out.println(TimeUtil.getPastDate(new Date(),10));

    }
}
