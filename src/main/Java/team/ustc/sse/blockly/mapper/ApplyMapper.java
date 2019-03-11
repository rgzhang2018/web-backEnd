package team.ustc.sse.blockly.mapper;

import org.apache.ibatis.annotations.Param;
import team.ustc.sse.blockly.entity.Apply;
import team.ustc.sse.blockly.entity.ApplyExample;
import team.ustc.sse.blockly.entity.ApplyKey;

import java.util.List;

public interface ApplyMapper {
    int countByExample(ApplyExample example);

    int deleteByExample(ApplyExample example);

    int deleteByPrimaryKey(ApplyKey key);

    int insert(Apply record);

    int insertSelective(Apply record);

    List<Apply> selectByExample(ApplyExample example);

    Apply selectByPrimaryKey(ApplyKey key);

    int updateByExampleSelective(@Param("record") Apply record, @Param("example") ApplyExample example);

    int updateByExample(@Param("record") Apply record, @Param("example") ApplyExample example);

    int updateByPrimaryKeySelective(Apply record);

    int updateByPrimaryKey(Apply record);
}