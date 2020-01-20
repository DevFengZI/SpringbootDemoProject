package com.example.demo1hellerworld.entity;

import com.example.demo1hellerworld.entity.pojo.UserInfoPojo;

/**
 * @author sf
 */
public class UserInfoBean extends UserInfoPojo {

    /**
     * 权限类型
     */
    public Boolean checkPermissionType() {
        return getAge() > 0 || getUserId() > 0 || getUsername().contains("l");
    }
}
