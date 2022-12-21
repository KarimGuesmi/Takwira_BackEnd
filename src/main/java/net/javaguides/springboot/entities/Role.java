package net.javaguides.springboot.entities;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Role {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idRole;
	
	@Enumerated(EnumType.STRING)
	private RoleName rolename;

	@ManyToMany(mappedBy = "listRole")
	private List<User> listUsers = new ArrayList<>();
	
	public Role() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Role(int idRole, RoleName rolename) {
		super();
		this.idRole = idRole;
		this.rolename = rolename;
	}

	public int getIdRole() {
		return idRole;
	}

	public void setIdRole(int idRole) {
		this.idRole = idRole;
	}

	public RoleName getRolename() {
		return rolename;
	}

	public void setRolename(RoleName rolename) {
		this.rolename = rolename;
	}

	@Override
	public String toString() {
		return "Role [idRole=" + idRole + ", rolename=" + rolename + "]";
	}
	
	
}
