package team.ustc.sse.blockly.service.inte;

import team.ustc.sse.blockly.entity.Checkoutpoint;

public interface GameService {

    /**
    * @Description: 根据学生ID和关卡ID checkpointID查询学生存储的代码记录
    * @Param: [studentID, checkpointID]
    * @return: team.ustc.sse.blockly.entity.Checkoutpoint
    * @Author: rgzhang
    */
    Checkoutpoint getCheckoutPoint(int studentID, int checkpointID);


    /**
    * @Description: 保存某个学生的闯关记录
    * @Param: [totalTime, studentID, program, saveTime]
    * @return: boolean
    * @Author: rgzhang
    */
    boolean saveCheckoutPoint(Checkoutpoint checkoutpoint);


}
