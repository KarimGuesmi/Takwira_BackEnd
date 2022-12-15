package net.javaguides.springboot.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.javaguides.springboot.entities.Role;
import net.javaguides.springboot.repository.IRoleRepository;

@Service
public class RoleServImpl implements IRoleService{

	@Autowired
	IRoleRepository roleRep;
	
	@Override
	public Role addRole(Role role) {
		return roleRep.save(role);
	}

}
