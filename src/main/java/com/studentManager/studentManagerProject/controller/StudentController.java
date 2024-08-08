package com.studentManager.studentManagerProject.controller;


import com.studentManager.studentManagerProject.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class StudentController {
    // for define endPoint and return data to the client
    private  StudentService studentService;

    // constructor injection for studentService object to be injected into the StudentController
    @Autowired
    public StudentController(StudentService studentService){
        this.studentService = studentService;
    }



    @GetMapping("/students")
    public ArrayList<String>displayStudents(){

        return studentService.getStdnts();
    }
}
