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

}
