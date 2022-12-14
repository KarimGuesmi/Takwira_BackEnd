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
		jr.setAge(joueur.getAge());
		jr.setCite(joueur.getCite());
		jr.setCode(joueur.getCode());
		jr.setEmail(joueur.getEmail());
		jr.setPassword(joueur.getPassword());
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

	

	
}
