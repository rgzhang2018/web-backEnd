package team.ustc.sse.blockly.mapper;

import org.apache.ibatis.annotations.Param;
import team.ustc.sse.blockly.entity.Bbsinfo;
import team.ustc.sse.blockly.entity.BbsinfoExample;

import java.util.List;

public interface BbsinfoMapper {
    int countByExample(BbsinfoExample example);

    int deleteByExample(BbsinfoExample example);

    int deleteByPrimaryKey(Integer bbsid);

    int insert(Bbsinfo record);

    int insertSelective(Bbsinfo record);

    List<Bbsinfo> selectByExample(BbsinfoExample example);

    Bbsinfo selectByPrimaryKey(Integer bbsid);

    int updateByExampleSelective(@Param("record") Bbsinfo record, @Param("example") BbsinfoExample example);

    int updateByExample(@Param("record") Bbsinfo record, @Param("example") BbsinfoExample example);

    int updateByPrimaryKeySelective(Bbsinfo record);

    int updateByPrimaryKey(Bbsinfo record);
}