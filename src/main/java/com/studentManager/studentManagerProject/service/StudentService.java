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

    // update student
   /* public void updateStudent(Student student){
      if (!repoStudent.existsById(student.getId())){
          throw  new RuntimeException("Student not found with id: "+student.getId());

        } else {
          Student student1 = new Student();
          student1.setFirstName(student.getFirstName());
          student1.setLastname(student.getLastname());
          student1.setEmail(student.getEmail());
          student1.setPhone(student.getPhone());
          student1.setAddress(student.getAddress());
      }

    }*/


    public void updateStudent(Student student) throws IllegalAccessException {

            Student existingStudent = repoStudent.findById(student.getId()).orElse(null);
            if (existingStudent != null) {
                existingStudent.setFirstName(student.getFirstName());
                existingStudent.setLastname(student.getLastname());
                existingStudent.setEmail(student.getEmail());
                existingStudent.setPhone(student.getPhone());
                existingStudent.setAddress(student.getAddress());
                repoStudent.save(existingStudent);
            }
            else {
                throw new IllegalAccessException("Student not found with id: " + student.getId());
            }
        }

}