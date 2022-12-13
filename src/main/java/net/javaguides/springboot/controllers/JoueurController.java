package net.javaguides.springboot.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
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
	
	@PostMapping(value = "/addJoueur")
	public Joueur addJoueur(@RequestBody Joueur joueur) {
		return joueurServ.addJoueur(joueur);
	}
	
	@PostMapping(value = "/addListJoueur")
	public List<Joueur>addJoueur(@RequestBody List<Joueur> listJoueur) {
		return joueurServ.addListJoueur(listJoueur);
	}
}