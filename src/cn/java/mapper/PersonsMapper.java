package cn.java.mapper;

import cn.java.entity.Persons;
import cn.java.entity.PersonsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PersonsMapper {
    int countByExample(PersonsExample example);

    int deleteByExample(PersonsExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Persons record);

    int insertSelective(Persons record);

    List<Persons> selectByExample(PersonsExample example);

    Persons selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Persons record, @Param("example") PersonsExample example);

    int updateByExample(@Param("record") Persons record, @Param("example") PersonsExample example);

    int updateByPrimaryKeySelective(Persons record);

    int updateByPrimaryKey(Persons record);
}