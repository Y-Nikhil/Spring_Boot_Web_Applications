package com.ashokit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.ashokit.entity.Student;
import com.ashokit.service.StudentService;

@Controller
public class StudentController {

	@Autowired
	private StudentService service;
	
	@GetMapping("/page")
	public String loadIndexPage(Model model) {
		init(model);
		return "index";
	}

	private void init(Model model) {
		model.addAttribute("student", new Student());
		model.addAttribute("courses", service.getCourses());
		model.addAttribute("preferTimings", service.getTimings());
	}
	
	@PostMapping("/save")
	public String handleSubmitBtn(Student s, Model model) {
		System.out.println(s);
		model.addAttribute("msg", "Data saved...");
		init(model);
		
		return "index";
	}
}
