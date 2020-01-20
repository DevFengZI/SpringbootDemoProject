package com.example.demo4thymeleaf.service.impl;

import com.example.demo4thymeleaf.service.UserUtilsService;
import com.example.demo4thymeleaf.service.entity.LoginInfo;
import com.example.demo4thymeleaf.service.entity.UserInfo;
import com.example.demo4thymeleaf.service.entity.pojo.UserInfoPojo;
import org.springframework.stereotype.Component;

/**
 * @author lsf
 * @className UserUtilsImpl
 * @description TODO
 * @date 2020/1/2019:35
 */
@Component
public class UserUtilsImpl implements UserUtilsService {
    @Override
    public UserInfoPojo userInfo(LoginInfo loginInfo) {
        return new UserInfoPojo("lsf", "男");
    }
}
