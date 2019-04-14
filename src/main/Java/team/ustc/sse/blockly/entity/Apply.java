package team.ustc.sse.blockly.entity;

import java.util.Date;

public class Apply extends ApplyKey {
    private Date applydate;

    private Boolean applysubmit;

    public Date getApplydate() {
        return applydate;
    }

    public void setApplydate(Date applydate) {
        this.applydate = applydate;
    }

    public Boolean getApplysubmit() {
        return applysubmit;
    }

    public void setApplysubmit(Boolean applysubmit) {
        this.applysubmit = applysubmit;
    }
}