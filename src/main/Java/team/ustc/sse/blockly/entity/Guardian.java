package team.ustc.sse.blockly.entity;

import java.util.Date;

public class Guardian {
    private Integer guardianid;

    private String guardianname;

    private String guardiangender;

    private String guardianemail;

    private Integer guardianage;

    private String guardianphone;

    private String guardianaddress;

    private String guardianremark;

    private Date guardianregistertime;

    public Integer getGuardianid() {
        return guardianid;
    }

    public void setGuardianid(Integer guardianid) {
        this.guardianid = guardianid;
    }

    public String getGuardianname() {
        return guardianname;
    }

    public void setGuardianname(String guardianname) {
        this.guardianname = guardianname == null ? null : guardianname.trim();
    }

    public String getGuardiangender() {
        return guardiangender;
    }

    public void setGuardiangender(String guardiangender) {
        this.guardiangender = guardiangender == null ? null : guardiangender.trim();
    }

    public String getGuardianemail() {
        return guardianemail;
    }

    public void setGuardianemail(String guardianemail) {
        this.guardianemail = guardianemail == null ? null : guardianemail.trim();
    }

    public Integer getGuardianage() {
        return guardianage;
    }

    public void setGuardianage(Integer guardianage) {
        this.guardianage = guardianage;
    }

    public String getGuardianphone() {
        return guardianphone;
    }

    public void setGuardianphone(String guardianphone) {
        this.guardianphone = guardianphone == null ? null : guardianphone.trim();
    }

    public String getGuardianaddress() {
        return guardianaddress;
    }

    public void setGuardianaddress(String guardianaddress) {
        this.guardianaddress = guardianaddress == null ? null : guardianaddress.trim();
    }

    public String getGuardianremark() {
        return guardianremark;
    }

    public void setGuardianremark(String guardianremark) {
        this.guardianremark = guardianremark == null ? null : guardianremark.trim();
    }

    public Date getGuardianregistertime() {
        return guardianregistertime;
    }

    public void setGuardianregistertime(Date guardianregistertime) {
        this.guardianregistertime = guardianregistertime;
    }
}