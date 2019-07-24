package com.example.demo;

import java.io.Serializable;
import java.time.LocalDate;

public class Compte implements Serializable {

	private int code;
	private double solde;
	private LocalDate dateCreation;
	public Compte() {
		super();
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
