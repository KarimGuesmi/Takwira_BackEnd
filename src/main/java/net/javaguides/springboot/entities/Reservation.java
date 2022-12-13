package net.javaguides.springboot.entities;

import java.io.Serializable;
import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Reservation implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String equipe1;
	private String equipe2;
	private Long telephone;
	private String terrain;
	private String date;
	private String heure;
	
	public Reservation() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Reservation(int id, String equipe1, String equipe2, Long telephone, String terrain, String date, String heure) {
		super();
		
		this.equipe1 = equipe1;
		this.equipe2 = equipe2;
		this.telephone = telephone;
		this.terrain = terrain;
		this.date = date;
		this.heure = heure;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEquipe1() {
		return equipe1;
	}

	public void setEquipe1(String equipe1) {
		this.equipe1 = equipe1;
	}

	public String getEquipe2() {
		return equipe2;
	}

	public void setEquipe2(String equipe2) {
		this.equipe2 = equipe2;
	}

	public Long getTelephone() {
		return telephone;
	}

	public void setTelephone(Long telephone) {
		this.telephone = telephone;
	}

	public String getTerrain() {
		return terrain;
	}

	public void setTerrain(String terrain) {
		this.terrain = terrain;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getheure() {
		return heure;
	}

	public void setHeure(String heure) {
		this.heure = heure;
	}

	@Override
	public String toString() {
		return "Reservation [id=" + id + ", equipe1=" + equipe1 + ", equipe2=" + equipe2 + ", telephone=" + telephone
				+ ", terrain=" + terrain + ", date=" + date + ", heure=" + heure + "]";
	}
	
	
}
