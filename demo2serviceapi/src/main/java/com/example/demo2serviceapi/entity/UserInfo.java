package com.example.demo2serviceapi.entity;

import com.example.demo2serviceapi.entity.pojo.UserInfoPojo;

/**
 * @author lsf
 * @className UserInfo
 * @description 用户bean 可以写用户相关业务逻辑
 * @date 2020/1/2016:28
 */
public class UserInfo extends UserInfoPojo {
    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    /**
     * 其他
     */
    private String tag;

}
