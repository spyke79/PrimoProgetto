package GestioneDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteDB {

	public static void main(String[] args) {
		// Link teoria: https://www.w3schools.com/sql/sql_delete.asp
		
try {
			
			//Attenzione alla condizione WHERE perchè le modifiche apportare sono permanenti e non possiamo tornare indietro
			Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:8889/javaDB", "root", "root");
			Statement st = connect.createStatement();
			
			//Facciamo l'udate dell'età
			
			String query = "DELETE FROM utenti WHERE id = 5";
			
			System.out.println(st.executeUpdate(query));
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
