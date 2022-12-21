package net.javaguides.springboot.services;

import java.util.List;

import net.javaguides.springboot.entities.Joueur;
import net.javaguides.springboot.entities.User;

public interface IServiceUser {

	public User addUser(User user);
	
	public User addUserRole(Long idUser, Long idRole);

	public List<Long> findUserByIdRole();
	
	public List<Long> findIdUserByIdRole(Long idr);
}
