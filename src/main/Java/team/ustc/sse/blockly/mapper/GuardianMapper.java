package team.ustc.sse.blockly.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import team.ustc.sse.blockly.entity.Guardian;
import team.ustc.sse.blockly.entity.GuardianExample;

public interface GuardianMapper {
    int countByExample(GuardianExample example);

    int deleteByExample(GuardianExample example);

    int deleteByPrimaryKey(Integer guardianid);

    int insert(Guardian record);

    int insertSelective(Guardian record);

    List<Guardian> selectByExample(GuardianExample example);

    Guardian selectByPrimaryKey(Integer guardianid);

    int updateByExampleSelective(@Param("record") Guardian record, @Param("example") GuardianExample example);

    int updateByExample(@Param("record") Guardian record, @Param("example") GuardianExample example);

    int updateByPrimaryKeySelective(Guardian record);

    int updateByPrimaryKey(Guardian record);
}