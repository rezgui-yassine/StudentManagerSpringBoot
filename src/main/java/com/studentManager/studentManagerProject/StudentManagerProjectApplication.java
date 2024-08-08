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

	@GetMapping("/getData")
	public Message getData() {
		ArrayList<String> list = new ArrayList<>();
		list.add("Hello");
		list.add("World");
		list.add("Java");
		return new Message("Hello World", list);
	}
	// for record message in database
	// create class Message with getter and setter with attribute message
	//record  Message (String message) {}

	class Message {
		private final String message;
			ArrayList<String> list = new ArrayList<>();

        Message(String message, ArrayList<String> list) {
			this.list = list;
            this.message = message;
        }

		public String getMessage() {
			return message;
		}

		public ArrayList<String> getList() {
			return list;
		}

		public void setList(ArrayList<String> list) {
			this.list = list;
		}

		@Override
		public String toString() {
			return "Message{" +
					"message='" + message + '\'' +
					'}';
		}
	}

}
