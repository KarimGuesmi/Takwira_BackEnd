package net.javaguides.springboot.entities;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Terrain implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nomTerrain;
	private String responsable;
	private Long telephone;
	private String cite;
	private String ville;
	
	public Terrain() {
		super();
	}
	public Terrain(int id, String nomTerrain, String responsable, Long telephone, String cite, String ville) {
		super();
		
		this.nomTerrain = nomTerrain;
		this.responsable = responsable;
		this.telephone = telephone;
		this.cite = cite;
		this.ville = ville;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNomTerrain() {
		return nomTerrain;
	}
	public void setNomTerrain(String nomTerrain) {
		this.nomTerrain = nomTerrain;
	}
	public String getResponsable() {
		return responsable;
	}
	public void setResponsable(String responsable) {
		this.responsable = responsable;
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
	@Override
	public String toString() {
		return "Terrain [id=" + id + ", nomTerrain=" + nomTerrain + ", responsable=" + responsable + ", telephone="
				+ telephone + ", cite=" + cite + ", ville=" + ville + "]";
	}
	
	
	
}
