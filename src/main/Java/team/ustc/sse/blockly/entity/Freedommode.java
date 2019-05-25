package team.ustc.sse.blockly.entity;

import java.util.Date;

public class Freedommode extends FreedommodeKey {
    private String program;

    private String source;

    private Date freemodesavetime;

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

    @Override
    public String toString() {
        return "Freedommode{" +
                "program='" + program + '\'' +
                ", source='" + source + '\'' +
                ", freemodesavetime=" + freemodesavetime +
                '}';
    }
}