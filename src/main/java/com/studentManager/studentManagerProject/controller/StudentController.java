package com.studentManager.studentManagerProject.controller;


import com.studentManager.studentManagerProject.models.Student;
import com.studentManager.studentManagerProject.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class StudentController {
    // inject the service class to the controller with attribute
   @Autowired
    private  StudentService studentService;
    @GetMapping("/students")
    public ArrayList<Student>displayStudents(){

        return studentService.getAllStudnets();
    }
}
