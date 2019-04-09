package team.ustc.sse.blockly.entity;

public class Guardian implements User{
    private Integer guardianid;

    private String guardianname;

    private String guardianpassword;

    private String guardianemail;


    /**
     * @Description: 重写了string就要重写hashcode方法。
     * @Param: [object]
     * @return: boolean
     * @Author: rgzhang
     * @Date: 2019/3/22
     */
    @Override
    public boolean equals(Object object){
        if(!(object instanceof Guardian))return false;
        Guardian guardian2 = (Guardian) object;
        return guardian2.guardianid.equals(guardianid)
                && guardian2.guardianname.equals(guardianname)
                && guardian2.guardianpassword.equals(guardianpassword);
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + guardianid;
        result = 31 * result + (guardianname == null ? 0 : guardianname.hashCode());
        result = 31 * result + (guardianpassword == null ? 0 : guardianpassword.hashCode());
//        result = 31 * result + (mObj == null ? 0 : mObj.hashCode());
        return result;
    }

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