package com.javatribe.dao;

import com.javatribe.pojo.Home;

public interface HomeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Home record);

    int insertSelective(Home record);

    Home selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Home record);

    int updateByPrimaryKeyWithBLOBs(Home record);

    int updateByPrimaryKey(Home record);
}