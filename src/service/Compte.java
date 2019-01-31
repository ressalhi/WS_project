package service;

import java.io.Serializable;
import java.time.LocalDate;

//une entité est serialisable
public class Compte implements Serializable {
	
	private int code;
	private double solde;
	private LocalDate dateCreation;
	public Compte() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Compte(int code, double solde, LocalDate dateCreation) {
		super();
		this.code = code;
		this.solde = solde;
		this.dateCreation = dateCreation;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public double getSolde() {
		return solde;
	}
	public void setSolde(double solde) {
		this.solde = solde;
	}
	public LocalDate getDateCreation() {
		return dateCreation;
	}
	public void setDateCreation(LocalDate dateCreation) {
		this.dateCreation = dateCreation;
	}
	

}
