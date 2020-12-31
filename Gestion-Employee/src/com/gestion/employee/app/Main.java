package com.gestion.employee.app;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;
import com.gestion.employee.Employee_Controllers.EmployeeController;
import com.gestion.employee.models.*;
public class Main {
	
	public static void main(String[] args) throws SQLException {
		
		ArrayList<Producteur> listP = new ArrayList<Producteur>();
		//Scanner scan= new Scanner(System.in);
	
		boolean var = true;
		
		
		while (var) {
			
			System.out.println("*********************Bienvenu dans la Gestion des Employee*********************");
	        System.out.println("Menu Principal");
	        System.out.println("1- Gestion des Employees Commercial");
	        System.out.println("2- Gestion Producteur");
	        System.out.println("3- Gestion Risque Producteur");
	        System.out.println("4- Gestion Manutentionnaire");
	        System.out.println("5- Gestion Risque Manutentionnaire");
	        System.out.println("6- Afficher Salaires");
	        System.out.println("7- Quitter le programme");
	        
	        System.out.println("Choix :");
	        
	        Scanner scanner = new Scanner(System.in);
	        
	        int choix = scanner.nextInt();
	        
	        boolean var1 = true;
	        boolean var4 = true;
		    boolean var5 = true;
		    
		    
		    switch (choix) {
			case 1:
			
				while (var1) {
					
					System.out.println("*********************Gestion des Employees Commercial*********************");
				    System.out.println("1- voulez-vous gérer les Vendeurs ?");
			        System.out.println("2- voulez-vous gérer les Representants ?");
			        System.out.println("3- Quitter le Menu Commercial");
			        
			        System.out.println("Choix :");
			      
			        int choixCommission = scanner.nextInt();
			        
			        boolean var2 = true;
			        boolean var3 = true;
			     
			        switch (choixCommission) {
					case 1:
						
						
						while (var2) {
							    System.out.println("*******************Gestion des Vendeurs*****************");
							    System.out.println("1- Ajouter Vendeur");
						        System.out.println("2- Modifier Vendeur");
						        System.out.println("3- Supprimer Vendeur");
						        System.out.println("4- Quitter le Menu des Vendeurs");
							
						        System.out.println("Choix :");
						        
						        int choixVendeur = scanner.nextInt();
						        switch (choixVendeur) {
						        
						        case 1:
						        	 System.out.println("Ajouter Vendeur");
									 
									 System.out.println("ID :");
									 int id = scanner.nextInt ();
									 
									 System.out.println("Nom :");
									 String Nom = scanner.next();
									 
									 System.out.println("Prenom :");
									 String Prenom = scanner.next();
									 
									 System.out.println("age :");
									 int Age = scanner.nextInt();
									 
									 System.out.println("Date d'entree en Service :");
									 String Debut_date = scanner.next();
									 							 
									 System.out.println("Chaiffre d'affaire :");
									 Double chiffreAffaire = scanner.nextDouble();
									 
									 EmployeeController addVendeur = new EmployeeController();
		                             
		                             
				
		                             addVendeur.ajouteVendeur(id, Nom, Prenom, Age, Debut_date, chiffreAffaire);
									 
									 System.out.println("Vendeur Bien Ajouté");
						        	break;
						        case 2:
						        	 System.out.println("Modifier Vendeur");
									 
		                             System.out.println("Entrez l'ID de l'employé que vous souhaitez Modifier :");
									 int idUpdate = scanner.nextInt ();
									 
									 System.out.println(" Entrer Nouveau Nom :");
									 String newNom = scanner.next();
									 
									 System.out.println("Entrer Nouveau Prenom :");
									 String newPrenom = scanner.next();
									 
									 System.out.println("Entrer Nouveau age :");
									 int newAge = scanner.nextInt();
									 
									 System.out.println("Entrer Nouveau Date d'entree en Service :");
									 String newDebut_date = scanner.next();
									 							 
									 System.out.println("Entrer Nouveau Chaiffre d'affaire :");
									 Double newChiffreAffaire = scanner.nextDouble();
									 
									 EmployeeController updatevendeur = new EmployeeController();
									 updatevendeur.updateVendeur(idUpdate, newNom, newPrenom, newAge, newDebut_date, newChiffreAffaire);
		                             
		                             
		                             
//		                             updateVendeur.updateVendeur(idUpdate, newNom, newPrénom, newAge, newDebut_date, newChiffreAffaire);
				
		                             System.out.println("vendeur Bien Modifier");
									 
						        	break;
						        case 3:
						        	 System.out.println("Supprimer un Vendeur :");
									 
									 System.out.println("Entrez l'ID de l'employé que vous souhaitez supprimer :");
									 int idSup = scanner.nextInt ();
									  EmployeeController deleteVendeur = new EmployeeController();
									  deleteVendeur.deleteVendeur(idSup);
										 
										 System.out.println("Vendeur Bien Supprimé");
						        	break;
						    
						        case 4:
						        	System.out.println("Vous avez Quitter le Menu des Vendeur");
				                 	var2=false;
				                	var3=false;
				                	var4=false;
				                	var5=false;
				                    var1=true;
				                 	break;
				
									default:
										System.out.println("Choix invalid!!!!!!!!!!!");
										break;

						         }
						     
						     }
					case 2:
			
						while (var3) {
							    System.out.println("*******************Gestion des Representants*****************");
							    System.out.println("1- Ajouter Representant");
						        System.out.println("2- Modifier Representant");
						        System.out.println("3- Supprimer Representant");
						        System.out.println("4- Quitter le Menu des Representants");
							
						        System.out.println("Choix :");
						        
						        int choixRepresentant = scanner.nextInt();
						        switch (choixRepresentant) {
						        
						        case 1:
						        	 System.out.println("Ajouter Representant");
									 
									 System.out.println("ID :");
									 int id = scanner.nextInt ();
									 
									 System.out.println("Nom :");
									 String Nom = scanner.next();
									 
									 System.out.println("Prenom :");
									 String Prenom = scanner.next();
									 
									 System.out.println("age :");
									 int Age = scanner.nextInt();
									 
									 System.out.println("Date d'entree en Service :");
									 String Debut_date = scanner.next();
									 							 
									 System.out.println("Chaiffre d'affaire :");
									 Double chiffreAffaire = scanner.nextDouble();
									 
									 EmployeeController addRepresentant = new EmployeeController();
		                             
		                             
//				
                             addRepresentant.ajouteRepresentant(id, Nom, Prenom, Age, Debut_date, chiffreAffaire);	
									 
									 System.out.println("Representant Bien Ajouté");
						        	break;
						        	
						        case 2:
						        	 System.out.println("Modifier Representant");
									 
		                             System.out.println("Entrez l'ID de l'employé que vous souhaitez Modifier :");
									 int idUpdate = scanner.nextInt ();
									 
									 System.out.println(" Entrer Nouveau Nom :");
									 String newNom = scanner.next();
									 
									 System.out.println("Entrer Nouveau Prenom :");
									 String newPrenom = scanner.next();
									 
									 System.out.println("Entrer Nouveau age :");
									 int newAge = scanner.nextInt();
									 
									 System.out.println("Entrer Nouveau Date d'entree en Service :");
									 String newDebut_date = scanner.next();
									 							 
									 System.out.println("Entrer Nouveau Chaiffre d'affaire :");
									 Double newChiffreAffaire = scanner.nextDouble();
									 
									 EmployeeController updateRepresentant = new EmployeeController();
		                             
		                             
		                             
		                             updateRepresentant.updateRepresentant(idUpdate, newNom, newPrenom, newAge, newDebut_date, newChiffreAffaire);
				
		                             System.out.println("Representant Bien Modifier");
									 
						        	break;
						        case 3:
						        	 System.out.println("Supprimer un Representant :");
									 
									 System.out.println("Entrez l'ID de l'employé que vous souhaitez supprimer :");
									 int idSup = scanner.nextInt ();
									 
									 
									  
									  EmployeeController deleteRepresentant = new EmployeeController();
									  deleteRepresentant.deleteRepresentant(idSup);	
										 
										 System.out.println("Representant Bien Supprimé");
						        	break;
						        case 4:
						        	System.out.println("Vous avez Quitter le Menu des Representant");
				                 	var3=false;
				                	var4=false;
				                	var5=false;
				                    var1=true;
				                 
				                 	break;
				
									default:
										System.out.println("Choix invalid!!!!!!!!!!!");
										break;
						        }
						      }
					case 3:
						System.out.println("Vous avez Quitter le Menu des Commercial");
						var1= false;
						var4=false;
	                	var5=false;
	                    var = true;
	                 	break;
	
						default:
							System.out.println("Choix invalid!!!!!!!!!!!");
							break;
						 }
			        
			        }

			   case 2:

				   while (var4) {
					    System.out.println("*******************Gestion des Producteurs*****************");
					    System.out.println("1- Ajouter Producteur");
				        System.out.println("2- Modifier Producteur");
				        System.out.println("3- Supprimer Producteur");
				        System.out.println("4- Quitter le Menu des Producteurs");
					
				        System.out.println("Choix :");
				        
				        int choixProducteur = scanner.nextInt();
				        switch (choixProducteur) {
				        
				        case 1:
				        	 System.out.println("Ajouter Producteur");
							 
							 System.out.println("ID :");
							 int id = scanner.nextInt ();
							 
							 System.out.println("Nom :");
							 String Nom = scanner.next();
							 
							 System.out.println("Prenom :");
							 String Prenom = scanner.next();
							 
							 System.out.println("age :");
							 int Age = scanner.nextInt();
							 
							 System.out.println("Date d'entree en Service :");
							 String Debut_date = scanner.next();
							 							 
							 System.out.println("Nombre d'Unites produit :");
							 int Unite_Number = scanner.nextInt();
							 
							 EmployeeController addProducteur = new EmployeeController();

		
                           addProducteur.ajouteProducteur(id, Nom, Prenom, Age, Debut_date, Unite_Number);	
							 
							 System.out.println("Producteur Bien Ajouté");
				        	break;
				        	
				        case 2:
				        	 System.out.println("Modifier Producteur");
							 
                            System.out.println("Entrez l'ID de l'employé que vous souhaitez Modifier :");
							 int idUpdate = scanner.nextInt ();
							 
							 System.out.println(" Entrer Nouveau Nom :");
							 String newNom = scanner.next();
							 
							 System.out.println("Entrer Nouveau Prenom :");
							 String newPrenom = scanner.next();
							 
							 System.out.println("Entrer Nouveau age :");
							 int newAge = scanner.nextInt();
							 
							 System.out.println("Entrer Nouveau Date d'entree en Service :");
							 String newDebut_date = scanner.next();
							 							 
							 System.out.println("Entrer Nouveau Nombre d'Unites :");
							 int newUnite_Number = scanner.nextInt();
							 
							 EmployeeController updateProducteur = new EmployeeController();
                            
                            
                           updateProducteur.updateProducteur(idUpdate, newNom, newPrenom, newAge, newDebut_date, newUnite_Number);
		
                            System.out.println("Producteur Bien Modifier");
							 
				        	break;
				        case 3:
				        	 System.out.println("Supprimer un Producteur :");
							 
							 System.out.println("Entrez l'ID de l'employé que vous souhaitez supprimer :");
							 int idSup = scanner.nextInt ();
				
							 EmployeeController deleteProducteur = new EmployeeController();
							 deleteProducteur.deleteProducteur(idSup);
						     System.out.println("Producteur Bien Supprimé");
				        	break;
				        case 4:
				        	System.out.println("Vous avez Quitter le Menu des Producteurs");
		                 	var4=false;	
		                	var5=false;
		                    var1=true;
		                 
		                 	break;
		
							default:
								System.out.println("Choix invalid!!!!!!!!!!!");
								break;
				        }
				      }
				   
				   
			   case 3:
				   
				   while (var4) {
					    System.out.println("*******************Gestion des Producteurs en Risque*****************");
					    System.out.println("1- Ajouter Producteur Risque");
				        System.out.println("2- Modifier Producteur Risque");
				        System.out.println("3- Supprimer Producteur Risque");
				        System.out.println("4- Quitter le Menu des Producteurs Risques");
					
				        System.out.println("Choix :");
				        
				        int choixProducteur = scanner.nextInt();
				        switch (choixProducteur) {
				        
				        case 1:
				        	 System.out.println("Ajouter Producteur");
							 
							 System.out.println("ID :");
							 int id = scanner.nextInt ();
							 
							 System.out.println("Nom :");
							 String Nom = scanner.next();
							 
							 System.out.println("Prenom :");
							 String Prenom = scanner.next();
							 
							 System.out.println("age :");
							 int Age = scanner.nextInt();
							 
							 System.out.println("Date d'entree en Service :");
							 String Debut_date = scanner.next();
							 							 
							 System.out.println("Nombre d'Unites produit :");
							 int Unite_Number = scanner.nextInt();
							 
							 EmployeeController addProducteur_Risque = new EmployeeController();

		
							 addProducteur_Risque.ajouteProducteurRisque(id, Nom, Prenom, Age, Debut_date, Unite_Number);	
							 
							 System.out.println("Producteur Bien Ajouté");
				        	break;
				        	
				        case 2:
				        	 System.out.println("Modifier Producteur");
							 
                           System.out.println("Entrez l'ID de l'employé que vous souhaitez Modifier :");
							 int idUpdate = scanner.nextInt ();
							 
							 System.out.println(" Entrer Nouveau Nom :");
							 String newNom = scanner.next();
							 
							 System.out.println("Entrer Nouveau Prenom :");
							 String newPrenom = scanner.next();
							 
							 System.out.println("Entrer Nouveau age :");
							 int newAge = scanner.nextInt();
							 
							 System.out.println("Entrer Nouveau Date d'entree en Service :");
							 String newDebut_date = scanner.next();
							 							 
							 System.out.println("Entrer Nouveau Nombre d'Unites :");
							 int newUnite_Number = scanner.nextInt();
							 
							 EmployeeController updateProducteur_Risque = new EmployeeController();
                           
                           
							 updateProducteur_Risque.updateProducteurRisque(idUpdate, newNom, newPrenom, newAge, newDebut_date, newUnite_Number);
		
                           System.out.println("Producteur Bien Modifier");
							 
				        	break;
				        case 3:
				        	 System.out.println("Supprimer un Producteur :");
							 
							 System.out.println("Entrez l'ID de l'employé que vous souhaitez supprimer :");
							 int idSup = scanner.nextInt ();
				
							 EmployeeController deleteProducteur_Risque = new EmployeeController();
							 deleteProducteur_Risque.deleteProducteurARisque(idSup);
						     System.out.println("Producteur Bien Supprimé");
				        	break;
				        case 4:
				        	System.out.println("Vous avez Quitter le Menu des Producteurs");
		                 	var4=false;	
		                	var5=false;
		                    var1=true;
		                 
		                 	break;
		
							default:
								System.out.println("Choix invalid!!!!!!!!!!!");
								break;
				        }
				      }
				   
			   case 4:  
				   while (var5) {
					    System.out.println("*******************Gestion des Manutentionnaires*****************");
					    System.out.println("1- Ajouter Manutentionnaire");
				        System.out.println("2- Modifier Manutentionnaire");
				        System.out.println("3- Supprimer Manutentionnaire");
				        System.out.println("4- Quitter le Menu des Manutentionnaires");
					
				        System.out.println("Choix :");
				        
				        int choixManutentionnaire = scanner.nextInt();
				        switch (choixManutentionnaire) {
				        
				        case 1:
				        	 System.out.println("Ajouter Manutentionnaire");
							 
							 System.out.println("ID :");
							 int id = scanner.nextInt ();
							 
							 System.out.println("Nom :");
							 String Nom = scanner.next();
							 
							 System.out.println("Prenom :");
							 String Prenom = scanner.next();
							 
							 System.out.println("age :");
							 int Age = scanner.nextInt();
							 
							 System.out.println("Date d'entree en Service :");
							 String Debut_date = scanner.next();
							 							 
							 System.out.println("Nombre d'Heurs :");
							 int Hours_number = scanner.nextInt();
							 
							 EmployeeController addManutentionnaire = new EmployeeController();

		
                           addManutentionnaire.ajouteManutentionneur(id, Nom, Prenom, Age, Debut_date, Hours_number);	
							 
							 System.out.println("Manutentionnaire Bien Ajouté");
				        	break;
				        	
				        case 2:
				        	 System.out.println("Modifier Manutentionnaire");
							 
                            System.out.println("Entrez l'ID de l'employé que vous souhaitez Modifier :");
							 int idUpdate = scanner.nextInt ();
							 
							 System.out.println(" Entrer Nouveau Nom :");
							 String newNom = scanner.next();
							 
							 System.out.println("Entrer Nouveau Prenom :");
							 String newPrenom = scanner.next();
							 
							 System.out.println("Entrer Nouveau age :");
							 int newAge = scanner.nextInt();
							 
							 System.out.println("Entrer Nouveau Date d'entree en Service :");
							 String newDebut_date = scanner.next();
							 							 
							 System.out.println("Entrer Nouveau Nombre d'Heurs :");
							 int newHours_number = scanner.nextInt();
							 
							 EmployeeController updateManutentionnaire = new EmployeeController();
                            
                            
                     updateManutentionnaire.updateManutentionneur(idUpdate, newNom, newPrenom, newAge, newDebut_date, newHours_number);
		
                            System.out.println("Manutentionnaire Bien Modifier");
							 
				        	break;
				        case 3:
				        	 System.out.println("Supprimer un Manutentionnaire :");
							 
							 System.out.println("Entrez l'ID de l'employé que vous souhaitez supprimer :");
							 int idSup = scanner.nextInt ();
				
							 EmployeeController deleteManutentionnaire = new EmployeeController();
							 deleteManutentionnaire.deleteManutentionneur(idSup);
						     System.out.println("Manutentionnaire Bien Supprimé");
				        	break;
				        case 4:
				        	System.out.println("Vous avez Quitter le Menu des Manutentionnaire");
		                 	var5=false;  
		                    var1=true;
		                 
		                 	break;
		
							default:
								System.out.println("Choix invalid!!!!!!!!!!!");
								break;
				        }
				      }
				   break;
			   case 5:  
				   while (var5) {
					    System.out.println("*******************Gestion des Manutentionnaires en Risque*****************");
					    System.out.println("1- Ajouter Manutentionnaire");
				        System.out.println("2- Modifier Manutentionnaire");
				        System.out.println("3- Supprimer Manutentionnaire");
				        System.out.println("4- Quitter le Menu des Manutentionnaires");
					
				        System.out.println("Choix :");
				        
				        int choixManutentionnaire = scanner.nextInt();
				        switch (choixManutentionnaire) {
				        
				        case 1:
				        	 System.out.println("Ajouter Manutentionnaire");
							 
							 System.out.println("ID :");
							 int id = scanner.nextInt ();
							 
							 System.out.println("Nom :");
							 String Nom = scanner.next();
							 
							 System.out.println("Prenom :");
							 String Prenom = scanner.next();
							 
							 System.out.println("age :");
							 int Age = scanner.nextInt();
							 
							 System.out.println("Date d'entree en Service :");
							 String Debut_date = scanner.next();
							 							 
							 System.out.println("Nombre d'Heurs :");
							 int Hours_number = scanner.nextInt();
							 
							 EmployeeController addManutentionnaire_Risque = new EmployeeController();

		
							 addManutentionnaire_Risque.ajouteManutentionneurRisque(id, Nom, Prenom, Age, Debut_date, Hours_number);	
							 
							 System.out.println("Manutentionnaire Bien Ajouté");
				        	break;
				        	
				        case 2:
				        	 System.out.println("Modifier Manutentionnaire");
							 
                            System.out.println("Entrez l'ID de l'employé que vous souhaitez Modifier :");
							 int idUpdate = scanner.nextInt ();
							 
							 System.out.println(" Entrer Nouveau Nom :");
							 String newNom = scanner.next();
							 
							 System.out.println("Entrer Nouveau Prenom :");
							 String newPrenom = scanner.next();
							 
							 System.out.println("Entrer Nouveau age :");
							 int newAge = scanner.nextInt();
							 
							 System.out.println("Entrer Nouveau Date d'entree en Service :");
							 String newDebut_date = scanner.next();
							 							 
							 System.out.println("Entrer Nouveau Nombre d'Heurs :");
							 int newHours_number = scanner.nextInt();
							 
							 EmployeeController updateManutentionnaire_Risque = new EmployeeController();
                            
                            
							 updateManutentionnaire_Risque.updateManutentionnaireRisque(idUpdate, newNom, newPrenom, newAge, newDebut_date, newHours_number);
		
                            System.out.println("Manutentionnaire Bien Modifier");
							 
				        	break;
				        case 3:
				        	 System.out.println("Supprimer un Manutentionnaire :");
							 
							 System.out.println("Entrez l'ID de l'employé que vous souhaitez supprimer :");
							 int idSup = scanner.nextInt ();
				
							 EmployeeController deleteManutentionnair_Risque = new EmployeeController();
							 deleteManutentionnair_Risque.deleteManutentionnaireRisque(idSup);
						     System.out.println("Manutentionnaire Bien Supprimé");
				        	break;
				        case 4:
				        	System.out.println("Vous avez Quitter le Menu des Manutentionnaire");
		                 	var5=false;  
		                    var1=true;
		                 
		                 	break;
		
							default:
								System.out.println("Choix invalid!!!!!!!!!!!");
								break;
				        }
				      }
				   break;
			   case 6:
				   EmployeeController afficheSalaire = new EmployeeController();
				   afficheSalaire.afficherSalaires();
				   break;   
				   
			   case 7:
					System.out.println("Vous avez Quitter le Menu Principale");
					var=true;
				   break;
			   default:
					System.out.println("Choix invalid!!!!!!!!!!!");
					break;
		    }
						        	
						        	
		}
		
	
	}

}
