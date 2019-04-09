package team.ustc.sse.blockly.service.inte;

import team.ustc.sse.blockly.entity.User;

import java.util.List;

public interface LoginService {



    //登录检测
    boolean loginCheck(String account);

    //根据账户名查找用户
    User findByAccount(String account) ;


    //新建用户
    void saveNewUser(User user) ;


    //根据用户名更新
    void updateByName(String name, User user);

}
