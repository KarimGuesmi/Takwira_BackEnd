package net.javaguides.springboot.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import net.javaguides.springboot.entities.User;
import net.javaguides.springboot.services.UserServImpl;

@RestController
public class UserController {

	@Autowired
	UserServImpl userServ;
	
	// Add Single User Controller
	@PostMapping(value = "/addUser")
	public User addUser(@RequestBody User user) {
		return userServ.addUser(user);
	}
	
	@PostMapping(value = "/addUserRole/{idu}/{idr}")
	public User addUserRole(@PathVariable("idu")  Long idUser, @PathVariable("idr")  Long idRole) {
		return userServ.addUserRole(idUser, idRole);
	}
	
	@GetMapping(value="/getIdUserByIdRole")
	public List<Long> getIdUserByIdRole(){
		return userServ.findUserByIdRole();
		
	}
	
	@GetMapping(value="/getIdUserByIdRole/{idr}")
	public List<Long> getIdUserByIdRole( @PathVariable("idr") Long idr){
		return userServ.findIdUserByIdRole(idr);
		
	}
}
