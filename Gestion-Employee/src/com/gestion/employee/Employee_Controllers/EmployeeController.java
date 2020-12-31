package com.gestion.employee.Employee_Controllers;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;
import com.gestion.employee.models.*;




import com.gestion.employee.sql.Configuration;

public class EmployeeController {
	
	Configuration config;
	Vendeur vendeur;
	Representant representant;
	Manutentionneur manutention;
	Producteur product;
	RisqueManutentionneur manutention_risque;
	RisqueProducteur producteur_risque;
	
	
	
	
	 public EmployeeController() {
		 
		 vendeur = new Vendeur();
		 representant = new Representant();
		 manutention = new Manutentionneur();
		 product = new Producteur();
		 manutention_risque = new RisqueManutentionneur();
		 producteur_risque = new RisqueProducteur();
  	   
  	   config= new Configuration("jdbc:mysql://localhost:3306/tangerlab", "root", "");
  	   
     }
	
//.....................................................CRUD VENDEUR..............................................................//
	 public void ajouteVendeur(int id,String Nom,String Prenom,int Age,String Debut_date,double chiffreAffaire) throws SQLException {
  	   
		 vendeur.setChiffreAffaire(chiffreAffaire);

 		String sql = "insert into  Vendeur (id, Nom, Prenom,Age,Debut_date,chiffreAffaire, Salaire) values('"
 				+ id + "', '" + Nom + "', '" + Prenom + "', '" + Age + "', '" + Debut_date+ "', '" + chiffreAffaire+ "', '" + vendeur.calculerSalaire() + "')";
 	    

 	   Connection cnx = config.connect();
 	    PreparedStatement preparedStmt = cnx.prepareStatement(sql);
 		preparedStmt.execute();
    }
	 
	 public void updateVendeur(int id,String Nom,String Prenom,int Age,String Debut_date,double chiffreAffaire) throws SQLException {
		 
		 vendeur.setChiffreAffaire(chiffreAffaire);
		 
		 
		 String query = "UPDATE Vendeur SET " + "Nom = '" + Nom + "', Prenom = '" + Prenom + "', Age = '" + Age + "', Debut_date = '" + Debut_date + "', chiffreAffaire = '" + chiffreAffaire + "', Salaire = '" + vendeur.calculerSalaire() + "' where id = '" + id + "'";
		 
		    Connection conn = config.connect();
   	        PreparedStatement preparedStmt = conn.prepareStatement(query);
   	        preparedStmt.executeUpdate();
		 
	 }
	 
     public void deleteVendeur(int id) throws SQLException {
        	
        	String query = "DELETE FROM vendeur WHERE id ='" + id + "'";
        	
    		    Connection conn = config.connect();
    	        PreparedStatement preparedStmt = conn.prepareStatement(query);
    	        preparedStmt.executeUpdate();
    }
     
     
//..........................................................................CRUD REPRESENTANT...........................................................//     

	 public void ajouteRepresentant(int id,String Nom,String Prenom,int Age,String Debut_date,double chiffreAffaire) throws SQLException {
		 representant.setChiffreAffaire(chiffreAffaire);
	 		String sql = "insert into  representeur (id, Nom, Prenom,Age,Debut_date,chiffreAffaire, Salaire) values('"
	 			+ id + "', '" + Nom + "', '" + Prenom + "', '" + Age + "', '" + Debut_date+ "', '" + chiffreAffaire+ "', '" + representant.calculerSalaire() + "')";
	 		
	 		Connection cnx = config.connect();
	  	    PreparedStatement preparedStmt = cnx.prepareStatement(sql);
	  		preparedStmt.execute();
	 }
	 
     public void updateRepresentant(int id,String Nom,String Prenom,int Age,String Debut_date,double chiffreAffaire) throws SQLException {
     	 representant.setChiffreAffaire(chiffreAffaire); 
      	String query = "UPDATE representeur SET " + "Nom = '" + Nom + "', Prenom = '" + Prenom + "', Age = '" + Age + "', Debut_date = '" + Debut_date + "', chiffreAffaire = '" + chiffreAffaire + "', Salaire = '" + representant.calculerSalaire() + "' where id = '" + id + "'";
      	
  		    Connection conn = config.connect();
  	        PreparedStatement preparedStmt = conn.prepareStatement(query);
  	        preparedStmt.executeUpdate();
     }
     
