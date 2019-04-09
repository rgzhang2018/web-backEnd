package team.ustc.sse.blockly.entity;

public class ApplyKey {
    private Integer guardianid;

    private Integer studentid;

    public Integer getGuardianid() {
        return guardianid;
    }

    public ApplyKey setGuardianid(Integer guardianid) {
        this.guardianid = guardianid;
        return this;
    }

    public Integer getStudentid() {
        return studentid;
    }

    public ApplyKey setStudentid(Integer studentid) {
        this.studentid = studentid;
        return this;
    }

    @Override
    public String toString() {
        return "ApplyKey{" +
                "guardianid=" + guardianid +
                ", studentid=" + studentid +
                '}';
    }
}