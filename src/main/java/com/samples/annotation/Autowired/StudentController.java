package com.samples.annotation.Autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2017-08-30.
 */
@RestController
public class StudentController {

    @Autowired
    private Student student;

    @RequestMapping("/student")
    String getStudentName(){
        return student.getName();
    }
}
