package team.ustc.sse.blockly.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import team.ustc.sse.blockly.entity.*;
import team.ustc.sse.blockly.mapper.StudentMapper;
import team.ustc.sse.blockly.mapper.StudentloginMapper;
import team.ustc.sse.blockly.mapper.StudentloginmessageMapper;
import team.ustc.sse.blockly.service.inte.StudentService;
import team.ustc.sse.blockly.util.TimeUtil;

import java.util.Date;
import java.util.List;

/**
 * description:
 * author: rgzhang
 * create time: 2019-05-31
 **/
@Service
public class StudentServiceImpl implements StudentService {
    private final StudentMapper studentMapper;

    private final StudentloginMapper studentloginMapper;


    private final StudentloginmessageMapper studentloginmessageMapper;

    public StudentServiceImpl(StudentMapper studentMapper, StudentloginMapper studentloginMapper, StudentloginmessageMapper studentloginmessageMapper) {
        this.studentMapper = studentMapper;
        this.studentloginMapper = studentloginMapper;
        this.studentloginmessageMapper = studentloginmessageMapper;
    }

    @Override
    public boolean deleteStudentByAccount(String studentAccount) {
        return false;
    }

    @Override
    public boolean changeStudentPassword(String studentAccount,String newPassword) {
        int studentID = getStudentIdByAccount(studentAccount);

        return false;
    }

    @Override
    public boolean changeStudentMessage(Student student) {
        studentMapper.updateByPrimaryKey(student);
        return false;
    }

    @Override
    public Student getStudentMessageByID(int studentid) {
        return studentMapper.selectByPrimaryKey(studentid);
    }

    @Override
    public Studentlogin getStudenloginByID(int studentid) {
        return studentloginMapper.selectByPrimaryKey(studentid);
    }

    @Override
    public List<Student> getAllStudents() {
        StudentExample studentExample = new StudentExample();
        StudentExample.Criteria criteria = studentExample.createCriteria();
        criteria.andStudentidBetween(0,10); //前10条学生信息
        List<Student> students = studentMapper.selectByExample(studentExample);
        return students;
    }

    @Override
    public List<Studentlogin> getAllStudentLogins() {
        StudentloginExample studentloginExample = new StudentloginExample();
        StudentloginExample.Criteria criteria = studentloginExample.createCriteria();
        criteria.andStudentidIsNotNull();
        List<Studentlogin> studentlogins = studentloginMapper.selectByExample(studentloginExample);
        return studentlogins;
    }

    @Override
    public List<Studentloginmessage> getTenStudentLoginMessages() {
        List<Studentloginmessage> lists = studentloginmessageMapper.selectLastTen();
        return lists;
    }

    @Override
    public List<Studentloginmessage> getLoginMessagePast(int pastDay) {
        Date date = TimeUtil.getPastDate(new Date(),pastDay);
        StudentloginmessageExample studentloginmessageExample = new StudentloginmessageExample();
        StudentloginmessageExample.Criteria criteria = studentloginmessageExample.createCriteria();
        criteria.andLogindataGreaterThanOrEqualTo(date);
        List<Studentloginmessage> list = studentloginmessageMapper.selectByExample(studentloginmessageExample);
        return list;
    }

    @Override
    public List<Studentloginmessage> getStudentLoginMessages(int studentID) {
        StudentloginmessageExample studentloginmessageExample = new StudentloginmessageExample();
        StudentloginmessageExample.Criteria criteria = studentloginmessageExample.createCriteria();
        criteria.andStudentidEqualTo(studentID);
        List<Studentloginmessage> studentloginmessages = studentloginmessageMapper.selectByExample(studentloginmessageExample);
        return studentloginmessages;
    }

    @Override
    public List<Studentloginmessage> getStudentLoginMessages(String studentAccount) {
        int id = getStudentIdByAccount(studentAccount);
        return getStudentLoginMessages(id);
    }


    private int getStudentIdByAccount(String studentAccount){
        StudentloginExample studentExample = new StudentloginExample();
        StudentloginExample.Criteria criteria = studentExample.createCriteria();
        criteria.andStudentaccountEqualTo(studentAccount);
        List<Studentlogin> studentList = studentloginMapper.selectByExample(studentExample);
        if(studentList.isEmpty()){
            return -1;
        }
        return studentList.get(0).getStudentid();
    }
}
