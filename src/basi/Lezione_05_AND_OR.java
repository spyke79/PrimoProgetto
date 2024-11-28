package basi;

import java.util.Scanner;

public class Lezione_05_AND_OR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		/*
		 * Intrduzione agli operatori AND e OR
		 * 
		 * Operatore AND (e) si scrive &&, si usa quando tutte le condizioni devono essere verificate
		 * 
		 * es:
		 * if(<condizione 1> $$ <condizione 2> questo if verrà eseguito se la condizione 1 e la condizione 2 sono vere
		 * 
		 * Operatore OR (o) si scrive ||, si usa quando almeno una delle condizioni è vera
		 * 
		 * es:
		 * if(<condizione 1> || <condizione 2> questo if verrà eseguito se almeno una delle condizione è vera
		 * 
		 * Operatore XOR (o esclusivo) ^, si usa quando vogliamo che solo una condizione sia verificata
		 * 
		 */
		
		/*
		 * 
		 * Esempio pratico
		 * 
		 * Creami un software per verificae se puoi prendere la patente in Italia
		 * 
		 * Condizioni: Hai più di 18 anni e sei residente in Italia
		 * 
		 * 
		 */
		
		System.out.println("Richiesta patente: ");
		System.out.println("Inserisci la tua età: ");
		int eta = in.nextInt();
		
		in.nextLine(); //Resetto il buffer
		
		System.out.println("Inserisci la tua residenza: ");
		String residenza = in.nextLine();
	
		
		//Per vedere se la stringa è uguale ad un'altra stringa si usa .equals
		if(eta >= 18 && residenza.equals(residenza)) {
			System.out.println("Puoi seguire il corso della patente");
		}else {
			System.out.println("Mi dispiace manca uno o più requisiti");
		}
		
		
		/*
		 * 
		 * Esercizio:
		 * 
		 * Premio prodzione. Scrivere un programma che chieda il numero di pezzi venduti e il fatturato per 
		 * Trimestre.
		 * 
		 * Se l'agente ha venduto più di 300 pezzi o ha fatturato più di 10000€ può ricevere 
		 * il premio di produzione
		 * 
		 * se ha diritto al premio visualizzare il premio ottenuto.
		 * 
		 * che è sempre il 5% del fatturato (fatturato * 0.05)
		 * 
		 */
		
		int pezzi, fatturato;
		
		System.out.println("Quanti pezzi hai venduto?");
		pezzi = in.nextInt();
		
		System.out.println("Quale è il tuo fatturato?");
		fatturato = in.nextInt();
		
		if(pezzi >= 300 || fatturato >= 10000) {
			System.out.println("Hai diritto al premio");
			System.out.println("Il premio è: " + (fatturato * 0.05) + "€");
		}else {
			System.out.println("Premio non disponibile");
		}
		
		

	}

}
