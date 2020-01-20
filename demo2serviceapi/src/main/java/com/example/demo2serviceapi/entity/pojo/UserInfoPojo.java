package com.example.demo2serviceapi.entity.pojo;

/**
 * @author lsf
 * @className UserInfoPojo
 * @description 用户pojo 最原始的 get set 无任何逻辑判断
 * @date 2020/1/2016:29
 */
public class UserInfoPojo {
    @Override
    public String toString() {
        return "UserInfoPojo{" +
                "userName='" + userName + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                '}';
    }

    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    /**
     * 用户名
     */
    private String userName;

    /**
     * 性别
     */
    private int sex;

    /**
     * 年纪
     */
    private int age;
}
