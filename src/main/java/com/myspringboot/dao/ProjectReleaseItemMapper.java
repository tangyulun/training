package com.myspringboot.dao;

import com.myspringboot.model.ProjectReleaseItem;

import java.math.BigDecimal;

public interface ProjectReleaseItemMapper {
    /**
     *
     * @mbggenerated 2019-06-26
     */
    int deleteByPrimaryKey(BigDecimal id);

    /**
     *
     * @mbggenerated 2019-06-26
     */
    int insert(ProjectReleaseItem record);

    /**
     *
     * @mbggenerated 2019-06-26
     */
    int insertSelective(ProjectReleaseItem record);

    /**
     *
     * @mbggenerated 2019-06-26
     */
    ProjectReleaseItem selectByPrimaryKey(BigDecimal id);

    /**
     *
     * @mbggenerated 2019-06-26
     */
    int updateByPrimaryKeySelective(ProjectReleaseItem record);

    /**
     *
     * @mbggenerated 2019-06-26
     */
    int updateByPrimaryKey(ProjectReleaseItem record);
}