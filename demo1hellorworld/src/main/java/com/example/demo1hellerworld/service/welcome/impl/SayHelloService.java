package com.example.demo1hellerworld.service.welcome.impl;

import com.example.demo1hellerworld.service.welcome.SayHello;
import org.springframework.stereotype.Component;

/**
 * @author sf
 */
@Component
public class SayHelloService implements SayHello {

    String str = "好嗨哦";

    @Override
    public String addStr(String str) {
        return this.str + str;
    }

    @Override
    public String doOut() {
        return this.str;
    }
}
