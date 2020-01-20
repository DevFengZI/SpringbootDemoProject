package com.example.demo3log.logback.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @author lsf
 * @className LogController
 * @description log日志示例
 * @date 2020/1/2017:53
 *
 */
@RestController
@RequestMapping("log/")
public class LogController {
    private static final Logger log = LoggerFactory.getLogger(LogController.class);

    @RequestMapping("add")
    public String addLog(HttpServletRequest servletRequest) {
        String strlog = servletRequest.getParameter("log");
        log.info("==========print log==========" + "\n" + strlog);
        return strlog;
    }
}
