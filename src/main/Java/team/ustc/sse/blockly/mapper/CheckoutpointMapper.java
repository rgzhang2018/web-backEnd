package team.ustc.sse.blockly.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import team.ustc.sse.blockly.entity.Checkoutpoint;
import team.ustc.sse.blockly.entity.CheckoutpointExample;
import team.ustc.sse.blockly.entity.CheckoutpointKey;

public interface CheckoutpointMapper {
    int countByExample(CheckoutpointExample example);

    int deleteByExample(CheckoutpointExample example);

    int deleteByPrimaryKey(CheckoutpointKey key);

    int insert(Checkoutpoint record);

    int insertSelective(Checkoutpoint record);

    List<Checkoutpoint> selectByExample(CheckoutpointExample example);

    List<Checkoutpoint> getIsSuccessByStudentID(Integer studentid);

    Checkoutpoint selectByPrimaryKey(CheckoutpointKey key);

    int updateByExampleSelective(@Param("record") Checkoutpoint record, @Param("example") CheckoutpointExample example);

    int updateByExample(@Param("record") Checkoutpoint record, @Param("example") CheckoutpointExample example);

    int updateByPrimaryKeySelective(Checkoutpoint record);

    int updateByPrimaryKey(Checkoutpoint record);
}