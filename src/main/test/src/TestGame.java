package src;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import team.ustc.sse.blockly.entity.Checkoutpoint;
import team.ustc.sse.blockly.service.impl.GameServiceImpl;
import team.ustc.sse.blockly.service.inte.GameService;
import team.ustc.sse.blockly.util.SessionUtil;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;
import java.util.Date;
import java.util.List;

/**
 * description:
 * author: rgzhang
 * create time: 2019-05-25
 **/
public class TestGame {





    private ApplicationContext applicationContext;



    /**
     * @Description: init 方法，用于执行spring的IOC的对象的获取
     * @Param: []
     * @return: void
     * @Author: rgzhang
     * @Date: 2019/3/10
     */
    @Before
    public void init() {
        //获取applicationContext
//        applicationContext = new ClassPathXmlApplicationContext("spring-config.xml");

        applicationContext = new ClassPathXmlApplicationContext("spring-config.xml");
    }





    @Test
    public void testSaveCheckoutPoint(){
        Checkoutpoint checkoutpoint = new Checkoutpoint();
        checkoutpoint.setCheckpointid(1);
        checkoutpoint.setProgram("h3333");
        checkoutpoint.setStudentid(1);
        checkoutpoint.setSavetime(new Date());
        checkoutpoint.setToaltime(3);
        GameService gameService = applicationContext.getBean(GameServiceImpl.class);
        gameService.saveCheckoutPoint(checkoutpoint);
    }


    @Test
    public void getStudentIsSuccess(){
        GameService gameService = applicationContext.getBean(GameServiceImpl.class);
        List<Checkoutpoint> checkoutpoints = gameService.getSuccessMessageByStudent(1);
        for(int i=0;i<checkoutpoints.size();i++){
            System.out.println(checkoutpoints.get(i));
        }
    }
}
