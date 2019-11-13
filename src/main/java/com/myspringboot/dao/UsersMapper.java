package com.myspringboot.dao;

import com.myspringboot.model.Users;

public interface UsersMapper {
    /**
     *
     * @mbggenerated 2019-11-13
     */
    int deleteByPrimaryKey(Short id);

    /**
     *
     * @mbggenerated 2019-11-13
     */
    int insert(Users record);

    /**
     *
     * @mbggenerated 2019-11-13
     */
    int insertSelective(Users record);

    /**
     *
     * @mbggenerated 2019-11-13
     */
    Users selectByPrimaryKey(Short id);

    /**
     *
     * @mbggenerated 2019-11-13
     */
    int updateByPrimaryKeySelective(Users record);

    /**
     *
     * @mbggenerated 2019-11-13
     */
    int updateByPrimaryKey(Users record);
}