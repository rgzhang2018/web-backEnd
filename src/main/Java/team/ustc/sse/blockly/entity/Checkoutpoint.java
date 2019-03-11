package team.ustc.sse.blockly.entity;

import java.util.Date;

public class Checkoutpoint {
    private Integer checkoutpointid;

    private Integer studentid;

    private Date toaltime;

    private String program;

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
}