package team.ustc.sse.blockly.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import team.ustc.sse.blockly.entity.Freedommode;
import team.ustc.sse.blockly.entity.FreedommodeExample;
import team.ustc.sse.blockly.entity.FreedommodeKey;

public interface FreedommodeMapper {
    int countByExample(FreedommodeExample example);

    int deleteByExample(FreedommodeExample example);

    int deleteByPrimaryKey(FreedommodeKey key);

    int insert(Freedommode record);

    int insertSelective(Freedommode record);

    List<Freedommode> selectByExample(FreedommodeExample example);

    Freedommode selectByPrimaryKey(FreedommodeKey key);

    int updateByExampleSelective(@Param("record") Freedommode record, @Param("example") FreedommodeExample example);

    int updateByExample(@Param("record") Freedommode record, @Param("example") FreedommodeExample example);

    int updateByPrimaryKeySelective(Freedommode record);

    int updateByPrimaryKey(Freedommode record);
}