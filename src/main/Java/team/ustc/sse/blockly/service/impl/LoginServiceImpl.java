package team.ustc.sse.blockly.service.impl;

import org.springframework.stereotype.Service;
import team.ustc.sse.blockly.entity.Studentlogin;
import team.ustc.sse.blockly.entity.StudentloginExample;
import team.ustc.sse.blockly.mapper.StudentloginMapper;
import team.ustc.sse.blockly.service.inte.LoginService;

import java.util.List;

@Service
public class LoginServiceImpl implements LoginService {

    private final StudentloginMapper studentloginMapper;

    //注：idea建议 使用构造器的方式注入，而非@Autowired
    public LoginServiceImpl(StudentloginMapper studentloginMapper) {
        this.studentloginMapper = studentloginMapper;
    }

    @Override
    public boolean studentLoginCheck(Studentlogin studentlogin) {

        Studentlogin studentInDB =  findByStudentAccount(studentlogin.getStudentaccount());
        if(studentInDB.getStudentpassword().equals(studentlogin.getStudentpassword())){
            setLoginSession(studentlogin);
            return true;
        }
        return false;
    }



    @Override
    public Studentlogin findByStudentAccount(String account) {
        StudentloginExample studentExample = new StudentloginExample();
        StudentloginExample.Criteria criteria = studentExample.createCriteria();
        criteria.andStudentaccountEqualTo(account);
        List<Studentlogin> studentList = studentloginMapper.selectByExample(studentExample);
        return studentList.get(0);
    }


    @Override
    public void saveNewStudent(Studentlogin studentlogin) {


        studentloginMapper.insert(studentlogin);
    }

    @Override
    public void updateByStudentNickname(String name, Studentlogin studentlogin) {

    }


    private void setLoginSession(Studentlogin studentlogin){

    }
}
