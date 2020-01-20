package com.example.demo4thymeleaf.service.entity;

import com.example.demo4thymeleaf.service.entity.pojo.UserInfoPojo;

/**
 * @author lsf
 * @className UserInfo
 * @description TODO
 * @date 2020/1/2019:31
 */
public class UserInfo {
    public UserInfo(LoginInfo loginInfo, UserInfoPojo userInfoPojo) {
        this.loginInfo = loginInfo;
        this.userInfoPojo = userInfoPojo;
    }

    private LoginInfo loginInfo;
    private UserInfoPojo userInfoPojo;
    public LoginInfo getLoginInfo() {
        return loginInfo;
    }

    public void setLoginInfo(LoginInfo loginInfo) {
        this.loginInfo = loginInfo;
    }

    public UserInfoPojo getUserInfoPojo() {
        return userInfoPojo;
    }

    public void setUserInfoPojo(UserInfoPojo userInfoPojo) {
        this.userInfoPojo = userInfoPojo;
    }


}
