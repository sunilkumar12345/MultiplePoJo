package com.sapient.MyTestDB.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sapient.MyTestDB.model.Skill;
import com.sapient.MyTestDB.model.Student;
import com.sapient.MyTestDB.repo.SkillRepo;

@RestController
@RequestMapping("/api")
public class SkillController {
	@Autowired
   SkillRepo skillRepo;
	
	@GetMapping("/skill")
	List<Skill>  getAllSkill() {
		System.out.println("Skill ");
		return	skillRepo.findAll();
		 
	}
}
