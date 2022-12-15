package net.javaguides.springboot.services;

import java.util.List;

import net.javaguides.springboot.entities.Joueur;

public interface IServiceJoueur {

	public Joueur addJoueur(Joueur joueur);
	public List<Joueur> addListJoueur(List<Joueur>listJoueur);
	
	
	public Joueur updateJoueur(Joueur joueur, Long id);
	public void deleteJoueur(Long idJoueur);

	public String addJoueurWTCP(Joueur joueur);
	public String addJoueurWTUN(Joueur joueur);
	
	public Joueur findJoueurByUsername(String username);
	public List<Joueur>findListJoueurByUsername(String username);
}
