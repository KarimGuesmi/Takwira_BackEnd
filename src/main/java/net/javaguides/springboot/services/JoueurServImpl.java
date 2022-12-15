package net.javaguides.springboot.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.javaguides.springboot.entities.Joueur;
import net.javaguides.springboot.repository.JoueurRepository;

@Service
public class JoueurServImpl implements IServiceJoueur{

	@Autowired
	JoueurRepository joueurRep;
	
	//Add a single Joueur
	@Override
	public Joueur addJoueur(Joueur joueur) {
		return joueurRep.save(joueur);
	}

	//Add List Of Joueurs
	@Override
	public List<Joueur> addListJoueur(List<Joueur> listJoueur) {
		return joueurRep.saveAll(listJoueur);
	}

	//Update Joueur
	@Override
	public Joueur updateJoueur(Joueur joueur, Long id) {
		Joueur jr  = joueurRep.findById(id).get();
		jr.setNom(joueur.getNom());
		jr.setPrenom(joueur.getPrenom());
		jr.setUsername(joueur.getUsername());
		jr.setAge(joueur.getAge());
		jr.setCite(joueur.getCite());
		jr.setCode(joueur.getCode());
		jr.setEmail(joueur.getEmail());
		jr.setPassword(joueur.getPassword());
		jr.setConfirmpassword(joueur.getConfirmpassword());
		jr.setPoste(joueur.getPoste());
		jr.setTelephone(joueur.getTelephone());
		jr.setVille(joueur.getVille());
		
		return joueurRep.save(jr);
	}

	//Delete Joueur
	@Override
	public void deleteJoueur(Long idJoueur) {
		joueurRep.deleteById(idJoueur);
	}

	// Add Joueur With test confirm password
	@Override
	public String addJoueurWTCP(Joueur joueur) {
		String test = "";
		
		if (joueur.getPassword().equals(joueur.getConfirmpassword())) {
			joueurRep.save(joueur);
			test = "Joueur added successfully";
		}else
			test = "Warning !!! Password doesn't match";
		
		return test;
	}

	// Add Joueur With test username
	@Override
	public String addJoueurWTUN(Joueur joueur) {
		String test = "";
		if(joueurRep.existsByUsername(joueur.getUsername())) {
			test = "UserName already exists !!";
		}else {
			joueurRep.save(joueur);
			test = "Joueur added successfully";
		}
		return test;
	}

	// Search and find Joueur by Specify username
	@Override
	public Joueur findJoueurByUsername(String username) {
		return joueurRep.findByUsername(username);
	}

	// Search and find list of Joueurs by username starts with a specific caracter
	@Override
	public List<Joueur> findListJoueurByUsername(String ch) {
		return joueurRep.findListJoueurByUsername(ch);
	}

	

	
}
