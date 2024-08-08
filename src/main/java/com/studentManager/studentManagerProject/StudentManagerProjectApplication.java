package com.studentManager.studentManagerProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@SpringBootApplication
@RestController// for define endPoint
@ResponseBody
public class StudentManagerProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagerProjectApplication.class, args);
	}



	// for record message in database
	// create class Message with getter and setter with attribute message
	//record  Message (String message) {}



}
