package src;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import team.ustc.sse.blockly.entity.Checkoutpoint;
import team.ustc.sse.blockly.service.impl.GameServiceImpl;
import team.ustc.sse.blockly.service.inte.GameService;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;
import java.util.Date;

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
        checkoutpoint.setProgram("hello");
        checkoutpoint.setStudentid(1);
        checkoutpoint.setSavetime(new Date());

        GameService gameService = applicationContext.getBean(GameServiceImpl.class);
        gameService.saveCheckoutPoint(checkoutpoint);
    }
}
