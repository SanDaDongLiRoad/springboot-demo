package com.xulizhi.demo.dto;

import java.io.Serializable;

/**
 * @author lenovo
 */
public class UserDTO implements Serializable{

    private static final long serialVersionUID = -8094009881007862816L;
    /**
     * 用户ID
     */
    private String id;

    /**
     * 用户名
     */
    private String name;

    /**
     * 密码
     */
    private String password;

    /**
     * 年龄
     */
    private Integer age;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "UserDTO{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
                '}';
    }
}
