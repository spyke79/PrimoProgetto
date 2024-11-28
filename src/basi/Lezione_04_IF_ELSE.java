package basi;

import java.util.Scanner;

public class Lezione_04_IF_ELSE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		/*
		 * Il costrutto IF serve a far eseguire un blocco di codice se una condizione è vera
		 * 
		 * NON TUTTI GLI IF HANNO UN ELSE
		 */
		
		int n1 = 3, n2 = 5;
		
		System.out.println(n1>n2);
		
//		if(n1>n2) {
//			System.out.println("Condizione Vera");
//		}
//		
//		System.out.println("Codice dopo IF");
		
		/*
		 * ELSE serve ad eseguire un codice se la condizione nell'IF non è verificata
		 */
		
		if(n1>n2) {
			System.out.println("Condizione vera");
		}else {
			System.out.println("Condizione Falsa");
		}
		
		
		/*
		 * IF - ELSE IF - ELSE
		 * 
		 * Si applica quando devo verificare più condizioni sulla stessa variabile
		 * 
		 * TUTTI GLI IF ELSE IF Terminano con un ELSE
		 */
		
		//Es: verificare se un numero è maggiore, minore o uguale a 10
		
		if(n1 > 10) {
			System.out.println("Il numero è maggiore");
		}else if(n1 < 10) {
			System.out.println("Il numero è minore");
		}else {
			System.out.println("Il numero è ugule a 10");
		}
		
		/*
		 * Trasformare il voto da numero a lettere
		 * Tabella di conversione
		 * 
		 * se il voto e inferiore a 6 dovrà scrivere Insufficiente
		 * se il voto è inferiore a 8 dovrà scrivere Sufficiente
		 * se in voto è inferiore a 9 dovrà scrivere Buono
		 * altrimenti scrivere Ottimo
		 */
		
		System.out.println("Scrivi il voto da convertire: ");
		int voto = in.nextInt();
		
		if(voto < 6) {
			System.out.println("Insufficiente");
		}else if(voto < 8) {
			System.out.println("Sufficiente");
		}else if(voto < 9) {
			System.out.println("Buono");
		}else {
			System.out.println("Ottimo");
		}
		
		/*
		 * 
		 * Chiedere all'utente di inserire 2 numeri per la divisione.
		 * 
		 * Se il seocndo numero è uguale a 0 dire divisione non valida, altrimenti mostrare il risultato.
		 * 
		 * I numeri devono essere double.
		 * 
		 */
		
		
		
		/*
		 * Chiedere all'utente quale operazione vuole svolgere. Dopo la scelta chiedere i due numeri e visualizzare 
		 * il risultato
		 * 
		 * ES:
		 * Scegli un operazione, digita:
		 *  
		 * 1 - per la somma
		 * 2 - per la sottrazione
		 * 3 - per la moltiplicazione
		 * 4 - per la divisione. Ricordati di verificare se il secondo numero è 0
		 * 
		 * In caso di scelta non valida, quindi diversa da 1, 2, 3 o 4 dire scelta non valida
		 */
		
		System.out.println("Scegli un operazione, digita: \n1 - somma \n2 - sottrazione \n3 - moltiplicazione \n4 - Divisione");
		int operatore = in.nextInt();
		
		int num1, num2;
		
		//Faccio inserire i numeri per l'operazione
		System.out.println("Inserisci il primo numero: ");
		num1 = in.nextInt();
		System.out.println("Inserisci il secondo numero: ");
		num2 = in.nextInt();
		
		//Controllo quale oprazione devo svolgere
		if(operatore == 1) {
			System.out.println("La somma è: " + (num1 + num2));
		}else if(operatore == 2) {
			System.out.println("La sottrazione è: " + (num1 - num2));
		}else if(operatore == 3){
			System.out.println("La moltiplicazione è: " + (num1 * num2));
		}else if(operatore ==4) {
			if(num2 != 0) {
				System.out.println("La divisione è: " + (num1 / num2));
			}else {
				System.out.println("La divisione non è possibile.");
			}
		}else {
			System.out.println("Scelta non valida");
		}
		
		
		
		/*
		 * Calcola lo sconto di un articolo
		 * 
		 * Se il prezzo dell'articolo supera i 100€ applicare uno sconto del 25%.
		 * 
		 * Se la condizione è vera far visualizzare il prezzo scontato altrimenti far visualizzare Prodotto non in sconto
		 */
		
		System.out.println("Inserisci il prezzo del capo: ");
		double prezzo = in.nextDouble();
		
		if(prezzo >= 100) {
			System.out.println("Il prezzo scontato è: " + (prezzo * 0.75) + "€");
		}else {
			System.out.println("Il capo non è in sconto.");
		}
		
		
		
		
	}

}
