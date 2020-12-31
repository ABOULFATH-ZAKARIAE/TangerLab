package com.gestion.employee.models;

public abstract class Comissions extends Employee {
	
	private double chiffreAffaire;

	public double getChiffreAffaire() {
		return chiffreAffaire;
	}

	public void setChiffreAffaire(double chiffreAffaire) {
		this.chiffreAffaire = chiffreAffaire;
	}

	public Comissions(String Nom, String Prenom, int Age, String Debut_Date, double chiffreAffaire) {
		super(Nom, Prenom, Age, Debut_Date);
		this.chiffreAffaire = chiffreAffaire;
	}

	public Comissions() {
		
	}
	
	
	
	
}
