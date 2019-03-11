package team.ustc.sse.blockly.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import team.ustc.sse.blockly.entity.Student;
import team.ustc.sse.blockly.mapper.StudentMapper;
import team.ustc.sse.blockly.service.inte.TestService;

import java.util.List;

/**
 * @program: childrenCode
 * @description: student的service
 * @author: rgzhang
 * @create: 2019-03-11 20:31
 **/
@Service
public class TestServiceImpl implements TestService {

    final
    private StudentMapper studentMapper;

    @Autowired
    public TestServiceImpl(StudentMapper studentMapper) {
        this.studentMapper = studentMapper;
    }

    @Override
    public List<Student> getList() {
        return null;
    }

    @Override
    public String getPassword() {
        System.out.println("1234");
        return "1234";
    }


    /**
    * @Description: 测试：注入一个studentMapper，并且向其中插入数据
    * @Param: []
    * @return: void
    * @Author: rgzhang
    * @Date: 2019/3/11
    */
    @Override
    public void insertStudent() {
        Student student = new Student();
        student.setStudentaccount("12343");
        student.setStudentgender("1");
        student.setStudentname("注册的人");
        student.setStudentpassword("1234567");
        studentMapper.insert(student);
    }
}
