package team.ustc.sse.blockly.entity;

public class Bbstalk {
    private Integer talkid;

    private Integer studentid;

    private Integer bbsid;
    private Integer talkto;

    private Integer likecount;

    private String bbstalkmessage;


    public Integer getTalkid() {
        return talkid;
    }

    public Bbstalk setTalkid(Integer talkid) {
        this.talkid = talkid;
        return this;
    }

    public Integer getStudentid() {
        return studentid;
    }

    public Bbstalk setStudentid(Integer studentid) {
        this.studentid = studentid;
        return this;
    }

    public Integer getBbsid() {
        return bbsid;
    }

    public Bbstalk setBbsid(Integer bbsid) {
        this.bbsid = bbsid;
        return this;
    }

    public Integer getTalkto() {
        return talkto;
    }

    public Bbstalk setTalkto(Integer talkto) {
        this.talkto = talkto;
        return this;
    }

    public Integer getLikecount() {
        return likecount;
    }

    public Bbstalk setLikecount(Integer likecount) {
        this.likecount = likecount;
        return this;
    }

    public String getBbstalkmessage() {
        return bbstalkmessage;
    }

    public Bbstalk setBbstalkmessage(String bbstalkmessage) {
        this.bbstalkmessage = bbstalkmessage;
        return this;
    }

    @Override
    public String toString() {
        return "Bbstalk{" +
                "talkid=" + talkid +
                ", studentid=" + studentid +
                ", bbsid=" + bbsid +
                ", talkto=" + talkto +
                ", likecount=" + likecount +
                ", bbstalkmessage='" + bbstalkmessage + '\'' +
                '}';
    }
}