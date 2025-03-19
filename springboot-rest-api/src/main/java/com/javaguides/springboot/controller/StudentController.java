package com.javaguides.springboot.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.javaguides.springboot.bean.Student;

@RestController
public class StudentController {

	// create spring boot rest api return java bean(json) to client



	@GetMapping("student")
	public Student getStudent() {
		Student student = new Student(1, "ram", "sharma");
		return student;

	}

	// create spring boot rest api returns List(json format)
	// now lets use this java method to create rest api using spring annotations
	// client will get response in json format
	// we return student java bean as json to client

	// we will create java method that will return list of students and then make
	// that java method as rest apis using spring annotations

	@GetMapping("students")
	public List<Student> getStudents() {

		List<Student> students = new ArrayList<>();

		students.add(new Student(1, "naman", "sharma"));
		students.add(new Student(2, "raman", "sharma"));
		students.add(new Student(3, "ram", "jadhav"));

		return students;

	}

	// create springboot rest api with path variable
	// path variable ann used on method arg to bind it to the value of a uri
	// template variable

	@GetMapping("students/{id}/{first-name}/{last-name}")
	public Student studentPathVariable(@PathVariable("id") int student_id, @PathVariable("first-name") String firstName,
			@PathVariable("last-name") String lastName) {
		return new Student(student_id, firstName, lastName);
	}

	// create springboot rest api with request param

	// localhost:8080/students/query?id=1&firstName=ram&lastName=jain =>RequestParam
	// type

	@GetMapping("students/query")
	public Student studentRequestVariable(@RequestParam int id, @RequestParam String firstName,
			@RequestParam String lastName) {

		return new Student(id, firstName, lastName);

	}

	// springboot postgressql hibernate restful crud api tutorial

}
