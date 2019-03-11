package team.ustc.sse.blockly.entity;

public class Student {
    private Integer studentid;

    private String studentname;

    private String studentpassword;

    private String studentgender;

    private String studentaccount;

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

    public String getStudentpassword() {
        return studentpassword;
    }

    public void setStudentpassword(String studentpassword) {
        this.studentpassword = studentpassword == null ? null : studentpassword.trim();
    }

    public String getStudentgender() {
        return studentgender;
    }

    public void setStudentgender(String studentgender) {
        this.studentgender = studentgender == null ? null : studentgender.trim();
    }

    public String getStudentaccount() {
        return studentaccount;
    }

    public void setStudentaccount(String studentaccount) {
        this.studentaccount = studentaccount == null ? null : studentaccount.trim();
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentid=" + studentid +
                ", studentname='" + studentname + '\'' +
                ", studentpassword='" + studentpassword + '\'' +
                ", studentgender='" + studentgender + '\'' +
                ", studentaccount='" + studentaccount + '\'' +
                '}';
    }
}