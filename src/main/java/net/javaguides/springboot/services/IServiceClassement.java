package net.javaguides.springboot.services;

import java.util.List;

import net.javaguides.springboot.entities.ClassementTournois;

public interface IServiceClassement {
	public ClassementTournois addClassement(ClassementTournois classement);
	public List<ClassementTournois> addListClassement(List<ClassementTournois> listClassement);
}
