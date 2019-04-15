package team.ustc.sse.blockly.entity;

public class Guardianlogin {
    private Integer guardianid;

    private String guardianaccount;

    private String guardianpassword;

    private String nickname;

    public Integer getGuardianid() {
        return guardianid;
    }

    public void setGuardianid(Integer guardianid) {
        this.guardianid = guardianid;
    }

    public String getGuardianaccount() {
        return guardianaccount;
    }

    public void setGuardianaccount(String guardianaccount) {
        this.guardianaccount = guardianaccount == null ? null : guardianaccount.trim();
    }

    public String getGuardianpassword() {
        return guardianpassword;
    }

    public void setGuardianpassword(String guardianpassword) {
        this.guardianpassword = guardianpassword == null ? null : guardianpassword.trim();
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }
}