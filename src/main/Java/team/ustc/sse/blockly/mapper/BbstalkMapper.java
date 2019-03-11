package team.ustc.sse.blockly.mapper;

import org.apache.ibatis.annotations.Param;
import team.ustc.sse.blockly.entity.Bbstalk;
import team.ustc.sse.blockly.entity.BbstalkExample;

import java.util.List;

public interface BbstalkMapper {
    int countByExample(BbstalkExample example);

    int deleteByExample(BbstalkExample example);

    int deleteByPrimaryKey(Integer talkid);

    int insert(Bbstalk record);

    int insertSelective(Bbstalk record);

    List<Bbstalk> selectByExample(BbstalkExample example);

    Bbstalk selectByPrimaryKey(Integer talkid);

    int updateByExampleSelective(@Param("record") Bbstalk record, @Param("example") BbstalkExample example);

    int updateByExample(@Param("record") Bbstalk record, @Param("example") BbstalkExample example);

    int updateByPrimaryKeySelective(Bbstalk record);

    int updateByPrimaryKey(Bbstalk record);
}