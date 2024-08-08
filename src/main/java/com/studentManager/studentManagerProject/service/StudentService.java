package com.studentManager.studentManagerProject.service;

import com.studentManager.studentManagerProject.models.Student;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;


@Service
public class StudentService {

   /* public ArrayList<String> getStdnts(){
        ArrayList<String> students = new ArrayList<>();
        students.add("Ahmed");
        students.add("Mohamed");
        students.add("Ali");
        students.add("Omar");
        return students;
    }*/

    public ArrayList<Student> getAllStudnets(){
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(1,"Ahmed","Ali","rezguiyassine@gmail.com","123456789","Tunis"));
        students.add(new Student(2,"mohamed","Ali","mohamedyassine@gmail.com","123456789","Tunis"));
        students.add(new Student(3,"Ahmed","Ali","rezguiyassine@gmail.com","123456789","Tunis"));
        return students;
    }




}
