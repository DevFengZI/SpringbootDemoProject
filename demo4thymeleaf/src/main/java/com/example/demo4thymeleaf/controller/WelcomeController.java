package com.example.demo4thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
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
    @RequestMapping("/welcome")
    private String welCome(HttpServletRequest servletRequest) {
        return "/index";
    }


}
