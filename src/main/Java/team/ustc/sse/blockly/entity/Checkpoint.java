package team.ustc.sse.blockly.entity;

import java.util.Date;

public class Checkpoint {
    private Integer checkpointid;

    private String checkpointname;

    private Integer checkpointlevel;

    private Integer checkpointcate;

    private String checkpointcode;

    private Date checkpointdata;

    private String checkpointremark;

    public Integer getCheckpointid() {
        return checkpointid;
    }

    public void setCheckpointid(Integer checkpointid) {
        this.checkpointid = checkpointid;
    }

    public String getCheckpointname() {
        return checkpointname;
    }

    public void setCheckpointname(String checkpointname) {
        this.checkpointname = checkpointname == null ? null : checkpointname.trim();
    }

    public Integer getCheckpointlevel() {
        return checkpointlevel;
    }

    public void setCheckpointlevel(Integer checkpointlevel) {
        this.checkpointlevel = checkpointlevel;
    }

    public Integer getCheckpointcate() {
        return checkpointcate;
    }

    public void setCheckpointcate(Integer checkpointcate) {
        this.checkpointcate = checkpointcate;
    }

    public String getCheckpointcode() {
        return checkpointcode;
    }

    public void setCheckpointcode(String checkpointcode) {
        this.checkpointcode = checkpointcode == null ? null : checkpointcode.trim();
    }

    public Date getCheckpointdata() {
        return checkpointdata;
    }

    public void setCheckpointdata(Date checkpointdata) {
        this.checkpointdata = checkpointdata;
    }

    public String getCheckpointremark() {
        return checkpointremark;
    }

    public void setCheckpointremark(String checkpointremark) {
        this.checkpointremark = checkpointremark == null ? null : checkpointremark.trim();
    }
}