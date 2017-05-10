package com.tugeng.dao;

import com.tugeng.model.Mergeschedule;

public interface MergescheduleMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Mergeschedule record);

    int insertSelective(Mergeschedule record);

    Mergeschedule selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Mergeschedule record);

    int updateByPrimaryKey(Mergeschedule record);
}