package com.myspringboot.model;

import java.math.BigDecimal;
import java.util.Date;

public class ProjectRelease {
    /**
     * null
     */
    private String id;

    /**
     * null
     */
    private String projectId;

    /**
     * null
     */
    private String relName;

    /**
     * null
     */
    private String remark;

    /**
     * null
     */
    private String createUser;

    /**
     * null
     */
    private Date createDate;

    /**
     * null
     */
    private String updateUser;

    /**
     * null
     */
    private Date updateDate;

    /**
     * null
     */
    private BigDecimal status;

    /**
     * null
     * @return ID null
     */
    public String getId() {
        return id;
    }

    /**
     * null
     * @param id null
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * null
     * @return PROJECT_ID null
     */
    public String getProjectId() {
        return projectId;
    }

    /**
     * null
     * @param projectId null
     */
    public void setProjectId(String projectId) {
        this.projectId = projectId == null ? null : projectId.trim();
    }

    /**
     * null
     * @return REL_NAME null
     */
    public String getRelName() {
        return relName;
    }

    /**
     * null
     * @param relName null
     */
    public void setRelName(String relName) {
        this.relName = relName == null ? null : relName.trim();
    }

    /**
     * null
     * @return REMARK null
     */
    public String getRemark() {
        return remark;
    }

    /**
     * null
     * @param remark null
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * null
     * @return CREATE_USER null
     */
    public String getCreateUser() {
        return createUser;
    }

    /**
     * null
     * @param createUser null
     */
    public void setCreateUser(String createUser) {
        this.createUser = createUser == null ? null : createUser.trim();
    }

    /**
     * null
     * @return CREATE_DATE null
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * null
     * @param createDate null
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * null
     * @return UPDATE_USER null
     */
    public String getUpdateUser() {
        return updateUser;
    }

    /**
     * null
     * @param updateUser null
     */
    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser == null ? null : updateUser.trim();
    }

    /**
     * null
     * @return UPDATE_DATE null
     */
    public Date getUpdateDate() {
        return updateDate;
    }

    /**
     * null
     * @param updateDate null
     */
    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * null
     * @return STATUS null
     */
    public BigDecimal getStatus() {
        return status;
    }

    /**
     * null
     * @param status null
     */
    public void setStatus(BigDecimal status) {
        this.status = status;
    }
}