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
	
	@Override
	public Joueur addJoueur(Joueur joueur) {
		return joueurRep.save(joueur);
	}

	@Override
	public List<Joueur> addListJoueur(List<Joueur> listJoueur) {
		return joueurRep.saveAll(listJoueur);
	}

	
}
