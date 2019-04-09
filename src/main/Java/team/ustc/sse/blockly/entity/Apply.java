package team.ustc.sse.blockly.entity;

import java.util.Date;

public class Apply extends ApplyKey {
    private Date applydate;

    private Boolean applysubmit;


    public Date getApplydate() {
        return applydate;
    }

    public Apply setApplydate(Date applydate) {
        this.applydate = applydate;
        return this;
    }

    public Boolean getApplysubmit() {
        return applysubmit;
    }

    public Apply setApplysubmit(Boolean applysubmit) {
        this.applysubmit = applysubmit;
        return this;
    }

    @Override
    public String toString() {
        return "Apply{" +
                "applydate=" + applydate +
                ", applysubmit=" + applysubmit +
                '}';
    }
}