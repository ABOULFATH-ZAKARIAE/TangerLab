package com.gestion.employee.models;

public abstract class Employee {
	
	private String Nom;
	private String Prenom;
	private int Age;
	private String Debut_Date;
	
	

	public String getNom() {
		return Nom;
	}
	public void setNom(String nom) {
		Nom = nom;
	}
	public String getPr�nom() {
		return Prenom;
	}
	public void setPr�nom(String pr�nom) {
		Prenom = pr�nom;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	public String getDebut_Date() {
		return Debut_Date;
	}
	public void setDebut_Date(String debut_Date) {
		Debut_Date = debut_Date;
	}
	
	
	
	public Employee() {
		
	}
	
	
	@Override
	public String toString() {
		return "Employee [Nom=" + Nom + ", Pr�nom=" + Prenom + ", Age=" + Age + ", Debut_Date=" + Debut_Date + "]";
	}
	public Employee(String nom, String pr�nom, int age, String debut_Date) {
		super();
		Nom = nom;
		Prenom = pr�nom;
		Age = age;
		Debut_Date = debut_Date;
	}
	
	
	public String getName() {
		return "L'employee";
	}
	
	public String getFullName() {
		return getName() + Nom + " " + Prenom;
	}
	
	public abstract double calculerSalaire();
	
	
	

}
