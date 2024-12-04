package GestioneDB;

import java.sql.*;

public class InsertDB {

	public static void main(String[] args) {
		//Vado a crearmi le variabili che passo al DB
		String nome, cognome;
		
		try {
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:8889/javaDB", "root", "root");
			
			Statement st = conn.createStatement();
			
			//Inizializzo le variabili con i valori che vogòio inserire nel DB
			nome = "Marco";
			cognome = "Frezza";
			
			System.out.println("IL nome inserito è: '"+nome+"' il cognome è: "+cognome+" scrivo altro" );
			
			//Insert Esempio
			//String query = "INSERT INTO utenti VALUES (null,'Giovanna', 'Bianchi')";
			
			//Se ricordo l'ordine delle colonne della tabelle 
			//String query = "INSERT INTO utenti VALUES (null,'"+nome+"', '"+cognome+"')";
			
			String query = "INSERT INTO utenti (nome, cognome) VALUES ('"+nome+"', '"+cognome+"')";

			
			//Eseguo la query
			System.out.println(st.executeUpdate(query));//Stampo il risultato dell'inserimento
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
