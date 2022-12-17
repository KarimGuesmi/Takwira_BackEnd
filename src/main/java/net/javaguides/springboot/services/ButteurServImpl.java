package net.javaguides.springboot.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.javaguides.springboot.entities.ButteursTournois;
import net.javaguides.springboot.repository.ButteursTournoisRepository;

@Service
public class ButteurServImpl implements IServiceButteur {

	@Autowired
	ButteursTournoisRepository butteurRep;
	
	@Override
	public ButteursTournois addButteur(ButteursTournois butteur) {
		return butteurRep.save(butteur);
	}

	@Override
	public List<ButteursTournois> addListButteur(List<ButteursTournois> listButteur) {
		return butteurRep.saveAll(listButteur);
	}
	
	// Update ButteursTournois
	@Override
	public ButteursTournois updateButteur(ButteursTournois butteur, Long id) {
		ButteursTournois btr = butteurRep.findById(id).get();
		btr.setNom(butteur.getNom());
		btr.setPrenom(butteur.getPrenom());
		btr.setMp(butteur.getMp());
		btr.setButs(butteur.getButs());
		return butteurRep.save(btr);
	}

	// Delete ButteursTournois
	@Override
	public void deleteButteur(Long idButteur) {
		butteurRep.deleteById(idButteur);
	}

}
