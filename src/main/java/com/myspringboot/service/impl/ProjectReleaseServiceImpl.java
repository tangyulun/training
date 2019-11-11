package com.myspringboot.service.impl;

import com.myspringboot.dao.ProjectReleaseItemMapper;
import com.myspringboot.dao.ProjectReleaseMapper;
import com.myspringboot.model.ProjectRelease;
import com.myspringboot.model.ProjectReleaseItem;
import com.myspringboot.service.ProjectReleaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Date;
import java.util.UUID;

@Service

public class ProjectReleaseServiceImpl implements ProjectReleaseService {

    @Autowired
    private ProjectReleaseItemMapper projectReleaseItemMapper;

    @Autowired
    private ProjectReleaseMapper projectReleaseMapper;

    @Override
    public void saveProjectRelease() {

        ProjectRelease projectRelease = new ProjectRelease();
        projectRelease.setId(UUID.randomUUID().toString());
        projectRelease.setCreateDate(new Date());
        projectRelease.setUpdateDate(new Date());
        projectRelease.setRelName("xxxxx");
        projectRelease.setStatus(BigDecimal.ONE);
        projectReleaseMapper.insertSelective(projectRelease);


        //for (int i = 0; i < 2; i++) {
            ProjectReleaseItem projectReleaseItem = new ProjectReleaseItem();
            projectReleaseItem.setProjectReleaseId(projectRelease.getId());
            projectReleaseItem.setId(BigDecimal.valueOf(123456789));
//            projectReleaseItem.setCapitalCost1();
            projectReleaseItemMapper.insertSelective(projectReleaseItem);
        //}


    }
}
