package net.javaguides.springboot.entities;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class PasseursTournois implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nom;
	private String prenom;
	private int passes;
	private int mp;
	public PasseursTournois() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PasseursTournois(String nom, String prenom, int passes, int mp) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.passes = passes;
		this.mp = mp;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public int getPasses() {
		return passes;
	}
	public void setPasses(int passes) {
		this.passes = passes;
	}
	public int getMp() {
		return mp;
	}
	public void setMp(int mp) {
		this.mp = mp;
	}
	@Override
	public String toString() {
		return "PasseursTournois [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", passes=" + passes + ", mp="
				+ mp + "]";
	}
	
	
}
