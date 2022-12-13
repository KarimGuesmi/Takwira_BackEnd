package net.javaguides.springboot.entities;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class ResultatsTournois implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String equipe1;
	private int butsEquipe1;
	private String equipe2;
	private int butsEquipe2;
	
	public ResultatsTournois() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ResultatsTournois(int id, String equipe1, int butsEquipe1, String equipe2, int butsEquipe2) {
		super();
		
		this.equipe1 = equipe1;
		this.butsEquipe1 = butsEquipe1;
		this.equipe2 = equipe2;
		this.butsEquipe2 = butsEquipe2;
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
	public int getButsEquipe1() {
		return butsEquipe1;
	}
	public void setButsEquipe1(int butsEquipe1) {
		this.butsEquipe1 = butsEquipe1;
	}
	public String getEquipe2() {
		return equipe2;
	}
	public void setEquipe2(String equipe2) {
		this.equipe2 = equipe2;
	}
	public int getButsEquipe2() {
		return butsEquipe2;
	}
	public void setButsEquipe2(int butsEquipe2) {
		this.butsEquipe2 = butsEquipe2;
	}
	@Override
	public String toString() {
		return "ResultatsTournois [id=" + id + ", equipe1=" + equipe1 + ", butsEquipe1=" + butsEquipe1 + ", equipe2="
				+ equipe2 + ", butsEquipe2=" + butsEquipe2 + "]";
	}
	
	
}
