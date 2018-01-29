package com.sapient.MyTestDB.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sapient.MyTestDB.model.Student;
import com.sapient.MyTestDB.repo.StudentRepo;

@RestController
@RequestMapping("/api")
public class Mycontroller {
	@Autowired
	StudentRepo studentRepo;
	
	@GetMapping("/test")
	String  showmyName() {
		System.out.println("Sunil ");
		return "SUNIL";
	}
	@GetMapping("/student")
	List<Student>  getAllStudent() {
		System.out.println("Student ");
		return	studentRepo.findAll();
		 
	}
	
	

}
