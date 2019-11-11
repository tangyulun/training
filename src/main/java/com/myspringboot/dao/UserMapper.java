package com.myspringboot.dao;

import com.myspringboot.model.Users;
import org.springframework.stereotype.Repository;


@Repository
public interface UserMapper {
    /**
     *
     * @mbggenerated 2018-09-24
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2018-09-24
     */
    int insert(Users record);

    /**
     *
     * @mbggenerated 2018-09-24
     */
    int insertSelective(Users record);

    /**
     *
     * @mbggenerated 2018-09-24
     */
    Users selectByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2018-09-24
     */
    int updateByPrimaryKeySelective(Users record);

    /**
     *
     * @mbggenerated 2018-09-24
     */
    int updateByPrimaryKey(Users record);
}