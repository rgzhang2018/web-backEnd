package team.ustc.sse.blockly.service.inte;

import team.ustc.sse.blockly.entity.Studentlogin;

public interface LoginService {



    //登录检测
    boolean studentLoginCheck(Studentlogin studentlogin);

    //根据账户名查找用户
    Studentlogin findByStudentAccount(String account) ;


    //新建用户
    void saveNewStudent(Studentlogin studentlogin) ;


    //根据用户名更新
    void updateByStudentNickname(String name, Studentlogin studentlogin);

}
