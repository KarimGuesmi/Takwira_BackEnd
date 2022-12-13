package net.javaguides.springboot.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.javaguides.springboot.entities.PasseursTournois;
import net.javaguides.springboot.repository.PasseursTournoisRepository;

@Service
public class PasseurServImpl implements IServicePasseur{

	@Autowired
	PasseursTournoisRepository passeurRep;
	
	@Override
	public PasseursTournois addPasseur(PasseursTournois passeur) {
		return passeurRep.save(passeur);
	}

	@Override
	public List<PasseursTournois> addListPasseur(List<PasseursTournois> listPasseur) {
		return passeurRep.saveAll(listPasseur);
	}

}
