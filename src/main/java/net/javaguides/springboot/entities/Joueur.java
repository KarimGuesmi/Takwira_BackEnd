package net.javaguides.springboot.entities;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Joueur implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String equipe;
	private String nom;
	private String prenom;
	private String poste;
	private int age;
	private Long telephone;	
	private String cite;
	private String ville;
	private Long code;
	private String email;
	private String password;
	
	
	public Joueur() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Joueur(int id, String equipe, String nom, String prenom, String poste, int age, Long telephone, String cite,
			String ville, Long code, String email, String password) {
		super();
		
		this.equipe = equipe;
		this.nom = nom;
		this.prenom = prenom;
		this.poste = poste;
		this.age = age;
		this.telephone = telephone;
		this.cite = cite;
		this.ville = ville;
		this.code = code;
		this.email = email;
		this.password = password;
		
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEquipe() {
		return equipe;
	}
	public void setEquipe(String equipe) {
		this.equipe = equipe;
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
	public String getPoste() {
		return poste;
	}
	public void setPoste(String poste) {
		this.poste = poste;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Long getTelephone() {
		return telephone;
	}
	public void setTelephone(Long telephone) {
		this.telephone = telephone;
	}
	public String getCite() {
		return cite;
	}
	public void setCite(String cite) {
		this.cite = cite;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	public Long getCode() {
		return code;
	}
	public void setCode(Long code) {
		this.code = code;
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
	@Override
	public String toString() {
		return "Joueur [id=" + id + ", equipe=" + equipe + ", nom=" + nom + ", prenom=" + prenom + ", poste=" + poste
				+ ", age=" + age + ", telephone=" + telephone + ", cite=" + cite + ", ville=" + ville + ", code=" + code
				+ ", email=" + email + ", password=" + password + "]";
	}
	
	
//	
}
