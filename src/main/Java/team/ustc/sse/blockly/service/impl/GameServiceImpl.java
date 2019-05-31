package team.ustc.sse.blockly.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import team.ustc.sse.blockly.entity.Checkoutpoint;
import team.ustc.sse.blockly.entity.CheckoutpointExample;
import team.ustc.sse.blockly.mapper.CheckoutpointMapper;
import team.ustc.sse.blockly.mapper.CheckpointMapper;
import team.ustc.sse.blockly.service.inte.GameService;
import team.ustc.sse.blockly.util.TimeUtil;

import java.util.Date;
import java.util.List;

/**
 * description:
 * author: rgzhang
 * create time: 2019-04-14
 **/
@Service
public class GameServiceImpl implements GameService {

    private final CheckoutpointMapper checkoutpointMapper;    //记录学生玩游戏的信息

    private final CheckpointMapper checkpointMapper;          //记录关卡信息

    public GameServiceImpl(CheckoutpointMapper checkoutpointMapper, CheckpointMapper checkpointMapper) {
        this.checkoutpointMapper = checkoutpointMapper;
        this.checkpointMapper = checkpointMapper;
    }


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
        checkoutpoint.setSavetime(new Date());
        checkoutpoint.setToaltime(1);  //前端未设置总时间计时器
        int result = checkoutpointMapper.insert(checkoutpoint);     //注意result=1表示成功插入，result=2表示已存在，进行了update
//        System.out.println(result);
        return result>=1;
    }

    @Override
    public int getCheckoutpointCountsPast(int pastDay) {
        Date date = TimeUtil.getPastDate(new Date(),pastDay);
        CheckoutpointExample example = new CheckoutpointExample();
        CheckoutpointExample.Criteria criteria = example.createCriteria();
        criteria.andSavetimeGreaterThan(date);
        int count = checkoutpointMapper.countByExample(example);
        return count;
    }

    //获得通过状态，不检索program字段以提升检索效率
    @Override
    public List<Checkoutpoint> getCheckoutpointByStudentID(int studentID) {
        return  checkoutpointMapper.getIsSuccessByStudentID(studentID);
    }


}