     public void deleteRepresentant(int id) throws SQLException {
       	
       	String query = "DELETE FROM representeur WHERE id ='" + id + "'";
       	
   		    Connection conn = config.connect();
   	        PreparedStatement preparedStmt = conn.prepareStatement(query);
   	        preparedStmt.executeUpdate();
   }
	 
//.................................................................CRUD MANUTENTIONNEUR............................................................//
     
	 public void ajouteManutentionneur(int id,String Nom,String Prenom,int Age,String Debut_date,int Hours_number) throws SQLException {
		 manutention.setHours_number(Hours_number);
	 		String sql = "insert into  manutentionneur (id, Nom, Prenom,Age,Debut_date,Hours_number, Salaire) values('"
	 			+ id + "', '" + Nom + "', '" + Prenom + "', '" + Age + "', '" + Debut_date+ "', '" + Hours_number+ "', '" + manutention.calculerSalaire() + "')";
     
	 		
     	    Connection conn = config.connect();
     	    PreparedStatement preparedStmt = conn.prepareStatement(sql);
     		preparedStmt.execute();
        }
	 
	 public void updateManutentionneur(int id,String Nom,String Prenom,int Age,String Debut_date,int Hours_number) throws SQLException {
		 manutention.setHours_number(Hours_number);
	      	String query = "UPDATE manutentionneur SET " + "Nom = '" + Nom + "', Prenom = '" + Prenom + "', Age = '" + Age + "', Debut_date = '" + Debut_date + "', Hours_number = '" + Hours_number + "', Salaire = '" + manutention.calculerSalaire() + "' where id = '" + id + "'";

	 		
  	    Connection conn = config.connect();
  	    PreparedStatement preparedStmt = conn.prepareStatement(query);
  		preparedStmt.execute();
     }
	 
     public void deleteManutentionneur(int id) throws SQLException {
     	
     	String query = "DELETE FROM manutentionneur WHERE id ='" + id + "'";
     	
 		    Connection conn = config.connect();
 	        PreparedStatement preparedStmt = conn.prepareStatement(query);
 	        preparedStmt.executeUpdate();
 } 
     
     
 //...........................................................CRUD PRODUCTEUR........................................................................................
     
     public void ajouteProducteur(int id,String Nom,String Prenom,int Age,String Debut_date,int Unite_Number)  throws SQLException {
  	product.setUnite_Number(Unite_Number);   	   
 		String sql = "insert into producteur  (id, Nom, Prenom,Age,Debut_date,Unite_Number,salaire) values('"
 				+ id + "', '" + Nom + "', '" + Prenom + "', '" + Age + "', '" + Debut_date+ "', '" + Unite_Number+ "', '" + product.calculerSalaire() + "')";
   	    Connection conn = config.connect();
   	    PreparedStatement preparedStmt = conn.prepareStatement(sql);
   		preparedStmt.execute();
      }
     
     
     public void updateProducteur(int id,String Nom,String Prenom,int Age,String Debut_date,int Unite_Number) throws SQLException {
   	  product.setUnite_Number(Unite_Number);
     	String query = "UPDATE producteur SET " + "Nom = '" + Nom + "', Prenom = '" + Prenom + "', Age = '" + Age + "', Debut_date = '" + Debut_date + "', Unite_Number = '" + Unite_Number + "', salaire = '" + product.calculerSalaire() +"' where id = '" + id + "'";
     	
 		    Connection conn = config.connect();
 	        PreparedStatement preparedStmt = conn.prepareStatement(query);
 	        preparedStmt.executeUpdate();
 }
     
     public void deleteProducteur(int id) throws SQLException {
       	
       	String query = "DELETE FROM producteur WHERE id ='" + id + "'";
       	
   		    Connection conn = config.connect();
   	        PreparedStatement preparedStmt = conn.prepareStatement(query);
   	        preparedStmt.executeUpdate();
   } 
//............................................................CRUD PRODUCTEUR SERVICE EN RISQUE......................................................................
     
