package team.ustc.sse.blockly.mapper;

import org.apache.ibatis.annotations.Param;
import team.ustc.sse.blockly.entity.Checkpoint;
import team.ustc.sse.blockly.entity.CheckpointExample;

import java.util.List;

public interface CheckpointMapper {
    int countByExample(CheckpointExample example);

    int deleteByExample(CheckpointExample example);

    int deleteByPrimaryKey(Integer checkpointid);

    int insert(Checkpoint record);

    int insertSelective(Checkpoint record);

    List<Checkpoint> selectByExample(CheckpointExample example);

    Checkpoint selectByPrimaryKey(Integer checkpointid);

    int updateByExampleSelective(@Param("record") Checkpoint record, @Param("example") CheckpointExample example);

    int updateByExample(@Param("record") Checkpoint record, @Param("example") CheckpointExample example);

    int updateByPrimaryKeySelective(Checkpoint record);

    int updateByPrimaryKey(Checkpoint record);
}