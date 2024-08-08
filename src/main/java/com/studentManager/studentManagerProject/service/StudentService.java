package com.studentManager.studentManagerProject.service;

import org.springframework.stereotype.Component;

import java.util.ArrayList;


@Component
public class StudentService {

    public ArrayList<String> getStdnts(){
        ArrayList<String> students = new ArrayList<>();
        students.add("Student 1");
        students.add("Student 2");
        students.add("Student 3");
        return students;
    }

}
