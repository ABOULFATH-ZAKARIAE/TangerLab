package com.gestion.employee.models;

public class Representant extends Comissions {
	
	public Representant(String Nom, String Pr�nom, int Age, String Debut_date, double chiffreAffaire) {
		super(Nom, Pr�nom, Age, Debut_date, chiffreAffaire);
		// TODO Auto-generated constructor stub
	}
	
	
	
    public Representant() {
		
		// TODO Auto-generated constructor stub
    	super();
	}



	public double calculerSalaire() {
			return (0.2 * getChiffreAffaire()) + 2500;
			 
		 }

	  public String getName()
      {
          return "Le representant";
      }
	
}
