package com.myspringboot.dao;

import com.myspringboot.model.ProjectTz;

public interface ProjectTzMapper {
    /**
     *
     * @mbggenerated 2019-06-26
     */
    int deleteByPrimaryKey(String id);

    /**
     *
     * @mbggenerated 2019-06-26
     */
    int insert(ProjectTz record);

    /**
     *
     * @mbggenerated 2019-06-26
     */
    int insertSelective(ProjectTz record);

    /**
     *
     * @mbggenerated 2019-06-26
     */
    ProjectTz selectByPrimaryKey(String id);

    /**
     *
     * @mbggenerated 2019-06-26
     */
    int updateByPrimaryKeySelective(ProjectTz record);

    /**
     *
     * @mbggenerated 2019-06-26
     */
    int updateByPrimaryKey(ProjectTz record);
}