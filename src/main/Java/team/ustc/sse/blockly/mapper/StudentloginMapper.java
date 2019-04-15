package team.ustc.sse.blockly.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import team.ustc.sse.blockly.entity.Studentlogin;
import team.ustc.sse.blockly.entity.StudentloginExample;

public interface StudentloginMapper {
    int countByExample(StudentloginExample example);

    int deleteByExample(StudentloginExample example);

    int deleteByPrimaryKey(Integer studentid);

    int insert(Studentlogin record);

    int insertSelective(Studentlogin record);

    List<Studentlogin> selectByExample(StudentloginExample example);

    Studentlogin selectByPrimaryKey(Integer studentid);

    int updateByExampleSelective(@Param("record") Studentlogin record, @Param("example") StudentloginExample example);

    int updateByExample(@Param("record") Studentlogin record, @Param("example") StudentloginExample example);

    int updateByPrimaryKeySelective(Studentlogin record);

    int updateByPrimaryKey(Studentlogin record);
}