package team.ustc.sse.blockly.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import team.ustc.sse.blockly.entity.Guardianloginmessage;
import team.ustc.sse.blockly.entity.GuardianloginmessageExample;

public interface GuardianloginmessageMapper {
    int countByExample(GuardianloginmessageExample example);

    int deleteByExample(GuardianloginmessageExample example);

    int deleteByPrimaryKey(Integer guardianloginid);

    int insert(Guardianloginmessage record);

    int insertSelective(Guardianloginmessage record);

    List<Guardianloginmessage> selectByExample(GuardianloginmessageExample example);

    Guardianloginmessage selectByPrimaryKey(Integer guardianloginid);

    int updateByExampleSelective(@Param("record") Guardianloginmessage record, @Param("example") GuardianloginmessageExample example);

    int updateByExample(@Param("record") Guardianloginmessage record, @Param("example") GuardianloginmessageExample example);

    int updateByPrimaryKeySelective(Guardianloginmessage record);

    int updateByPrimaryKey(Guardianloginmessage record);
}