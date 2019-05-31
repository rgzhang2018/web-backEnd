package team.ustc.sse.blockly.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import team.ustc.sse.blockly.entity.*;
import team.ustc.sse.blockly.mapper.*;
import team.ustc.sse.blockly.service.inte.AdminService;
import team.ustc.sse.blockly.util.SessionUtil;
import team.ustc.sse.blockly.util.TimeUtil;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.List;

/**
 * description:
 * author: rgzhang
 * create time: 2019-05-26
 **/
@Service
public class AdminServiceImpl implements AdminService {

    private final  AdminMapper adminMapper;

    public AdminServiceImpl(AdminMapper adminMapper) {
        this.adminMapper = adminMapper;
    }


    @Override
    public boolean adminLogin(Admin admin, HttpServletRequest request) {
        AdminExample adminExample = new AdminExample();
        AdminExample.Criteria criteria = adminExample.createCriteria();
        criteria.andAdminaccountEqualTo(admin.getAdminaccount());
        Admin adminInDB = adminMapper.selectByExample(adminExample).get(0);
        if(adminInDB == null || !adminInDB.getAdminpassword().equals(admin.getAdminpassword())){
            return false;
        }
        SessionUtil.setAdminLogin(adminInDB,request);
        return true;
    }

    @Override
    public boolean adminRegister(Admin admin, HttpServletRequest request) {
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




}
