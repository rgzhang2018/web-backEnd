package team.ustc.sse.blockly.entity;

public class Studentlogin {
    private Integer studentid;

    private String studentaccount;

    private String studentpassword;

    private String nickname;

    public Integer getStudentid() {
        return studentid;
    }

    public void setStudentid(Integer studentid) {
        this.studentid = studentid;
    }

    public String getStudentaccount() {
        return studentaccount;
    }

    public void setStudentaccount(String studentaccount) {
        this.studentaccount = studentaccount == null ? null : studentaccount.trim();
    }

    public String getStudentpassword() {
        return studentpassword;
    }

    public void setStudentpassword(String studentpassword) {
        this.studentpassword = studentpassword == null ? null : studentpassword.trim();
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    @Override
    public String toString() {
        return "Studentlogin{" +
                "studentid=" + studentid +
                ", studentaccount='" + studentaccount + '\'' +
                ", studentpassword='" + studentpassword + '\'' +
                ", nickname='" + nickname + '\'' +
                '}';
    }
}