     public void ajouteProducteurRisque(int id,String Nom,String Prenom,int Age,String Debut_date,int Unite_Number) throws SQLException {
    	 producteur_risque.setUnite_Number(Unite_Number);   	   
  		String sql = "insert into risque_producteur  (id, Nom, Prenom,Age,Debut_date,Unite_Number,salaire) values('"
 				+ id + "', '" + Nom + "', '" + Prenom + "', '" + Age + "', '" + Debut_date+ "', '" + Unite_Number+ "', '" + producteur_risque.calculerSalaire() + "')";
 	    
 	    Connection conn = config.connect();
 	    PreparedStatement preparedStmt = conn.prepareStatement(sql);
 		preparedStmt.execute();
    }
    public void updateProducteurRisque(int id,String Nom,String Prenom,int Age,String Debut_date,int Unite_Number) throws SQLException {
    	producteur_risque.setUnite_Number(Unite_Number);
    	String query = "UPDATE risque_producteur SET " + "Nom = '" + Nom + "', Prenom = '" + Prenom + "', Age = '" + Age + "', Debut_date = '" + Debut_date + "', Unite_Number = '" + Unite_Number + "', salaire = '" + producteur_risque.calculerSalaire() +"' where id = '" + id + "'";
    	
		    Connection conn = config.connect();
	        PreparedStatement preparedStmt = conn.prepareStatement(query);
	        preparedStmt.executeUpdate();
}
    public void deleteProducteurARisque(int id) throws SQLException {
    	
    	String query = "DELETE FROM risque_producteur WHERE id ='" + id + "'";
    	
		    Connection conn = config.connect();
	        PreparedStatement preparedStmt = conn.prepareStatement(query);
	        preparedStmt.executeUpdate();
}
    
//...............................................................CRUD MANUTENTIONNEUR SERVICE EN RISQUE.....................................................................
     
	 public void ajouteManutentionneurRisque(int id,String Nom,String Prenom,int Age,String Debut_date,int Hours_number) throws SQLException {
		 manutention_risque.setHours_number(Hours_number);
	 		String sql = "insert into  risque_manutentionneur (id, Nom, Prenom,Age,Debut_date,Hours_number, Salaire) values('"
	 			+ id + "', '" + Nom + "', '" + Prenom + "', '" + Age + "', '" + Debut_date+ "', '" + Hours_number+ "', '" + manutention_risque.calculerSalaire() + "')";
  
	 		
  	    Connection conn = config.connect();
  	    PreparedStatement preparedStmt = conn.prepareStatement(sql);
  		preparedStmt.execute();
     }
    
       public void updateManutentionnaireRisque(int id,String Nom,String Prenom,int Age,String Debut_date,int Hours_number) throws SQLException {
    	   manutention_risque.setHours_number(Hours_number);
    		String query = "UPDATE risque_manutentionneur SET " + "Nom = '" + Nom + "', Prenom = '" + Prenom + "', Age = '" + Age + "', Debut_date = '" + Debut_date + "', Hours_number = '" + Hours_number + "', Salaire = '" + manutention_risque.calculerSalaire() + "' where id = '" + id + "'";       	
   		    Connection conn = config.connect();
   	        PreparedStatement preparedStmt = conn.prepareStatement(query);
   	        preparedStmt.executeUpdate();
   }
       public void deleteManutentionnaireRisque(int id) throws SQLException {
       	
       	String query = "DELETE FROM risque_manutentionneur WHERE id ='" + id + "'";
       	
   		    Connection conn = config.connect();
   	        PreparedStatement preparedStmt = conn.prepareStatement(query);
   	        preparedStmt.executeUpdate();
   } 
       
       public void afficherSalaires () throws SQLException {
           
         	
   		String sql = "select * from vendeur, producteur, representeur, manutentionneur,risque_manutentionneur,risque_producteur ";
   		
   		Connection conn = config.connect();
   		
   		Statement statement = conn.createStatement();
   		ResultSet result = statement.executeQuery(sql);

   		 while(result.next()) {
   			 
     	            System.out.println(" le salaire de : "+vendeur.getFullName()+" "+result.getDouble("salaire")+" DH \n"+
     	            ""+" le salaire de : "+product.getFullName()+" "+result.getDouble("salaire")+" DH \n"+
     	            ""+" le salaire de : "+representant.getFullName()+" "+ result.getDouble("salaire")+" DH \n"+
     	            ""+" le salaire de : "+manutention.getFullName()+" "+result.getDouble("salaire")+" DH \n"+
     	            ""+" le salaire de : "+manutention_risque.getFullName()+" "+result.getDouble("salaire")+" DH \n"+
     	            ""+" le salaire de : "+producteur_risque.getFullName()+" "+result.getDouble("salaire")+" DH \n"); 
   			 
   		 }
   		 
       }
	 
}
