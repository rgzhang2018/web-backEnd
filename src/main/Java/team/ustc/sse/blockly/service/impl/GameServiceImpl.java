package team.ustc.sse.blockly.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import team.ustc.sse.blockly.entity.Checkoutpoint;
import team.ustc.sse.blockly.entity.CheckoutpointExample;
import team.ustc.sse.blockly.mapper.CheckoutpointMapper;
import team.ustc.sse.blockly.mapper.CheckpointMapper;
import team.ustc.sse.blockly.service.inte.GameService;

import java.util.List;

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
    public Checkoutpoint getCheckoutPoint(int studentID, int checkpointID) {
        CheckoutpointExample checkoutpointExample = new CheckoutpointExample();
        CheckoutpointExample.Criteria criteria = checkoutpointExample.createCriteria();
        criteria.andStudentidEqualTo(studentID);
        List<Checkoutpoint> list = checkoutpointMapper.selectByExample(checkoutpointExample);
        return list.get(0);
    }

    @Override
    public boolean saveCheckoutPoint(Checkoutpoint checkoutpoint) {
        return false;
    }


}
