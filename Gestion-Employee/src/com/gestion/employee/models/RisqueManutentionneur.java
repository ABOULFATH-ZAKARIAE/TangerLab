package com.gestion.employee.models;

public class RisqueManutentionneur extends Manutentionneur implements RisqueService {

	public RisqueManutentionneur(String Nom, String Prénom, int Age, String Debut_date, int Hours_number) {
		super(Nom, Prénom, Age, Debut_date, Hours_number);
		// TODO Auto-generated constructor stub
	}
	
	public RisqueManutentionneur() {
		
	}
	
	
	public double calculerSalaire() {
		
		return super.calculerSalaire() + prime;
	}
	
	  public String getName()
      {
          return "Le Manutentionneur en Risque";
      }
	

}