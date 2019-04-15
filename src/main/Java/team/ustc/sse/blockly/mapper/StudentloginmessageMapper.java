package team.ustc.sse.blockly.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import team.ustc.sse.blockly.entity.Studentloginmessage;
import team.ustc.sse.blockly.entity.StudentloginmessageExample;

public interface StudentloginmessageMapper {
    int countByExample(StudentloginmessageExample example);

    int deleteByExample(StudentloginmessageExample example);

    int deleteByPrimaryKey(Integer studentloginid);

    int insert(Studentloginmessage record);

    int insertSelective(Studentloginmessage record);

    List<Studentloginmessage> selectByExample(StudentloginmessageExample example);

    Studentloginmessage selectByPrimaryKey(Integer studentloginid);

    int updateByExampleSelective(@Param("record") Studentloginmessage record, @Param("example") StudentloginmessageExample example);

    int updateByExample(@Param("record") Studentloginmessage record, @Param("example") StudentloginmessageExample example);

    int updateByPrimaryKeySelective(Studentloginmessage record);

    int updateByPrimaryKey(Studentloginmessage record);
}