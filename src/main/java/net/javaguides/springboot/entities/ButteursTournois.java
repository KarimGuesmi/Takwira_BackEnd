package net.javaguides.springboot.entities;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class ButteursTournois implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nom;
	private String prenom;
	private int buts;
	private int mp;
	public ButteursTournois() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ButteursTournois(String nom, String prenom, int buts, int mp) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.buts = buts;
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
	public int getButs() {
		return buts;
	}
	public void setButs(int buts) {
		this.buts = buts;
	}
	public int getMp() {
		return mp;
	}
	public void setMp(int mp) {
		this.mp = mp;
	}
	@Override
	public String toString() {
		return "ButteursTournois [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", buts=" + buts + ", mp=" + mp
				+ "]";
	}
	
	
}
