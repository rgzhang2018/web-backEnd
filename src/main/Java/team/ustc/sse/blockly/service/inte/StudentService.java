package team.ustc.sse.blockly.service.inte;

import team.ustc.sse.blockly.entity.Student;
import team.ustc.sse.blockly.entity.Studentlogin;
import team.ustc.sse.blockly.entity.Studentloginmessage;

import java.util.List;

public interface StudentService {


    /**
     * @Description: 获得所有学生列表
     * @Param: []
     * @return: java.util.List<team.ustc.sse.blockly.entity.Student>
     * @Author: rgzhang
     */
    List<Student> getAllStudents();



    /**
     * @Description: 获得所有的学生账户信息
     * @Param: []
     * @return: java.util.List<team.ustc.sse.blockly.entity.Studentlogin>
     * @Author: rgzhang
     */
    List<Studentlogin> getAllStudentLogins() ;

    /**
     * @Description: 获得最近的10次学生登录信息（ip，地址）
     * @Param: []
     * @return: java.util.List<team.ustc.sse.blockly.entity.Studentloginmessage>
     * @Author: rgzhang
     */
    List<Studentloginmessage> getTenStudentLoginMessages();

    /**
     * @Description: 通过日期得到该日期之后的所有登录信息（ip，地址）
     * @Param: [pastDay]
     * @return: java.util.List<team.ustc.sse.blockly.entity.Studentloginmessage>
     * @Author: rgzhang
     */
    List<Studentloginmessage> getLoginMessagePast(int pastDay);

    /**
     * @Description: 通过ID得到学生登录信息（ip，登录日期等）
     * @Param: [studentID]
     * @return: java.util.List<team.ustc.sse.blockly.entity.Studentloginmessage>
     * @Author: rgzhang
     */
    List<Studentloginmessage> getStudentLoginMessages(int studentID);

    /**
     * @Description: 通过用户名得到学生登录信息（ip，登录日期等）
     * @Param: [studentAccount]
     * @return: java.util.List<team.ustc.sse.blockly.entity.Studentloginmessage>
     * @Author: rgzhang
     */
    List<Studentloginmessage> getStudentLoginMessages(String studentAccount);

    /**
     * @Description: 删除学生信息
     * @Param: [studentAccount]
     * @return: boolean
     * @Author: rgzhang
     */
    boolean deleteStudentByAccount(String studentAccount);

    /**
     * @Description: 修改学生密码
     * @Param: [studentAccount, newPassword]
     * @return: boolean
     * @Author: rgzhang
     */
    boolean changeStudentPassword(String studentAccount,String newPassword);

    /**
     * @Description: 修改学生信息
     * @Param: [student]
     * @return: boolean
     * @Author: rgzhang
     */
    boolean changeStudentMessage(Student student);

    /**
     * @Description: 通过ID获得对应学生信息
     * @Param: [studentid]
     * @return: team.ustc.sse.blockly.entity.Student
     * @Author: rgzhang
     */
    Student getStudentMessageByID(int studentid);

    /**
     * @Description: 通过id获得学生登录信息
     * @Param: [studentid]
     * @return: team.ustc.sse.blockly.entity.Studentlogin
     * @Author: rgzhang
     */
    Studentlogin getStudenloginByID(int studentid);

}
