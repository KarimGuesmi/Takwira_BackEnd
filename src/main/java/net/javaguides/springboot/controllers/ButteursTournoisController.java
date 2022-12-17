package net.javaguides.springboot.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import net.javaguides.springboot.entities.ButteursTournois;
import net.javaguides.springboot.entities.Joueur;
import net.javaguides.springboot.services.ButteurServImpl;

@RestController
public class ButteursTournoisController {
	@Autowired
	ButteurServImpl butteurServ;
	
	@PostMapping(value = "/addButteur")
	public ButteursTournois addButteur(@RequestBody ButteursTournois butteur) {
		return butteurServ.addButteur(butteur);
	}
	
	@PostMapping(value = "/addListButteur")
	public List<ButteursTournois> addButteur(@RequestBody List<ButteursTournois> listButteur) {
		return butteurServ.addListButteur(listButteur);
	}

	// Update Controller
	@PutMapping(value = "/updateButteur/{idB}")
	public ButteursTournois updateButteur(@RequestBody ButteursTournois butteur, @PathVariable("idB") Long id) {		
		return butteurServ.updateButteur(butteur, id);
	}
	
	// Delete Controller
	@DeleteMapping(value = "/deleteButteur/{idB}")
	public void deleteButteur(@PathVariable("idB") Long id) {
		butteurServ.deleteButteur(id);
	}
}
