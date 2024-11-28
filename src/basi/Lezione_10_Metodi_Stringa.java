package basi;

import java.util.Arrays;
import java.util.Scanner;

public class Lezione_10_Metodi_Stringa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		String str = "          Ciao Mondo         ";
		
		//Ricorda che gli spazzi vuoti sono caratteri
		System.out.println("La lunghezza della stringa è: " + str.length());
		
		System.out.println("Stapo il primo carattere: " + str.charAt(0));
		
		//Metodo per eliminare eventuali spazzi vuoti all'inizio o alla fine della stringa - trin()
		System.out.println("Prima del TRIM: " + str);
		System.out.println("Dopo il trim: " + str.trim());
		
		//Come formattare le stringe in modo uniforma
		String str2 = "CIAo MoNDO";
		
		//Pre scrivere una stringa tutta in minuscolo si usa toLowerCase()
		System.out.println(str2.toLowerCase());
		
		//Pre scrivere una stringa tutta in Maiuscolo si usa toUpperCase()
		System.out.println(str2.toUpperCase());
		
		//equals() serve a confrontare il contenuto di una stringa con il contenuto di un'altra stringa
		//toLowerCase() serve a trasformare il contenuto della stringa in minuscolo
		//toUpperCase()serve a trasformare il contenuto della stringa in MAIUSCOLO
		
		//Metodi per modificare una Stringa
		
		String str3 = "Corso di JAVA per classi JAVA";
		
		//Per sostituira una parola all'interno di una stringa usiamo replace()
		System.out.println(str3.replace("JAVA", "Python")); //Parola da sostituira, come sostituire
		
		//Per sostituire solo la prima occorrenza della frase uso replaceFirst()
		System.out.println(str3.replaceFirst("JAVA", "Python"));
		
		//Raplace e raplaceFirst non modificano in modo permanete la stringa
		System.out.println(str3);
		
		str3 = str3.replace("JAVA", "Python"); //Modifico la stringa in modo permanente
		System.out.println(str3);
		
		String str4 = "Ciao  Moduo, come  stai";
		
		//Pulire una stringa
		str4 = str4.replace("  ", " "); //Tolgo i doppi spazzi
		str4 = str4.replace(",", " "); //Tolgo il carattere ,
		
		System.out.println(str4);
		
		String str5 = "Benvenuto nel corso base di JAVA. Il corso è organizzato da TalentForm";
		
		//Come creare una sottostringa
		System.out.println(str5.substring(15)); //Indice inzio incluso fino alla fine
		System.out.println(str5.substring(15,23)); //Indice inizio incluso fino indice fine escluso
		
		//Per conoscere l'indice di una parola o carattere dentro la stringa si usa indexOf()
		
		System.out.println(str5.indexOf("JAVA"));//Ritorna l'indice di inizio della paola o frase
		
		//ES Stampa la str5 da JAVA in poi
		System.out.println(str5.substring(str5.indexOf("JAVA")));
		
		//Chiedere una stringa da tastiera e trasformarla prima tutto in maiscolo
		//Poi tutto in Minuscolo
		//Solo la prima in Maiuscolo e il restante in minuscolo
		
		System.out.println("Inserisci testo ES1: ");
		String es1 = in.nextLine();
		
		System.out.println("Tutto Maiuscolo: " + es1.toUpperCase());
		System.out.println("Tutto minuscolo: " + es1.toLowerCase());
		System.out.println("Solo prima Maiscola: " + es1.substring(0,1).toUpperCase() + es1.substring(1).toLowerCase() );

		
		//Trasformare una stringa in un array
		String nomi = "Michele Modou Mario Francesco";
		
		//Per convertire una stringa in Array si usa split()
		String[] nomi_ar = nomi.split(" ");
		System.out.println(Arrays.toString(nomi_ar));//Visualizzare il contenuto dell'array a terminale senza ciclo
		
		System.out.println("Elementi in araay nuovo: " + nomi_ar.length);

		
		//Il metodo split() crea sempre un array di Stinghe
		String numeri = "1,23,4,54,6,7,98";
		String[] numeri_ar = numeri.split(",");
		
		//Per convertire una stringa in numero uso il CAST
		//Voglio sommare i numeri dell'array Stigna creato
		int somma = 0;
		for(int c = 0; c < numeri_ar.length; c++) {
			somma += Integer.parseInt(numeri_ar[c]); //Converto la stringa in intero
		}
		
		System.out.println("La somma è: " + somma);
	}
	
	/*
	 * Es 2:
	 * 
	 * Chiedi di inserire dei numeri divisi dalla spazzio
	 * 
	 * Quando si preme invio restituire la somma e la media dei numeri inseriti
	 * 
	 * es:
	 * Inserisci numeri:
	 * 12 3 5
	 * 
	 * La somma è: 20
	 * La media è: 6,6
	 * CALCOLO MEDIA
	 * (somma/numeri inseriti es: 20/3)
	 * 
	 * Pausa dalle 11:25 alle 11:45
	 */
	

}
