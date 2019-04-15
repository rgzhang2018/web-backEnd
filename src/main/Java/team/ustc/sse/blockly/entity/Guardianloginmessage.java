package team.ustc.sse.blockly.entity;

import java.util.Date;

public class Guardianloginmessage {
    private Integer guardianloginid;

    private String guardianid;

    private String loginip;

    private Date logindata;

    private String loginmessage;

    public Integer getGuardianloginid() {
        return guardianloginid;
    }

    public void setGuardianloginid(Integer guardianloginid) {
        this.guardianloginid = guardianloginid;
    }

    public String getGuardianid() {
        return guardianid;
    }

    public void setGuardianid(String guardianid) {
        this.guardianid = guardianid == null ? null : guardianid.trim();
    }

    public String getLoginip() {
        return loginip;
    }

    public void setLoginip(String loginip) {
        this.loginip = loginip == null ? null : loginip.trim();
    }

    public Date getLogindata() {
        return logindata;
    }

    public void setLogindata(Date logindata) {
        this.logindata = logindata;
    }

    public String getLoginmessage() {
        return loginmessage;
    }

    public void setLoginmessage(String loginmessage) {
        this.loginmessage = loginmessage == null ? null : loginmessage.trim();
    }
}