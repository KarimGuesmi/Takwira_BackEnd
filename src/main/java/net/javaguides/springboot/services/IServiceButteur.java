package net.javaguides.springboot.services;

import java.util.List;

import net.javaguides.springboot.entities.ButteursTournois;
import net.javaguides.springboot.entities.Joueur;

public interface IServiceButteur {
	public ButteursTournois addButteur(ButteursTournois butteur);
	public List<ButteursTournois> addListButteur(List<ButteursTournois> listButteur);
	
	public ButteursTournois updateButteur(ButteursTournois butteur, Long id);
	public void deleteButteur(Long idButteur);
}
