package com.stu.entity;

import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 *
 * @User: @Created by yangtk
 * @Date: @Date 2020/1/8 21:51
 * @To change this template use File | Settings | File Templates.
 */

public class UserInfo implements Serializable {

    private Long id;
    private String name;
    private String lastName;
    private String sex;
    private Integer age;

    public Long getId() {
        return id;
    }

    public UserInfo setId(Long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public UserInfo setName(String name) {
        this.name = name;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public UserInfo setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public String getSex() {
        return sex;
    }

    public UserInfo setSex(String sex) {
        this.sex = sex;
        return this;
    }

    public Integer getAge() {
        return age;
    }

    public UserInfo setAge(Integer age) {
        this.age = age;
        return this;
    }
}
