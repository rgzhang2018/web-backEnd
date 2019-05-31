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

    /**
    * @Description: admin登录验证
    * @Param: [admin, request]
    * @return: boolean
    * @Author: rgzhang
    */
    boolean adminLogin(Admin admin, HttpServletRequest request);


    /**
    * @Description: admin注册
    * @Param: [admin, request]
    * @return: boolean
    * @Author: rgzhang
    */
    boolean adminRegister(Admin admin, HttpServletRequest request);

    /**
    * @Description: 修改admin密码
    * @Param: [admin, newPassword]
    * @return: boolean
    * @Author: rgzhang
    */
    boolean changeAdminPassword(Admin admin,String newPassword);







}
