package team.ustc.sse.blockly.entity;

import java.util.Date;

public class Checkoutpoint {
    private Integer checkoutpointid;

    private Integer studentid;

    private Integer checkpointid;

    private Date toaltime;

    private String program;

    private Date savetime;

    public Integer getCheckoutpointid() {
        return checkoutpointid;
    }

    public void setCheckoutpointid(Integer checkoutpointid) {
        this.checkoutpointid = checkoutpointid;
    }

    public Integer getStudentid() {
        return studentid;
    }

    public void setStudentid(Integer studentid) {
        this.studentid = studentid;
    }

    public Integer getCheckpointid() {
        return checkpointid;
    }

    public void setCheckpointid(Integer checkpointid) {
        this.checkpointid = checkpointid;
    }

    public Date getToaltime() {
        return toaltime;
    }

    public void setToaltime(Date toaltime) {
        this.toaltime = toaltime;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program == null ? null : program.trim();
    }

    public Date getSavetime() {
        return savetime;
    }

    public void setSavetime(Date savetime) {
        this.savetime = savetime;
    }
}