package net.javaguides.springboot.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.javaguides.springboot.entities.ResultatsTournois;
import net.javaguides.springboot.repository.ResultatsTournoisRepository;

@Service
public class ResultatServImpl implements IServiceResultat {

	@Autowired
	ResultatsTournoisRepository resultatRep;
	
	@Override
	public ResultatsTournois addResultat(ResultatsTournois resultat) {
		return resultatRep.save(resultat);
	}

	@Override
	public List<ResultatsTournois> addListResultat(List<ResultatsTournois> listResultat) {
		return resultatRep.saveAll(listResultat);
	}

}
