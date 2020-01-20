package com.example.demo4thymeleaf.service.entity.pojo;

/**
 * @author lsf
 * @className UserInfoPojo
 * @description TODO
 * @date 2020/1/2019:31
 */
public class UserInfoPojo {
    private String userName;

    public UserInfoPojo(String userName, String sex) {
        this.userName = userName;
        this.sex = sex;
    }

    private String sex;
}
