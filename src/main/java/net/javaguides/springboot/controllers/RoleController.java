package net.javaguides.springboot.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import net.javaguides.springboot.entities.Role;
import net.javaguides.springboot.services.RoleServImpl;

@RestController
public class RoleController {

	@Autowired
	RoleServImpl roleServ;
	
	@PostMapping(value = "/addRole")
	public Role addRole(@RequestBody Role role) {
		return roleServ.addRole(role);
	}
}
