package com.example.demo4thymeleaf.service.entity.pojo;

/**
 * @author lsf
 * @className LoginInfo
 * @description TODO
 * @date 2020/1/2019:32
 */
public class LoginInfoPojo {
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

    private String userName;
    private String passWorld;
}
