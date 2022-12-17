package net.javaguides.springboot.services;

import java.util.List;

import net.javaguides.springboot.entities.Joueur;
import net.javaguides.springboot.entities.MatchesTournois;

public interface IServiceMatches {
	public MatchesTournois addMatche(MatchesTournois matche);
	public List<MatchesTournois> addListMatche(List<MatchesTournois> listMatche);
	
	public MatchesTournois updateMatche(MatchesTournois matche, Long id);
	public void deleteMatche(Long idMatche);
}
