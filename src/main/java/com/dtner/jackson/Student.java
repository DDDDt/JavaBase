package com.dtner.jackson;

import java.util.List;

/**
 * @author dt
 * @description:
 * @create 2022-07-01 16:50
 */
public class Student {

    private String name;

    private Integer age;

    private List<Student> list;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public List<Student> getList() {
        return list;
    }

    public void setList(List<Student> list) {
        this.list = list;
    }
}
