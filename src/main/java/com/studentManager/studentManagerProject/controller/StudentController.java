package com.studentManager.studentManagerProject.controller;

import com.studentManager.studentManagerProject.models.Student;
import com.studentManager.studentManagerProject.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
    @PostMapping("/addStudent")
    public Student addStudent(@RequestBody Student student ){
        studentService.addStudent(student);
        return student;
    }
  /*  @DeleteMapping("/deleteStudent/{id}")
    public String deleteStudent(@PathVariable Integer id){
    studentService.deleteStudent(id);
    return "Student deleted with id: "+id;
    }*/
  // src/main/java/com/studentManager/studentManagerProject/controller/StudentController.java

  @DeleteMapping("/deleteStudent/{id}")
  public ResponseEntity<String> deleteStudent(@PathVariable Integer id) {
      try {
          studentService.deleteStudent(id);
          return ResponseEntity.ok("Student deleted with id: " + id);
      } catch (RuntimeException e) {
          return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
      }
  }
}