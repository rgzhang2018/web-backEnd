package team.ustc.sse.blockly.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import team.ustc.sse.blockly.entity.Student;
import team.ustc.sse.blockly.entity.StudentExample;
import team.ustc.sse.blockly.entity.User;
import team.ustc.sse.blockly.mapper.StudentMapper;
import team.ustc.sse.blockly.service.inte.LoginService;

import java.util.List;

@Service
public class StudentLoginServiceImpl implements LoginService {

    private final StudentMapper studentMapper;

    //注：idea建议 使用构造器的方式注入，而非@Autowired
    public StudentLoginServiceImpl(StudentMapper studentMapper) {
        this.studentMapper = studentMapper;
    }

    @Override
    public boolean loginCheck(Student student) {

        Student studentInDB = (Student) findByAccount(student.getStudentaccount());
        if(studentInDB.getStudentpassword().equals(student.getStudentpassword())){
            setLoginSession(student);
            return true;
        }
        return false;
    }

    @Override
    public User findByAccount(String account) {
        StudentExample studentExample = new StudentExample();
        StudentExample.Criteria criteria = studentExample.createCriteria();
        criteria.andStudentaccountEqualTo(account);
        List<Student> studentList = studentMapper.selectByExample(studentExample);
        return (User)studentList.get(0);
    }

    @Override
    public void saveNewUser(User user) {

        Student student = (Student) user;
        studentMapper.insert(student);
    }

    @Override
    public void updateByName(String name, User user) {

    }


    private void setLoginSession(Student student){

    }
}
