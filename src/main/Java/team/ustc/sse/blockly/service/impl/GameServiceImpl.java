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
        criteria.andStudentidEqualTo(studentID).andCheckpointidEqualTo(checkpointID);
        List<Checkoutpoint> list = checkoutpointMapper.selectByExample(checkoutpointExample);
        return list.get(0);
    }


    //获得闯关信息，不检测program字段，提升检索效率
    @Override
    public List<Checkoutpoint> getSuccessMessageByStudent(int studentID) {
        List<Checkoutpoint> list = checkoutpointMapper.getIsSuccessByStudentID(studentID);
        return list;
    }

    @Override
    public boolean saveCheckoutPoint(Checkoutpoint checkoutpoint) {
        int result = checkoutpointMapper.insert(checkoutpoint);     //注意result=1表示成功插入，result=2表示已存在，进行了update
//        System.out.println(result);
        return result>=1;
    }


}
