package team.ustc.sse.blockly.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import team.ustc.sse.blockly.entity.Checkoutpoint;
import team.ustc.sse.blockly.entity.CheckoutpointExample;

public interface CheckoutpointMapper {
    int countByExample(CheckoutpointExample example);

    int deleteByExample(CheckoutpointExample example);

    int deleteByPrimaryKey(Integer checkoutpointid);

    int insert(Checkoutpoint record);

    int insertSelective(Checkoutpoint record);

    List<Checkoutpoint> selectByExample(CheckoutpointExample example);

    Checkoutpoint selectByPrimaryKey(Integer checkoutpointid);

    int updateByExampleSelective(@Param("record") Checkoutpoint record, @Param("example") CheckoutpointExample example);

    int updateByExample(@Param("record") Checkoutpoint record, @Param("example") CheckoutpointExample example);

    int updateByPrimaryKeySelective(Checkoutpoint record);

    int updateByPrimaryKey(Checkoutpoint record);
}