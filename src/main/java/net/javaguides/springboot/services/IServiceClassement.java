package net.javaguides.springboot.services;

import java.util.List;

import net.javaguides.springboot.entities.ClassementTournois;
import net.javaguides.springboot.entities.Joueur;

public interface IServiceClassement {
	public ClassementTournois addClassement(ClassementTournois classement);
	public List<ClassementTournois> addListClassement(List<ClassementTournois> listClassement);
	
	public ClassementTournois updateClassement(ClassementTournois classement, Long id);
	public void deleteClassement(Long idClassement);
}
