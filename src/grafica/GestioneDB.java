package grafica;

import java.sql.*;

public class GestioneDB {
	
	//Gestisco tutto il DB e le varie query
	
	//Vado a creare la connessione e la rendo fruibile per tutti i metodi della classe
	
	private Connection conn;
	private Statement st;
	
	{
		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:8889/javaDB", "root", "root");
			st = conn.createStatement();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public String insUtente(String nome, String cognome, String eta) {
		String msg;
		
		try {
			st.executeUpdate("INSERT INTO utenti VALUES (null,'"+nome+"', '"+cognome+"', "+Integer.parseInt(eta)+")");
			msg = "Utente inserito";
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			msg = "Utente non inserito";
		}
		//Se l'inserimento è andato bene msg="Utente inserito" altrimenti Utente non inserito
		return msg;
		
	}
	
	

}
