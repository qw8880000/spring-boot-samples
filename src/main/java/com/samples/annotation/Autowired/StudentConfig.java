package com.samples.annotation.Autowired;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Administrator on 2017-08-31.
 */
@Configuration
public class StudentConfig {

    @Bean(initMethod = "init", destroyMethod = "destroy")
    public Student student() {
        return new Student("I'm a student");
    }
}
