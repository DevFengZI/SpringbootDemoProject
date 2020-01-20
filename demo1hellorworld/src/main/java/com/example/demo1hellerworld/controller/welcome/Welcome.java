package com.example.demo1hellerworld.controller.welcome;

import com.example.demo1hellerworld.service.welcome.impl.SayHelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author sf
 */
@RestController
@RequestMapping("welcome/")
public class Welcome {
    @Autowired
    SayHelloService sayHelloService;

    @RequestMapping("say")

    public String doWelcome(String string) {
        return sayHelloService.addStr(string);
    }

//    public UserInfoBean getUserInfo(HttpServletRequest httpServletRequest) {
//
//    }

}
