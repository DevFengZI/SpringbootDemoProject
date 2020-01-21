package com.example.demo4thymeleaf.controller;

import com.example.demo4thymeleaf.module.BaseResult;
import com.example.demo4thymeleaf.service.entity.LoginInfo;
import com.example.demo4thymeleaf.service.entity.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * @author lsf
 * @className WelcomeController
 * @description TODO
 * @date 2020/1/2019:56
 */
@Controller
public class WelcomeController {
    @Autowired
    UserUtilsController userUtilsController;

    @RequestMapping("/welcome")
    private String welCome(HttpServletRequest servletRequest, Model model) {
        String strname = servletRequest.getParameter("user");
        String strpassworld = servletRequest.getParameter("pw");
        BaseResult<UserInfo> userInfoBaseResult = userUtilsController.doLogin(new LoginInfo(strname, strpassworld, true));
        model.addAttribute("user", userInfoBaseResult.getData());
        return "/index";
    }


}
