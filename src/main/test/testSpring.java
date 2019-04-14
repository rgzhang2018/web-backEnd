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
//需要补充学习的内容@PostConstruct和@PreDestroy
//此外还有applicationContext生命周期，还有调用getBean之后，这个bean是一直存在的吗，还有怎么销毁多例创建出来的对象


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
    public void testIoc1(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-config.xml");
        TestService testService =  applicationContext.getBean(TestService.class);
//        testService.insertStudent();
    }



    @Test
    public void testIoc2() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-config.xml");
        TestService testService =  applicationContext.getBean(TestService.class);
//        testService.testSaySomething();

        testIoc3(testService);

    }

    private void testIoc3(TestService testService) {

//        testService.testSaySomething();
    }
}
