package team.ustc.sse.blockly.service.inte;

import team.ustc.sse.blockly.entity.Student;
import team.ustc.sse.blockly.entity.Studentlogin;

public interface LoginService {



    /**
    * @Description: 登录检测确认信息
    * @Param: [studentlogin]
    * @return: boolean
    * @Author: rgzhang
    */
    boolean studentLogin(Studentlogin studentlogin, boolean remember);


    /**
     * @Description: 新建用户
     * @Param: [studentlogin]
     * @return: void
     * @Author: rgzhang
     */
    boolean studentRegister(Studentlogin studentlogin, Student student);

    /**
    * @Description: 根据账户名查找用户
    * @Param: [account]
    * @return: team.ustc.sse.blockly.entity.Studentlogin
    * @Author: rgzhang
    */
    Studentlogin findByStudentAccount(String account) ;





    /**
    * @Description: 根据用户名更新
    * @Param: [name, studentlogin]
    * @return: void
    * @Author: rgzhang
    */
    void updateByStudentNickname(String name, Studentlogin studentlogin);

}
