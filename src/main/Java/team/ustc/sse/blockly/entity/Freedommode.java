package team.ustc.sse.blockly.entity;

import java.util.Date;

public class Freedommode {
    private Integer freemodeid;

    private String program;

    private String source;

    private Date freemodesavetime;

    public Integer getFreemodeid() {
        return freemodeid;
    }

    public void setFreemodeid(Integer freemodeid) {
        this.freemodeid = freemodeid;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program == null ? null : program.trim();
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source == null ? null : source.trim();
    }

    public Date getFreemodesavetime() {
        return freemodesavetime;
    }

    public void setFreemodesavetime(Date freemodesavetime) {
        this.freemodesavetime = freemodesavetime;
    }
}