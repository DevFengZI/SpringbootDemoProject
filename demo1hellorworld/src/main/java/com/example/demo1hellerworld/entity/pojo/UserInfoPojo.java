package com.example.demo1hellerworld.entity.pojo;

/**
 * @author sf
 */
public class UserInfoPojo {
    /**
     * 用户id
     */
    private int userId;

    /**
     * 用户名称
     */
    private String username;

    /**
     * 年纪
     */
    private int age;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
