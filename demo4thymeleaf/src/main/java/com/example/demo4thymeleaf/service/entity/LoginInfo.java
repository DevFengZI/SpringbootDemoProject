package com.example.demo4thymeleaf.service.entity;

/**
 * @author lsf
 * @className LoginInfo
 * @description TODO
 * @date 2020/1/2019:32
 */
public class LoginInfo {
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWorld() {
        return passWorld;
    }

    public void setPassWorld(String passWorld) {
        this.passWorld = passWorld;
    }

    public boolean isSave() {
        return isSave;
    }
    public void setSave(boolean save) {
        isSave = save;
    }

    public LoginInfo(String userName, String passWorld, boolean isSave) {
        this.userName = userName;
        this.passWorld = passWorld;
        this.isSave = isSave;
    }

    private String userName;
    private String passWorld;
    private boolean isSave;
}
