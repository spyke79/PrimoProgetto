package basi;

import java.io.*; //Per importarte tutte le classi della libreria si usa .*
import java.util.Scanner;

public class Lezione_13_GestioneFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		//Aprire un file
		File file = new File("File/prova.txt");
		//L'apertura di un file non genera un errore bloccante
		
		//Verifichiamo se il file esiste e stampiamo alcune informqzioni
		if(file.exists()) {
			System.out.println("Il file è stato trovato");
			System.out.println("Il Path Relativo è: " + file.getPath());
			System.out.println("Il Path Assoluto è: " + file.getAbsolutePath());
			System.out.println("è un file?: " + file.isFile());	
		}else {
			System.out.println("File non trovato");
		}
		
		//Come scrivere dentro il file.
		
		//La funzione di scrittura può causare errore ed è obbligatorio usare try/catch
		
		try {
			//FileWriter writer = new FileWriter(file); //Apro il file in riscrittura
			FileWriter writer = new FileWriter(file, true); //Apro il file e posiziono il cursore alla fine
			//Quello che c'è nel file non viene sovrascritto
			
			System.out.println("Scrivi e lo salvo nel file");
			String testo = in.nextLine();
			
			//writer.write(testo);
			writer.append("\n" + testo); // \n serve per creare una nuova riga
			
			writer.close(); //Chiudo il buffer di scrittura. DA FARE SEMPRE
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		//Lettura di un file leggendo un singolo carattere per volta
		/*
		try {
			FileReader reader = new FileReader(file); //Apro il file in lettura
			int data = reader.read(); //Leggo il contenuto del file e lo salvo nella varibile
			//La funzione read() ritorna la codifica Ascii di caratteri.
			//Il carattere che indica li fine del file è -1
			
			System.out.println(data); //Stampo la codifica Ascii del primo carattere
			System.out.println((char)data);//Trasformo il carattere da Ascii a Char
			
			//Per leggere tutto il contenuto del file faccio un ciclo while
			while(data != -1) {
				System.out.print((char)data);//Stampo la codifica del carattere
				data = reader.read(); //Passo al carattere successivo
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
		
		//Metodo alternativo alla lettura del file utilizzando la classe Scanner
		
		try {
			FileReader reader = new FileReader(file);
			Scanner FileScanner = new Scanner(reader);
			
			//Attenzione Scanner non riconosce il carattere \n per andare accapo, usare println
			
			System.out.println(FileScanner.nextLine()); //Stampo solo la prima riga
			
			//Stampo tutto il file
//			while(FileScanner.hasNextLine()) {
//				String data = FileScanner.nextLine();
//				System.out.println(data);
//			}
			
			//Stampo solo se trovo un elemento
			//Stampo solo la riga dove c'è scritto Modou
			System.out.println("--------Stampo il Risultato della Ricerca------------");
			while(FileScanner.hasNextLine()) {
				String data = FileScanner.nextLine();
				
				if(data.contains("Modou")) {
					System.out.println(data);
				}
				
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
