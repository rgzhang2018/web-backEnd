package team.ustc.sse.blockly.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import team.ustc.sse.blockly.entity.Checkoutpoint;
import team.ustc.sse.blockly.entity.Student;
import team.ustc.sse.blockly.mapper.CheckoutpointMapper;
import team.ustc.sse.blockly.mapper.CheckpointMapper;
import team.ustc.sse.blockly.mapper.FreedommodeMapper;
import team.ustc.sse.blockly.service.inte.GameService;

/**
 * description:
 * author: rgzhang
 * create time: 2019-04-14
 **/
@Service
public class GameServiceImpl implements GameService {

    @Autowired
    private CheckoutpointMapper checkoutpointMapper;    //记录学生玩游戏的信息

    @Autowired
    private CheckpointMapper checkpointMapper;          //记录关卡信息




    @Override
    public Checkoutpoint getLastCheckpoint(Student student) {
        return null;
    }

    @Override
    public boolean saveCheckpoint(int totalTime, Student student, String program, int saveTime) {
        return false;
    }

    @Override
    public boolean saveFreemode() {
        return false;
    }
}
