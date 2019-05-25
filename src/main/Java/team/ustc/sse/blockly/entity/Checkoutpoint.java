package team.ustc.sse.blockly.entity;

import java.util.Date;

public class Checkoutpoint extends CheckoutpointKey {
    private Integer toaltime;

    private String program;

    private Date savetime;

    private Integer issuccess;

    public Integer getToaltime() {
        return toaltime;
    }

    public void setToaltime(Integer toaltime) {
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

    public Integer getIssuccess() {
        return issuccess;
    }

    public void setIssuccess(Integer issuccess) {
        this.issuccess = issuccess;
    }

    @Override
    public String toString() {
        return "Checkoutpoint{" +
                "toaltime=" + toaltime +
                ", program='" + program + '\'' +
                ", savetime=" + savetime +
                ", issuccess=" + issuccess +
                '}';
    }
}