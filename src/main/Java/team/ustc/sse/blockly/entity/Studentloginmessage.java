package team.ustc.sse.blockly.entity;

import java.util.Date;

public class Studentloginmessage {
    private Integer studentloginid;

    private Integer studentid;

    private String loginip;

    private Date logindata;

    private String loginmessage;    //格式为：用户名(后期可以改为签到状态)

    public Integer getStudentloginid() {
        return studentloginid;
    }

    public Studentloginmessage setStudentloginid(Integer studentloginid) {
        this.studentloginid = studentloginid;
        return this;
    }

    public Integer getStudentid() {
        return studentid;
    }

    public Studentloginmessage setStudentid(Integer studentid) {
        this.studentid = studentid;
        return this;
    }

    public String getLoginip() {
        return loginip;
    }

    public Studentloginmessage setLoginip(String loginip) {
        this.loginip = loginip;
        return this;
    }

    public Date getLogindata() {
        return logindata;
    }

    public Studentloginmessage setLogindata(Date logindata) {
        this.logindata = logindata;
        return this;
    }

    public String getLoginmessage() {
        return loginmessage;
    }

    public Studentloginmessage setLoginmessage(String loginmessage) {
        this.loginmessage = loginmessage;
        return this;
    }
}