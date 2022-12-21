package net.javaguides.springboot.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.javaguides.springboot.entities.Role;
import net.javaguides.springboot.entities.User;
import net.javaguides.springboot.repository.IRoleRepository;
import net.javaguides.springboot.repository.UserRepository;

@Service
public class UserServImpl implements IServiceUser{

	@Autowired
	UserRepository userRep;
	@Autowired
	IRoleRepository roleRep;
	
	@Override
	public User addUser(User user) {
		return userRep.save(user);
	}

	@Override
	public User addUserRole(Long idUser, Long idRole) {
		Role role = roleRep.findById(idRole).get();
		User user = userRep.findById(idUser).get();
		user.ajoutRole(role);
		return userRep.save(user);
	}

	@Override
	public List<Long> findUserByIdRole() {
		return userRep.findUserbyIdRole();
	}

	@Override
	public List<Long> findIdUserByIdRole(Long idr) {
		
		return userRep.findUsersbyIdRole(idr);
	}

}
