package team.ustc.sse.blockly.entity;

public class Freedommode {
    private Integer freemodeid;

    private String program;

    private String source;

    public Integer getFreemodeid() {
        return freemodeid;
    }

    public Freedommode setFreemodeid(Integer freemodeid) {
        this.freemodeid = freemodeid;
        return this;
    }

    public String getProgram() {
        return program;
    }

    public Freedommode setProgram(String program) {
        this.program = program;
        return this;
    }

    public String getSource() {
        return source;
    }

    public Freedommode setSource(String source) {
        this.source = source;
        return this;
    }

    @Override
    public String toString() {
        return "Freedommode{" +
                "freemodeid=" + freemodeid +
                ", program='" + program + '\'' +
                ", source='" + source + '\'' +
                '}';
    }
}