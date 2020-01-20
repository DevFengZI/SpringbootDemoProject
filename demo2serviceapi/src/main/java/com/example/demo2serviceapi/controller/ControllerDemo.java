package com.example.demo2serviceapi.controller;

import com.example.demo2serviceapi.entity.UserInfo;
import com.example.demo2serviceapi.entity.pojo.UserInfoPojo;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

/**
 * @author Administrator
 * @className ControllerDemo
 * @description Spring 接口入参的几种方式
 * @date 2020/1/20 14:24
 */
@RestController
@RequestMapping("api/")
public class ControllerDemo {

    /**
     * 都适用
     * http://localhost:8080/api/get?string=a
     */
    @RequestMapping("get")
    public String addStrApi(String string) {
        return string + "都适用";
    }

    @RequestMapping("getBean")
    public UserInfo addBeanApi(UserInfoPojo userInfoPojo) {
        UserInfo userInfo = new UserInfo();
        userInfo.setAge(userInfo.getAge());
        userInfo.setSex(userInfoPojo.getSex());
        userInfo.setUserName(userInfoPojo.getUserName());
        userInfo.setTag(userInfoPojo.toString());
        return userInfo;
    }

    /**
     * Get  和  post 都支持
     * post http://localhost:8080/api/httpservlet
     * get  http://localhost:8080/api/httpservlet?name=a
     *
     * @param httpServletRequest
     * @return
     */
    @RequestMapping("httpservlet")
    public String addStrApi(HttpServletRequest httpServletRequest) {
        String name = httpServletRequest.getParameter("name");
        return name + "都适用";
    }

    /**
     * 适用Get
     * http://localhost:8080/api/getrequestparam?name=a
     *
     * @param str
     * @return
     */
    @RequestMapping(value = "getrequestparam", method = RequestMethod.GET)
    public String addStrApp(@RequestParam("name") String str) {
        return str + "只使用Get";
    }

    /**
     * Post
     *
     * @param str
     * @return
     */
    @RequestMapping(value = "postrequestbody", method = RequestMethod.POST)
    public String addStrAppPost(@RequestBody String str) {
        return str + "只使用Post";
    }

    /**
     * 适用 Post and Get
     *
     * @param str
     * @return
     */
    @RequestMapping(value = "httprequestbody")
    public String addStrAppHttp(@RequestBody String str) {
        return str + "Post and Get";
    }

}
