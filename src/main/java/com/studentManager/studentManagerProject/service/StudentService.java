package com.studentManager.studentManagerProject.service;

import com.studentManager.studentManagerProject.models.Student;
import com.studentManager.studentManagerProject.reposotery.RepoStudent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private RepoStudent repoStudent;

    public List<Student> getAllStudents() {
        return repoStudent.findAll();
    }
    // get student by id
    public Student getStudentById(Integer id){
        return repoStudent.findById(id).orElse(null);
    }
    // add student
    public void addStudent(Student student){
        repoStudent.save(student);
    }
    // delete student
    public void deleteStudent(Integer id) {
        if (!repoStudent.existsById(id)) {
            throw new RuntimeException("Student not found with id: " + id);
        }
        repoStudent.deleteById(id);
    }
}