package team.ustc.sse.blockly.service.inte;


import team.ustc.sse.blockly.entity.User;

import java.util.List;

public interface StudentService {

    //根据名字查找用户
    List<User> findByName(String name) throws Exception;


    //根据id查找用户
    User findByID(String name) throws Exception;

    //根据ID删除
    void removeByID(String name) throws Exception;

    //根据用户名删除
    void removeByAccount(String account) throws Exception;




}
