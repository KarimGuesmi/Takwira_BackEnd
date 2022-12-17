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
import net.javaguides.springboot.entities.MatchesTournois;
import net.javaguides.springboot.services.MatchesServImpl;

@RestController
public class MatchesTournoisController {

	@Autowired
	MatchesServImpl matcheServ;
	
	@PostMapping(value = "/addMatche")
	public MatchesTournois addMatche(@RequestBody MatchesTournois matche) {
		return matcheServ.addMatche(matche);
	}
	
	@PostMapping(value = "/addListMatche")
	public List<MatchesTournois> addMatche(@RequestBody List<MatchesTournois> listMatche) {
		return matcheServ.addListMatche(listMatche);
	}
	
	// Update Controller
	@PutMapping(value = "/updateMatche/{idM}")
	public MatchesTournois updateMatche(@RequestBody MatchesTournois matche, @PathVariable("idM") Long id) {		
		return matcheServ.updateMatche(matche, id);
	}
	
	// Delete Controller
	@DeleteMapping(value = "/deleteMatche/{idM}")
	public void deleteMatche(@PathVariable("idM") Long id) {
		matcheServ.deleteMatche(id);
	}
}
