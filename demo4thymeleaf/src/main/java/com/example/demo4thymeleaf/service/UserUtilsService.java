package com.example.demo4thymeleaf.service;

import com.example.demo4thymeleaf.service.entity.LoginInfo;
import com.example.demo4thymeleaf.service.entity.UserInfo;
import com.example.demo4thymeleaf.service.entity.pojo.UserInfoPojo;

/**
 * @author lsf
 * @className UserUtilsService
 * @description TODO
 * @date 2020/1/2019:35
 */
public interface UserUtilsService {
    UserInfoPojo userInfo(LoginInfo loginInfo);
}
