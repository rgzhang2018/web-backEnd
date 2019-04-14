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

    public Student setStudentid(Integer studentid) {
        this.studentid = studentid;
        return this;
    }

    public String getStudentname() {
        return studentname;
    }

    public Student setStudentname(String studentname) {
        this.studentname = studentname;
        return this;
    }

    public String getStudentgender() {
        return studentgender;
    }

    public Student setStudentgender(String studentgender) {
        this.studentgender = studentgender;
        return this;
    }

    public String getStudentemail() {
        return studentemail;
    }

    public Student setStudentemail(String studentemail) {
        this.studentemail = studentemail;
        return this;
    }

    public Integer getStudentage() {
        return studentage;
    }

    public Student setStudentage(Integer studentage) {
        this.studentage = studentage;
        return this;
    }

    public String getStudentphone() {
        return studentphone;
    }

    public Student setStudentphone(String studentphone) {
        this.studentphone = studentphone;
        return this;
    }

    public String getStudentschool() {
        return studentschool;
    }

    public Student setStudentschool(String studentschool) {
        this.studentschool = studentschool;
        return this;
    }

    public String getStudentnumber() {
        return studentnumber;
    }

    public Student setStudentnumber(String studentnumber) {
        this.studentnumber = studentnumber;
        return this;
    }

    public String getStudentgrade() {
        return studentgrade;
    }

    public Student setStudentgrade(String studentgrade) {
        this.studentgrade = studentgrade;
        return this;
    }

    public String getStudentremark() {
        return studentremark;
    }

    public Student setStudentremark(String studentremark) {
        this.studentremark = studentremark;
        return this;
    }

    public Date getStudentregistertime() {
        return studentregistertime;
    }

    public Student setStudentregistertime(Date studentregistertime) {
        this.studentregistertime = studentregistertime;
        return this;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentid=" + studentid +
                ", studentname='" + studentname + '\'' +
                ", studentgender='" + studentgender + '\'' +
                ", studentemail='" + studentemail + '\'' +
                ", studentage=" + studentage +
                ", studentphone='" + studentphone + '\'' +
                ", studentschool='" + studentschool + '\'' +
                ", studentnumber='" + studentnumber + '\'' +
                ", studentgrade='" + studentgrade + '\'' +
                ", studentremark='" + studentremark + '\'' +
                ", studentregistertime=" + studentregistertime +
                '}';
    }
}