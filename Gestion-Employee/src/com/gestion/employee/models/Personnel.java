package com.gestion.employee.models;
import java.util.ArrayList;

public class Personnel {

	ArrayList<Employee> listEmployes = new ArrayList<Employee>();
	
	public String addEmployee(Employee e) {
		try {
			listEmployes.add(e);
			return "Employe Added Successfully";
			
		}catch(Exception ex) {
			return ex.getMessage();
			
		}
			
		}
	  public void afficherSalaires() {
	        for (int i = 0; i < listEmployes.size(); i++) {
	            System.out.println( " Salaire de : " + listEmployes.get(i).getFullName() + listEmployes.get(i).calculerSalaire() + " DH ");
	        }
	    }
	
	  public double salaireMoyen() {
	        double somme = 0.0;
	        for (int i = 0; i < listEmployes.size(); i++) {
	            somme += listEmployes.get(i).calculerSalaire();
	        }
	        return somme / listEmployes.size();
	    }
}
