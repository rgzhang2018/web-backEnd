package team.ustc.sse.blockly.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import team.ustc.sse.blockly.entity.Guardianlogin;
import team.ustc.sse.blockly.entity.GuardianloginExample;

public interface GuardianloginMapper {
    int countByExample(GuardianloginExample example);

    int deleteByExample(GuardianloginExample example);

    int deleteByPrimaryKey(Integer guardianid);

    int insert(Guardianlogin record);

    int insertSelective(Guardianlogin record);

    List<Guardianlogin> selectByExample(GuardianloginExample example);

    Guardianlogin selectByPrimaryKey(Integer guardianid);

    int updateByExampleSelective(@Param("record") Guardianlogin record, @Param("example") GuardianloginExample example);

    int updateByExample(@Param("record") Guardianlogin record, @Param("example") GuardianloginExample example);

    int updateByPrimaryKeySelective(Guardianlogin record);

    int updateByPrimaryKey(Guardianlogin record);
}