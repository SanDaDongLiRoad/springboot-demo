package com.xulizhi.demo.domain;

import com.xulizhi.demo.common.BaseDomain;

import javax.persistence.Entity;

/**
 * @author 10133
 */
@Entity
public class User extends BaseDomain {

    /**
     * 用户名字
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
}
