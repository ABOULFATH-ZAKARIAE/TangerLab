package com.gestion.employee.models;

public class Manutentionneur extends Employee {
	
	private int Hours_number;

	public int getHours_number() {
		return Hours_number;
	}

	public void setHours_number(int Hours_number) {
		this.Hours_number = Hours_number;
	}
	
	public Manutentionneur(String Nom, String Prénom, int Age, String Debut_Date, int Hours_number) {
		super(Nom, Prénom, Age, Debut_Date);
		this.Hours_number = Hours_number;
	}
	
	
	
	 


	public double calculerSalaire() 
	      {   
		      return Hours_number*50;	   
	      }
	   public String getName()
	      {
	          return "Le Manutentionneur ";
	      }
	   
		public Manutentionneur() {
			// TODO Auto-generated constructor stub
			super();
		}
	

}
