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
	public String getPrénom() {
		return Prenom;
	}
	public void setPrénom(String prénom) {
		Prenom = prénom;
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
		return "Employee [Nom=" + Nom + ", Prénom=" + Prenom + ", Age=" + Age + ", Debut_Date=" + Debut_Date + "]";
	}
	public Employee(String nom, String prénom, int age, String debut_Date) {
		super();
		Nom = nom;
		Prenom = prénom;
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
