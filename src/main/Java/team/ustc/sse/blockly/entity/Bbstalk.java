package team.ustc.sse.blockly.entity;

import java.util.Date;

public class Bbstalk {
    private Integer talkid;

    private Integer studentid;

    private Integer bbsid;

    private Integer talkto;

    private Integer likecount;

    private String bbstalkmessage;

    private Date bbstalktime;

    public Integer getTalkid() {
        return talkid;
    }

    public void setTalkid(Integer talkid) {
        this.talkid = talkid;
    }

    public Integer getStudentid() {
        return studentid;
    }

    public void setStudentid(Integer studentid) {
        this.studentid = studentid;
    }

    public Integer getBbsid() {
        return bbsid;
    }

    public void setBbsid(Integer bbsid) {
        this.bbsid = bbsid;
    }

    public Integer getTalkto() {
        return talkto;
    }

    public void setTalkto(Integer talkto) {
        this.talkto = talkto;
    }

    public Integer getLikecount() {
        return likecount;
    }

    public void setLikecount(Integer likecount) {
        this.likecount = likecount;
    }

    public String getBbstalkmessage() {
        return bbstalkmessage;
    }

    public void setBbstalkmessage(String bbstalkmessage) {
        this.bbstalkmessage = bbstalkmessage == null ? null : bbstalkmessage.trim();
    }

    public Date getBbstalktime() {
        return bbstalktime;
    }

    public void setBbstalktime(Date bbstalktime) {
        this.bbstalktime = bbstalktime;
    }
}