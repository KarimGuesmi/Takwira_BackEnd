package net.javaguides.springboot.entities;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class MatchesTournois implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String equipe1;
	private String equipe2;
	private String date;
	private String terrain;
	private String heure;
	
	public MatchesTournois() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MatchesTournois(int id, String equipe1, String equipe2, String date, String terrain, String heure) {
		super();
		
		this.equipe1 = equipe1;
		this.equipe2 = equipe2;
		this.date = date;
		this.terrain = terrain;
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

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getTerrain() {
		return terrain;
	}

	public void setTerrain(String terrain) {
		this.terrain = terrain;
	}

	public String getHeure() {
		return heure;
	}

	public void setHeure(String heure) {
		this.heure = heure;
	}

	@Override
	public String toString() {
		return "MatchesTournois [id=" + id + ", equipe1=" + equipe1 + ", equipe2=" + equipe2 + ", date=" + date
				+ ", terrain=" + terrain + ", heure=" + heure + "]";
	}
	
	
	
}
