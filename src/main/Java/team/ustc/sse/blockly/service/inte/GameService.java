package team.ustc.sse.blockly.service.inte;

import team.ustc.sse.blockly.entity.Checkoutpoint;
import team.ustc.sse.blockly.entity.Student;

public interface GameService {

    Checkoutpoint getLastCheckpoint(Student student);

    boolean saveCheckpoint(int totalTime,Student student,String program,int saveTime);


}
