package team.ustc.sse.blockly.entity;

import java.util.Date;

public class Freedommode {
    private Integer studentid;

    private String program;

    private String source;

    private Date freemodesavetime;

    private Integer toaltime;

    public Integer getStudentid() {
        return studentid;
    }

    public void setStudentid(Integer studentid) {
        this.studentid = studentid;
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

    public Integer getToaltime() {
        return toaltime;
    }

    public void setToaltime(Integer toaltime) {
        this.toaltime = toaltime;
    }
}