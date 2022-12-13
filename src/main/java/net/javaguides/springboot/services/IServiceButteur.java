package net.javaguides.springboot.services;

import java.util.List;

import net.javaguides.springboot.entities.ButteursTournois;

public interface IServiceButteur {
	public ButteursTournois addButteur(ButteursTournois butteur);
	public List<ButteursTournois> addListButteur(List<ButteursTournois> listButteur);
}
