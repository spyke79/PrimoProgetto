package Esercizi;

import java.io.*;
import java.util.Scanner;

public class Frasi {

	public static void main(String[] args) {
		/*
		 * 
		 * 	Chiedere all'untente di iserire una frase e memorizzarla dentro il file frasi.txt che si trova 
			nella cartella File.
			
			Ogni frase deve essere scritta su una nuova riga.
			
			Quando parte il programma l'utente può sceglere di:
			1) inserire una frase
			2) Uscire dal programma.
			
			FARE UNA FUNZIONE scriviFrase() 
		 */
		
		File frasi = new File("File/frasi.txt");
		
		Scanner in = new Scanner(System.in);
		
		String frase;
		
		int scelta;
		
		do {
			System.out.println("Cosa vuoi fare?\n1) Scrivi una frase\n2) Leggi le frasi \n3) Cerca Frase \n4) Chiudi il Programma");
			scelta = in.nextInt();
			
			in.nextLine(); //Serve per resettare lo scanner
			
			if(scelta == 1) {
				//Chiedo la frase da inserire
				System.out.println("Scrivi la frase:");
				frase = in.nextLine(); //Salvo la frase nella variabile
				
				scriviFrase(frasi,frase); //Invoco la funzione con i parametri richiesti
				
			}else if(scelta ==2) {
			
				leggiFrasi(frasi);
				
			}else if(scelta == 3) {
				cercaFrase(frasi);
			}
			else if(scelta == 4) {
				System.out.println("Chiudo il programma");
			}else {
				System.out.println("Scelta non consentita");
			}
			
		}while(scelta != 3);

	} //Fine Main
	
	//Vuole il file dove scrivere e la frase da scrivere
	public static void scriviFrase(File file, String frase) {
		
		try {
			FileWriter fw = new FileWriter(file, true); //Scrivo il file in append per non perdere le cose che sono scritte nel file
			
			fw.append("\n" + frase);
			
			fw.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	public static void leggiFrasi(File file) {
		
		try {
			FileReader fr = new FileReader(file);
			int data = fr.read();
			System.out.println("\n\n*** INIZIO FRASI ****\n\n");
			while(data != -1) {
				System.out.print((char)data);
				data = fr.read();
			}
			
			System.out.println("\n\n*** FINE FRASI ****\n\n");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	
	public static void cercaFrase(File file) {
		
		Scanner in = new Scanner(System.in);
		
		try {
			FileReader reader = new FileReader(file);
			Scanner FileScanner = new Scanner(reader);
			
			System.out.println("Inserisci la parola o la frase da cercare nel file: ");
			String parola = in.nextLine();
			
			while(FileScanner.hasNextLine()) {
				String data = FileScanner.nextLine();
				
				if(data.contains(parola)) {
					System.out.println(data);
				}
				
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
