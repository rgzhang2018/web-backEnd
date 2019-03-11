package team.ustc.sse.blockly.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import team.ustc.sse.blockly.service.inte.TestService;

/**
 * @program: childrenCode
 * @description: 对Spring的ioc、di、aop测试
 * @author: rgzhang
 * @create: 2019-03-11 21:20
 **/

public class testSpring {


    /**
    * @Description: 1.通过IOC控制TestService
     * 2.在TestService通过DI注入一个StudentMapper（注：StudentMapper已经由MyBatis实现了IOC）
    * @Param: []
    * @return: void
    * @Author: rgzhang
    * @Date: 2019/3/11
    */
    @Test
    public void testIoc(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring-config.xml");
        TestService testService =  applicationContext.getBean(TestService.class);
        testService.insertStudent();
    }
}
