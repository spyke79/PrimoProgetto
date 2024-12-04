package GestioneDB;

import java.sql.*;

public class UpdateDB {

	public static void main(String[] args) {
		
		try {
			
			//Attenzione alla condizione WHERE perchè le modifiche apportare sono permanenti e non possiamo tornare indietro
			Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:8889/javaDB", "root", "root");
			Statement st = connect.createStatement();
			
			//Facciamo l'udate dell'età
			
			String query = "UPDATE utenti SET eta = 45 WHERE id = 1";
			
			System.out.println(st.executeUpdate(query));
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
