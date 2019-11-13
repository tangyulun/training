package com.myspringboot.model;

import java.util.Date;

public class Users {
    /**
     * null
     */
    private Short id;

    /**
     * null
     */
    private String userName;

    /**
     * null
     */
    private String password;

    /**
     * null
     */
    private Date createDate;

    /**
     * null
     * @return ID null
     */
    public Short getId() {
        return id;
    }

    /**
     * null
     * @param id null
     */
    public void setId(Short id) {
        this.id = id;
    }

    /**
     * null
     * @return USER_NAME null
     */
    public String getUserName() {
        return userName;
    }

    /**
     * null
     * @param userName null
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     * null
     * @return PASSWORD null
     */
    public String getPassword() {
        return password;
    }

    /**
     * null
     * @param password null
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
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
}