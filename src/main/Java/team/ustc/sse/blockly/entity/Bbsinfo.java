package team.ustc.sse.blockly.entity;

import java.util.Date;

public class Bbsinfo {
    private Integer bbsid;

    private Integer studentid;

    private Date postdate;

    private String theme;

    public Integer getBbsid() {
        return bbsid;
    }

    public Bbsinfo setBbsid(Integer bbsid) {
        this.bbsid = bbsid;
        return this;
    }

    public Integer getStudentid() {
        return studentid;
    }

    public Bbsinfo setStudentid(Integer studentid) {
        this.studentid = studentid;
        return this;
    }

    public Date getPostdate() {
        return postdate;
    }

    public Bbsinfo setPostdate(Date postdate) {
        this.postdate = postdate;
        return this;
    }

    public String getTheme() {
        return theme;
    }

    public Bbsinfo setTheme(String theme) {
        this.theme = theme;
        return this;
    }
}