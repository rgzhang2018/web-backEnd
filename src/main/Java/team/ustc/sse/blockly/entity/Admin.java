package team.ustc.sse.blockly.entity;

public class Admin {
    private Integer adminid;

    private String adminaccount;

    private String adminpassword;

    private Integer adminleval;

    private String adminmessage;

    public Integer getAdminid() {
        return adminid;
    }

    public void setAdminid(Integer adminid) {
        this.adminid = adminid;
    }

    public String getAdminaccount() {
        return adminaccount;
    }

    public void setAdminaccount(String adminaccount) {
        this.adminaccount = adminaccount == null ? null : adminaccount.trim();
    }

    public String getAdminpassword() {
        return adminpassword;
    }

    public void setAdminpassword(String adminpassword) {
        this.adminpassword = adminpassword == null ? null : adminpassword.trim();
    }

    public Integer getAdminleval() {
        return adminleval;
    }

    public void setAdminleval(Integer adminleval) {
        this.adminleval = adminleval;
    }

    public String getAdminmessage() {
        return adminmessage;
    }

    public void setAdminmessage(String adminmessage) {
        this.adminmessage = adminmessage == null ? null : adminmessage.trim();
    }

    @Override
    public String toString() {
        return "Admin{" +
                "adminid=" + adminid +
                ", adminaccount='" + adminaccount + '\'' +
                ", adminpassword='" + adminpassword + '\'' +
                ", adminleval=" + adminleval +
                ", adminmessage='" + adminmessage + '\'' +
                '}';
    }
}