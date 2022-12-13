package net.javaguides.springboot.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import net.javaguides.springboot.entities.ClassementTournois;
import net.javaguides.springboot.services.ClassementServImpl;

@RestController
public class ClassementTournoisController {
	
	@Autowired
	ClassementServImpl classementServ;
	
	@PostMapping(value = "/addClassement")
	public ClassementTournois addClassement(@RequestBody ClassementTournois classement) {
		return classementServ.addClassement(classement); 	
	}
	
	@PostMapping(value = "/addListClassement")
	public List<ClassementTournois> addClassement(@RequestBody List<ClassementTournois> listClassement) {
		return classementServ.addListClassement(listClassement); 	
	}

}
