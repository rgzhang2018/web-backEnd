package team.ustc.sse.blockly.entity;

import java.util.Date;

public class Student {
    private Integer studentid;

    private String studentname;

    private String studentgender;

    private String studentemail;

    private Integer studentage;

    private String studentphone;

    private String studentschool;

    private String studentnumber;

    private String studentgrade;

    private String studentremark;

    private Date studentregistertime;

    public Integer getStudentid() {
        return studentid;
    }

    public void setStudentid(Integer studentid) {
        this.studentid = studentid;
    }

    public String getStudentname() {
        return studentname;
    }

    public void setStudentname(String studentname) {
        this.studentname = studentname == null ? null : studentname.trim();
    }

    public String getStudentgender() {
        return studentgender;
    }

    public void setStudentgender(String studentgender) {
        this.studentgender = studentgender == null ? null : studentgender.trim();
    }

    public String getStudentemail() {
        return studentemail;
    }

    public void setStudentemail(String studentemail) {
        this.studentemail = studentemail == null ? null : studentemail.trim();
    }

    public Integer getStudentage() {
        return studentage;
    }

    public void setStudentage(Integer studentage) {
        this.studentage = studentage;
    }

    public String getStudentphone() {
        return studentphone;
    }

    public void setStudentphone(String studentphone) {
        this.studentphone = studentphone == null ? null : studentphone.trim();
    }

    public String getStudentschool() {
        return studentschool;
    }

    public void setStudentschool(String studentschool) {
        this.studentschool = studentschool == null ? null : studentschool.trim();
    }

    public String getStudentnumber() {
        return studentnumber;
    }

    public void setStudentnumber(String studentnumber) {
        this.studentnumber = studentnumber == null ? null : studentnumber.trim();
    }

    public String getStudentgrade() {
        return studentgrade;
    }

    public void setStudentgrade(String studentgrade) {
        this.studentgrade = studentgrade == null ? null : studentgrade.trim();
    }

    public String getStudentremark() {
        return studentremark;
    }

    public void setStudentremark(String studentremark) {
        this.studentremark = studentremark == null ? null : studentremark.trim();
    }

    public Date getStudentregistertime() {
        return studentregistertime;
    }

    public void setStudentregistertime(Date studentregistertime) {
        this.studentregistertime = studentregistertime;
    }
}