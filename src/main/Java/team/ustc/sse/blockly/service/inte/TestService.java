package team.ustc.sse.blockly.service.inte;


import org.springframework.stereotype.Service;
import team.ustc.sse.blockly.entity.Student;

import java.util.List;

/**
 * @program: childrenCode
 * @description: student的service接口
 * @author: rgzhang
 * @create: 2019-03-11 20:31
 **/


public interface TestService {

    List<Student> getList();

    /**
    * @Description: getStudentPassword 验证登录信息
    * @Param: []
    * @return: java.lang.String
    * @Author: rgzhang
    * @Date: 2019/3/11
    */
    String getPassword();

    void insertStudent();

    void testSaySomething();
}
