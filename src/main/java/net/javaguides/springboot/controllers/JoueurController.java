package net.javaguides.springboot.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import net.javaguides.springboot.entities.Joueur;
import net.javaguides.springboot.services.JoueurServImpl;

@RestController
public class JoueurController {
	
	@Autowired
	JoueurServImpl joueurServ;
	
	@GetMapping(value = "/test/{firstName}/{lastName}")
	public String getMessage(@PathVariable("firstName") String firstName,
			@PathVariable("lastName") String lastName) {
		return "hello world !!!" + firstName+ " " +lastName ;
	}
	
	// Add Single Joueur Controller
	@PostMapping(value = "/addJoueur")
	public Joueur addJoueur(@RequestBody Joueur joueur) {
		return joueurServ.addJoueur(joueur);
	}
	
	// Add list of Joueur Controller
	@PostMapping(value = "/addListJoueur")
	public List<Joueur>addJoueur(@RequestBody List<Joueur> listJoueur) {
		return joueurServ.addListJoueur(listJoueur);
	}

	// Update Controller
	@PutMapping(value = "/updateJoueur/{idJ}")
	public Joueur updateJoueur(@RequestBody Joueur joueur, @PathVariable("idJ") Long id) {		
		return joueurServ.updateJoueur(joueur, id);
	}
	
	// Delete Controller
	@DeleteMapping(value = "/deleteJoueur/{idJ}")
	public void deleteJoueur(@PathVariable("idJ") Long id) {
		joueurServ.deleteJoueur(id);
	}
	
	// Add Single Joueur Controller with test confirm password
	@PostMapping(value = "/addJoueurWTCP")
	public String addJoueurWTCP(@RequestBody Joueur joueur) {
		return joueurServ.addJoueurWTCP(joueur);
	}

	// Add Single Joueur Controller with test Username
	@PostMapping(value = "/addJoueurWTUN")
	public String addJoueurWTUN(@RequestBody Joueur joueur) {
		return joueurServ.addJoueurWTUN(joueur);
	}
			
	// Get Joueur by searching it by Username
	@GetMapping(value="/getJoueurByUsername/{username}")
	public Joueur getJoueurByUsername(@PathVariable("username") String username) {
		return joueurServ.findJoueurByUsername(username);
	}
	
	// Get Joueur by Searching username which starts by a specific caracter
	@GetMapping(value = "/getAllJoueursStartsBySameCh/{ch}")
	public List<Joueur> getAllJoueursStartsBySameCh(@PathVariable("ch") String ch){
		return joueurServ.findListJoueurByUsername(ch); 
	}

	
}