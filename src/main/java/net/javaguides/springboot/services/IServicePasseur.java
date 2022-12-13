package net.javaguides.springboot.services;

import java.util.List;

import net.javaguides.springboot.entities.PasseursTournois;

public interface IServicePasseur {
	public PasseursTournois addPasseur(PasseursTournois passeur);
	public List<PasseursTournois> addListPasseur(List<PasseursTournois> listPasseur);
}
