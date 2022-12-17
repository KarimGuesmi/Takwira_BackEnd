package net.javaguides.springboot.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import net.javaguides.springboot.entities.Joueur;
import net.javaguides.springboot.entities.PasseursTournois;
import net.javaguides.springboot.services.PasseurServImpl;

@RestController
public class PasseursTournoisController {
	
	@Autowired
	PasseurServImpl passeurServ;
	
	@PostMapping(value = "/addPasseur")
	public PasseursTournois addPasseur(@RequestBody PasseursTournois passeur) {
		return passeurServ.addPasseur(passeur);
	}
	
	@PostMapping(value = "/addListPasseur")
	public List<PasseursTournois>addPasseur(@RequestBody List<PasseursTournois> listPasseur) {
		return passeurServ.addListPasseur(listPasseur);
	}
	
	// Update Controller
	@PutMapping(value = "/updatePasseur/{idP}")
	public PasseursTournois updatePasseur(@RequestBody PasseursTournois passeur, @PathVariable("idP") Long id) {		
		return passeurServ.updatePasseur(passeur, id);
	}
	
	// Delete Controller
	@DeleteMapping(value = "/deletePasseur/{idP}")
	public void deletePasseur(@PathVariable("idP") Long id) {
		passeurServ.deletePasseur(id);
	}

}
