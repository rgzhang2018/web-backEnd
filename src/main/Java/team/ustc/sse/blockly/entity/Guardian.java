package team.ustc.sse.blockly.entity;

public class Guardian {
    private Integer guardianid;

    private String guardianname;

    private String guardianpassword;

    private String guardianemail;

    public Integer getGuardianid() {
        return guardianid;
    }

    public Guardian setGuardianid(Integer guardianid) {
        this.guardianid = guardianid;
        return this;
    }

    public String getGuardianname() {
        return guardianname;
    }

    public Guardian setGuardianname(String guardianname) {
        this.guardianname = guardianname;
        return this;
    }

    public String getGuardianpassword() {
        return guardianpassword;
    }

    public Guardian setGuardianpassword(String guardianpassword) {
        this.guardianpassword = guardianpassword;
        return this;
    }

    public String getGuardianemail() {
        return guardianemail;
    }

    public Guardian setGuardianemail(String guardianemail) {
        this.guardianemail = guardianemail;
        return this;
    }

    @Override
    public String toString() {
        return "Guardian{" +
                "guardianid=" + guardianid +
                ", guardianname='" + guardianname + '\'' +
                ", guardianpassword='" + guardianpassword + '\'' +
                ", guardianemail='" + guardianemail + '\'' +
                '}';
    }
}