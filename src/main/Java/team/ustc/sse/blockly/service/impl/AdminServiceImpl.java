package team.ustc.sse.blockly.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import team.ustc.sse.blockly.entity.*;
import team.ustc.sse.blockly.mapper.*;
import team.ustc.sse.blockly.service.inte.AdminService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * description:
 * author: rgzhang
 * create time: 2019-05-26
 **/
@Service
public class AdminServiceImpl implements AdminService {
    @Autowired
    AdminMapper adminMapper;

    @Autowired
    StudentMapper studentMapper;

    @Autowired
    StudentloginMapper studentloginMapper;

    @Autowired
    StudentloginmessageMapper studentloginmessageMapper;

    @Autowired
    CheckoutpointMapper checkoutpointMapper;

    @Override
    public boolean adminLogin(Admin admin, HttpServletRequest request) {
        AdminExample adminExample = new AdminExample();
        AdminExample.Criteria criteria = adminExample.createCriteria();
        criteria.andAdminaccountEqualTo(admin.getAdminaccount());
        Admin adminInDB = adminMapper.selectByExample(adminExample).get(0);
        if(adminInDB == null || !adminInDB.getAdminpassword().equals(admin.getAdminpassword())){
            return false;
        }

        //把admin信息写入session
        HttpSession session = request.getSession();
        //set session
        session.setAttribute("loginFlag",true);
        session.setAttribute("AdminFlag",true);
        session.setAttribute("adminAccount",admin.getAdminaccount());
        System.out.println("======> set admin session in adminService");
        return true;
    }

    @Override
    public boolean adminRegister(Admin admin, HttpServletRequest request) {
        return false;
    }

    @Override
    public List<Student> getAllStudents() {
        StudentExample studentExample = new StudentExample();
        StudentExample.Criteria criteria = studentExample.createCriteria();
        criteria.andStudentidIsNotNull();
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

    @Override
    public List<Checkoutpoint> getCheckoutpointByStudentID(int studentID) {
        CheckoutpointExample checkoutpointExample = new CheckoutpointExample();
        CheckoutpointExample.Criteria criteria = checkoutpointExample.createCriteria();
        criteria.andStudentidEqualTo(studentID);
        return checkoutpointMapper.selectByExample(checkoutpointExample);
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
    public boolean changeAdminPassword(Admin admin, String newPassword) {
        AdminExample adminExample = new AdminExample();
        AdminExample.Criteria criteria = adminExample.createCriteria();
        criteria.andAdminaccountEqualTo(admin.getAdminaccount());
        admin.setAdminpassword(newPassword);
        int flag = adminMapper.updateByExample(admin,adminExample);
        return flag==1;
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
