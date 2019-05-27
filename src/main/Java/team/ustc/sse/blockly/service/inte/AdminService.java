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


    boolean changeAdminPassword(Admin admin,String newPassword);



    List<Student> getAllStudents();


    List<Studentlogin> getAllStudentLogins() ;


    List<Studentloginmessage> getTenStudentLoginMessages();

    List<Studentloginmessage> getStudentLoginMessages(int studentID);


    List<Studentloginmessage> getStudentLoginMessages(String studentAccount);


    List<Checkoutpoint> getCheckoutpointByStudentID(int studentID);


    boolean deleteStudentByAccount(String studentAccount);

    boolean changeStudentPassword(String studentAccount,String newPassword);


}
