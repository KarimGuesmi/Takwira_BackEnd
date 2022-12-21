package net.javaguides.springboot.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;

@Entity
public class User implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idUser;
	private String nom;
	private String prenom;
	private String username;
	private String email;
	private String password;
	private String confirmpassword;
	
	@ManyToMany
	@JoinTable(name = "userRole", joinColumns = @JoinColumn(name="idUser"), inverseJoinColumns = @JoinColumn(name="idRole"))
	private List<Role> listRole = new ArrayList<>();
	
	public void ajoutRole(Role r) {
		this.listRole.add(r);
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(int idUser, String nom, String prenom, String username, String email, String password,
			String confirmpassword, List<Role> listRole) {
		super();
		this.idUser = idUser;
		this.nom = nom;
		this.prenom = prenom;
		this.username = username;
		this.email = email;
		this.password = password;
		this.confirmpassword = confirmpassword;
		this.listRole = listRole;
	}

	
	public int getIdUser() {
		return idUser;
	}

	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getConfirmpassword() {
		return confirmpassword;
	}

	public void setConfirmpassword(String confirmpassword) {
		this.confirmpassword = confirmpassword;
	}

	public List<Role> getListRole() {
		return listRole;
	}

	public void setListRole(List<Role> listRole) {
		this.listRole = listRole;
	}

	@Override
	public String toString() {
		return "User [idUser=" + idUser + ", nom=" + nom + ", prenom=" + prenom + ", username=" + username + ", email="
				+ email + ", password=" + password + ", confirmpassword=" + confirmpassword + ", listRole=" + listRole
				+ "]";
	}
	
	
}
