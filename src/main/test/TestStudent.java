package team.ustc.sse.blockly.test;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import team.ustc.sse.blockly.entity.Student;
import team.ustc.sse.blockly.entity.StudentExample;
import team.ustc.sse.blockly.mapper.StudentMapper;


import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;
import java.util.List;

/**
 * @program: childrenCode
 * @description: 测试数据库和连接池的配置
 * @author: rgzhang
 * @create: 2019-03-10 22:18
 **/

public class TestStudent {


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
        applicationContext = new ClassPathXmlApplicationContext("spring-config.xml");
    }



    @Test
    public void ss(){
        ThreadMXBean threadMXBean = ManagementFactory.getThreadMXBean();

        ThreadInfo[] threadInfos = threadMXBean.dumpAllThreads(false,false);

        for (ThreadInfo info : threadInfos
        ) {
            System.out.println("[" + info.getThreadId() + "]" + info.getThreadName());
        }

        System.out.println(Thread.activeCount());
    }

    @Test
    public void testUpdate(){
        //获取到由spring控制mybatis创建的studentMapper的实现类
        StudentMapper studentMapper = applicationContext.getBean(StudentMapper.class);
        StudentExample studentExample = new StudentExample();
        //设置criteria的查询条件，需要注意，这里的模糊查询等仍然需要自己加上对应符号
        studentExample.createCriteria().andStudentnameLike("%张%");
        //最后把studentExample传入到dao中进行查询
        List<Student> studentList = studentMapper.selectByExample(studentExample);
        System.out.println("查询到"+studentList.size()+"条数据");
        for(Student student :studentList){
            System.out.println(student);
        }

        //注意，用完之后一定不要关闭连接池
    }



}
