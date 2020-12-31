package com.gestion.employee.models;

public class Producteur extends Employee {
	
	private int Unite_Number;

	public int getUnite_Number() {
		return Unite_Number;
	}

	public void setUnite_Number(int unite_Number) {
		this.Unite_Number = unite_Number;
	}

	public Producteur(String Nom, String Prénom, int Age, String Debut_date, int Unite_Number) {
		super(Nom, Prénom, Age, Debut_date);
		this.Unite_Number = Unite_Number;
	}
	
	 public double calculerSalaire() 
     {
	      return Unite_Number * 5;
     }
	 
	 public String getName()
     {
         return "Le Producteur ";
     }

	public Producteur() {
		super();
	}

	 
	

}
