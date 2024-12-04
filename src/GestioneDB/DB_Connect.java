package GestioneDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DB_Connect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//Vado a creare la connessione con il DataBase inserendo l'url del DataBase con il nome del BD da prendere in considerazione e inserisco user name e password
			Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:8889/javaDB", "root", "root");
			System.out.println("connessione riuscita");//Verifico se è andato tutto bene
			
			//Stabilisco la connessione per poter lavorare con il DataBase Selezionato
			Statement st = connect.createStatement();
			
			//Scrivo la query su una variabile Stringa
			//String query = "SELECT * FROM utenti"; //SElect Base
			
			//PEr inserire un filtro nella SELECT usiamo WHERE
			//String query = "SELECT * FROM utenti WHERE cognome LIKE '%o%'";
			
			//JOIN
			String query = "SELECT utenti.nome, utenti.cognome, recapiti.tipo, recapiti.recapito\n"
					+ "FROM recapiti\n"
					+ "INNER JOIN utenti ON utenti.id = recapiti.utente\n"
					+ "WHERE utenti.id = 1";
			
			//Vado ad esegurie la query e salvare i risultati. I valorei di ritorno della query si salvano come ResultSet
			ResultSet rs = st.executeQuery(query);//ResultSet è un array di array associativo
			
			while(rs.next()) { //Finchè c'è una riga
				System.out.println("");//Metto una riga vuota per dare uno spazzio tra i dati
				System.out.println("Nome: " + rs.getString("nome"));
				System.out.println("Cognome: " + rs.getString("cognome"));
				System.out.println("Tipo: " + rs.getString("tipo"));
				System.out.println("recapito: " + rs.getString("recapito"));
				//System.out.println("ID: " + rs.getInt("id"));
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
