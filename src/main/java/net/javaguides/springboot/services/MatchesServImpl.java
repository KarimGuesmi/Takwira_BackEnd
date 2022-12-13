package net.javaguides.springboot.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.javaguides.springboot.entities.MatchesTournois;
import net.javaguides.springboot.repository.MatchesTournoisRepository;

@Service
public class MatchesServImpl implements IServiceMatches{

	@Autowired
	MatchesTournoisRepository matcheRep;
	
	@Override
	public MatchesTournois addMatche(MatchesTournois matche) {
		return matcheRep.save(matche);
	}

	@Override
	public List<MatchesTournois> addListMatche(List<MatchesTournois> listMatche) {
		return matcheRep.saveAll(listMatche);
	}
	

}
