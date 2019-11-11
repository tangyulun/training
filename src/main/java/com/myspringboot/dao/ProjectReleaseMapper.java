package com.myspringboot.dao;

import com.myspringboot.model.ProjectRelease;

public interface ProjectReleaseMapper {
    /**
     *
     * @mbggenerated 2019-06-26
     */
    int deleteByPrimaryKey(String id);

    /**
     *
     * @mbggenerated 2019-06-26
     */
    int insert(ProjectRelease record);

    /**
     *
     * @mbggenerated 2019-06-26
     */
    int insertSelective(ProjectRelease record);

    /**
     *
     * @mbggenerated 2019-06-26
     */
    ProjectRelease selectByPrimaryKey(String id);

    /**
     *
     * @mbggenerated 2019-06-26
     */
    int updateByPrimaryKeySelective(ProjectRelease record);

    /**
     *
     * @mbggenerated 2019-06-26
     */
    int updateByPrimaryKey(ProjectRelease record);
}