package team.ustc.sse.blockly.service.inte;

import team.ustc.sse.blockly.entity.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * description:
 * author: rgzhang
 * create time: 2019-05-26
 **/
public interface AdminService {


    boolean adminLogin(Admin admin, HttpServletRequest request);



    boolean adminRegister(Admin admin, HttpServletRequest request);


    List<Studentlogin> getAllStudentLogins() ;


    List<Studentloginmessage> getStudnetLoginMessages(int studentID);


    List<Studentloginmessage> getStudnetLoginMessages(String studentAccount);


    List<Student> getAllStudents();


    List<Checkoutpoint> getCheckoutpointByStudentID();


    boolean deletStudentByAccount(String studentAccount);


    void changeAdminPassword(Admin admin,String newPassword);
}
