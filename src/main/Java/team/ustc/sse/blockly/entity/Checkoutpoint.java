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

    public Checkoutpoint setCheckoutpointid(Integer checkoutpointid) {
        this.checkoutpointid = checkoutpointid;
        return this;
    }

    public Integer getStudentid() {
        return studentid;
    }

    public Checkoutpoint setStudentid(Integer studentid) {
        this.studentid = studentid;
        return this;
    }

    public Integer getCheckpointid() {
        return checkpointid;
    }

    public Checkoutpoint setCheckpointid(Integer checkpointid) {
        this.checkpointid = checkpointid;
        return this;
    }

    public Date getToaltime() {
        return toaltime;
    }

    public Checkoutpoint setToaltime(Date toaltime) {
        this.toaltime = toaltime;
        return this;
    }

    public String getProgram() {
        return program;
    }

    public Checkoutpoint setProgram(String program) {
        this.program = program;
        return this;
    }

    public Date getSavetime() {
        return savetime;
    }

    public Checkoutpoint setSavetime(Date savetime) {
        this.savetime = savetime;
        return this;
    }

    @Override
    public String toString() {
        return "Checkoutpoint{" +
                "checkoutpointid=" + checkoutpointid +
                ", studentid=" + studentid +
                ", checkpointid=" + checkpointid +
                ", toaltime=" + toaltime +
                ", program='" + program + '\'' +
                ", savetime=" + savetime +
                '}';
    }
}