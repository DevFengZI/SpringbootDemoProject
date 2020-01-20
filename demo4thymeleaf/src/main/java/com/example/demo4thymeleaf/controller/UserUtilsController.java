package com.example.demo4thymeleaf.controller;

import com.example.demo4thymeleaf.module.BaseResult;
import com.example.demo4thymeleaf.service.entity.LoginInfo;
import com.example.demo4thymeleaf.service.entity.UserInfo;
import com.example.demo4thymeleaf.service.entity.pojo.UserInfoPojo;
import com.example.demo4thymeleaf.service.impl.UserUtilsImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lsf
 * @className UserUtilsController
 * @description TODO
 * @date 2020/1/2019:44
 */
@RestController
@RequestMapping("user")
public class UserUtilsController {
    @Autowired
    UserUtilsImpl userUtils;

    @RequestMapping("/login")
    public BaseResult<UserInfo> doLogin(LoginInfo loginInfo) {
        UserInfoPojo userInfoPojo = userUtils.userInfo(loginInfo);
        BaseResult baseResult = new BaseResult();
        baseResult.setCode(0);
        baseResult.setData(new UserInfo(loginInfo, userInfoPojo));
        baseResult.setMsg("登录成功");
        return baseResult;
    }
}
