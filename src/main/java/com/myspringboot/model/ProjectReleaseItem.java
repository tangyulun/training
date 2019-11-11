package com.myspringboot.model;

import java.math.BigDecimal;

public class ProjectReleaseItem {
    /**
     * null
     */
    private BigDecimal id;

    /**
     * null
     */
    private String projectId;

    /**
     * null
     */
    private BigDecimal capitalCost1;

    /**
     * null
     */
    private BigDecimal moneyCost1;

    /**
     * null
     */
    private BigDecimal capitalCost2;

    /**
     * null
     */
    private BigDecimal moneyCost2;

    /**
     * null
     */
    private String projectReleaseId;

    /**
     * null
     * @return ID null
     */
    public BigDecimal getId() {
        return id;
    }

    /**
     * null
     * @param id null
     */
    public void setId(BigDecimal id) {
        this.id = id;
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
     * @return CAPITAL_COST1 null
     */
    public BigDecimal getCapitalCost1() {
        return capitalCost1;
    }

    /**
     * null
     * @param capitalCost1 null
     */
    public void setCapitalCost1(BigDecimal capitalCost1) {
        this.capitalCost1 = capitalCost1;
    }

    /**
     * null
     * @return MONEY_COST1 null
     */
    public BigDecimal getMoneyCost1() {
        return moneyCost1;
    }

    /**
     * null
     * @param moneyCost1 null
     */
    public void setMoneyCost1(BigDecimal moneyCost1) {
        this.moneyCost1 = moneyCost1;
    }

    /**
     * null
     * @return CAPITAL_COST2 null
     */
    public BigDecimal getCapitalCost2() {
        return capitalCost2;
    }

    /**
     * null
     * @param capitalCost2 null
     */
    public void setCapitalCost2(BigDecimal capitalCost2) {
        this.capitalCost2 = capitalCost2;
    }

    /**
     * null
     * @return MONEY_COST2 null
     */
    public BigDecimal getMoneyCost2() {
        return moneyCost2;
    }

    /**
     * null
     * @param moneyCost2 null
     */
    public void setMoneyCost2(BigDecimal moneyCost2) {
        this.moneyCost2 = moneyCost2;
    }

    /**
     * null
     * @return PROJECT_RELEASE_ID null
     */
    public String getProjectReleaseId() {
        return projectReleaseId;
    }

    /**
     * null
     * @param projectReleaseId null
     */
    public void setProjectReleaseId(String projectReleaseId) {
        this.projectReleaseId = projectReleaseId == null ? null : projectReleaseId.trim();
    }
}