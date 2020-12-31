package com.gestion.employee.models;

public class Vendeur extends Comissions {
	
	public Vendeur(String Nom, String Prenom, int Age, String Debut_Date, double chiffreAffaire) {
		super(Nom, Prenom, Age, Debut_Date, chiffreAffaire);
	}
	
	
	public Vendeur() {
		super();
	}
	
	public double calculerSalaire() {
		return (0.2 * getChiffreAffaire()) + 1500;
	}
	
	public String getName() {
		return  " Le Vendeur ";
	}

}
