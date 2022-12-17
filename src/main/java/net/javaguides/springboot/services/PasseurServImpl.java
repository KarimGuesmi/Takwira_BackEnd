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

	@Override
	public PasseursTournois updatePasseur(PasseursTournois passeur, Long id) {
		PasseursTournois pas = passeurRep.findById(id).get();
		pas.setNom(passeur.getNom());
		pas.setPrenom(passeur.getPrenom());
		pas.setMp(passeur.getMp());
		pas.setPasses(passeur.getPasses());
		
		return passeurRep.save(pas);
	}

	@Override
	public void deletePasseur(Long idPasseur) {
		passeurRep.deleteById(idPasseur);
	}

}
