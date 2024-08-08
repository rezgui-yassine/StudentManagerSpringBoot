package com.studentManager.studentManagerProject.controller;

import com.studentManager.studentManagerProject.models.Student;
import com.studentManager.studentManagerProject.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping("/allStudents")
    public List<Student> displayStudents() {
        return studentService.getAllStudents();
    }
    @GetMapping("/studentById/{id}")
    public Student displayStudentById(@PathVariable Integer id) {

        return studentService.getStudentById(id);
    }
}