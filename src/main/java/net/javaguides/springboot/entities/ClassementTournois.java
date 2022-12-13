package net.javaguides.springboot.entities;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class ClassementTournois implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String equipe;
	private int buts;
	private int mp;
	private int v;
	private int n;
	private int d;
	private int pts;
	public ClassementTournois() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ClassementTournois(int id, String equipe, int buts, int mp, int v, int n, int d, int pts) {
		super();
		
		this.equipe = equipe;
		this.buts = buts;
		this.mp = mp;
		this.v = v;
		this.n = n;
		this.d = d;
		this.pts = pts;
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
	public int getV() {
		return v;
	}
	public void setV(int v) {
		this.v = v;
	}
	public int getN() {
		return n;
	}
	public void setN(int n) {
		this.n = n;
	}
	public int getD() {
		return d;
	}
	public void setD(int d) {
		this.d = d;
	}
	public int getPts() {
		return pts;
	}
	public void setPts(int pts) {
		this.pts = pts;
	}
	@Override
	public String toString() {
		return "ClassementTournois [id=" + id + ", equipe=" + equipe + ", buts=" + buts + ", mp=" + mp + ", v=" + v
				+ ", n=" + n + ", d=" + d + ", pts=" + pts + "]";
	}
	
	
	
}
