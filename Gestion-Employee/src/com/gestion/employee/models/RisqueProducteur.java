package com.gestion.employee.models;

public class RisqueProducteur extends Producteur implements RisqueService {

	public RisqueProducteur(String Nom, String Prénom, int Age, String Debut_date, int Unite_Number) {
		super(Nom, Prénom, Age, Debut_date, Unite_Number);
		// TODO Auto-generated constructor stub
	}
	
	public RisqueProducteur() {
		
	}
	
	
	public double calculerSalaire() {
		
		return super.calculerSalaire() + prime;
	}
	
	  public String getName()
      {
          return "Le producteur en Risque";
      }
	

}
