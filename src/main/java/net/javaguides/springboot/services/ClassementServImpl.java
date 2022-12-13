package net.javaguides.springboot.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.javaguides.springboot.entities.ClassementTournois;
import net.javaguides.springboot.repository.ClassementTournoisRepository;

@Service
public class ClassementServImpl implements IServiceClassement {

	@Autowired
	ClassementTournoisRepository classementRep;
	
	@Override
	public ClassementTournois addClassement(ClassementTournois classement) {
		return classementRep.save(classement);
	}

	@Override
	public List<ClassementTournois> addListClassement(List<ClassementTournois> listClassement) {
		return classementRep.saveAll(listClassement);
	}

}
