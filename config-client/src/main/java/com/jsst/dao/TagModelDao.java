package com.jsst.dao;

import org.apache.ibatis.annotations.Param;
import java.util.List;
import com.jsst.model.TagModel;

public interface TagModelDao {

    int insert(@Param("pojo") TagModel pojo);

    int insertList(@Param("pojos") List< TagModel> pojo);

    List<TagModel> select(@Param("pojo") TagModel pojo);

    int update(@Param("pojo") TagModel pojo);

}
