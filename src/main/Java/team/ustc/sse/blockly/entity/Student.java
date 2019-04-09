package team.ustc.sse.blockly.entity;

public class Student implements User{
    private Integer studentid;

    private String studentname;

    private String studentpassword;

    private String studentgender;

    private String studentaccount;




    /**
    * @Description: 重写了string就要重写hashcode方法。
    * @Param: [object]
    * @return: boolean
    * @Author: rgzhang
    * @Date: 2019/3/22
    */
    @Override
    public boolean equals(Object object){
        if(!(object instanceof Student))return false;
        Student student2 = (Student) object;
        return student2.studentid.equals(studentid)
                && student2.studentname.equals(studentname)
                && student2.studentpassword.equals(studentpassword);
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + studentid;
        result = 31 * result + (studentname == null ? 0 : studentname.hashCode());
        result = 31 * result + (studentpassword == null ? 0 : studentpassword.hashCode());
//        result = 31 * result + (mObj == null ? 0 : mObj.hashCode());
        return result;
    }

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

    public String getStudentpassword() {
        return studentpassword;
    }

    public Student setStudentpassword(String studentpassword) {
        this.studentpassword = studentpassword;
        return this;
    }

    public String getStudentgender() {
        return studentgender;
    }

    public Student setStudentgender(String studentgender) {
        this.studentgender = studentgender;
        return this;
    }

    public String getStudentaccount() {
        return studentaccount;
    }

    public Student setStudentaccount(String studentaccount) {
        this.studentaccount = studentaccount;
        return this;
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