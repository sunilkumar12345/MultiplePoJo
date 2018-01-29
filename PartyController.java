package com.sapient.MyTestDB.Controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.sapient.MyTestDB.model.Party;
import com.sapient.MyTestDB.model.Student;
import com.sapient.MyTestDB.repo.PartyRepo;

@RestController
@RequestMapping("/api")
public class PartyController {
	@Autowired
	PartyRepo partyRepo;
	
	@GetMapping("/party")
	List<Party>  getAllParty() {
		System.out.println("Party ");
		return	partyRepo.findAll();
		 
	}
	@PostMapping("/party")
	Party  SubmitAllParty(@Valid @RequestBody Party party) {
		System.out.println("Party ");
		return	partyRepo.save(party);
		 
	}
}
