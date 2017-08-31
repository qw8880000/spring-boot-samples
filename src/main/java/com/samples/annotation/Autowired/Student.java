package com.samples.annotation.Autowired;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2017-08-30.
 */
public class Student {
    private String name;

    public Student(String name) {
        System.out.println("student constructed");
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void init() {
        System.out.println("student init");
    }
    public void destroy() {
        System.out.println("student destroy");
    }
}
