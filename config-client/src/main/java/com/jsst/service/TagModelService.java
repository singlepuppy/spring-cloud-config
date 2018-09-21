package com.jsst.service;

import com.jsst.model.TagModel;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;

import com.jsst.dao.TagModelDao;

@Service
public class TagModelService {

    @Resource
    private TagModelDao tagModelDao;

    public int insert(TagModel pojo){
        return tagModelDao.insert(pojo);
    }

    public int insertList(List< TagModel> pojos){
        return tagModelDao.insertList(pojos);
    }

    public List<TagModel> select(TagModel pojo){
        return tagModelDao.select(pojo);
    }

    public int update(TagModel pojo){
        return tagModelDao.update(pojo);
    }

}
