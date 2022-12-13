package net.javaguides.springboot.services;

import java.util.List;

import net.javaguides.springboot.entities.MatchesTournois;

public interface IServiceMatches {
	public MatchesTournois addMatche(MatchesTournois matche);
	public List<MatchesTournois> addListMatche(List<MatchesTournois> listMatche);
}
