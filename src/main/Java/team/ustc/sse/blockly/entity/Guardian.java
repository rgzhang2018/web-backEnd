package team.ustc.sse.blockly.entity;

public class Guardian {
    private Integer guardianid;

    private String guardianname;

    private String guardianpassword;

    private String guardianemail;

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

    public String getGuardianpassword() {
        return guardianpassword;
    }

    public void setGuardianpassword(String guardianpassword) {
        this.guardianpassword = guardianpassword == null ? null : guardianpassword.trim();
    }

    public String getGuardianemail() {
        return guardianemail;
    }

    public void setGuardianemail(String guardianemail) {
        this.guardianemail = guardianemail == null ? null : guardianemail.trim();
    }
}