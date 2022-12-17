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

	@Override
	public MatchesTournois updateMatche(MatchesTournois matche, Long id) {
		MatchesTournois mtch = matcheRep.findById(id).get();
		mtch.setEquipe1(matche.getEquipe1());
		mtch.setEquipe2(matche.getEquipe2());
		mtch.setDate(matche.getDate());
		mtch.setHeure(matche.getHeure());
		mtch.setTerrain(matche.getTerrain());
		
		return matcheRep.save(mtch);
	}

	@Override
	public void deleteMatche(Long idMatche) {
		matcheRep.deleteById(idMatche);
		
	}
	

}
