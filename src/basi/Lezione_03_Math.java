package basi;

import java.util.Random;
import java.util.Scanner;

public class Lezione_03_Math {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		Random random = new Random(); //Mi semplifica su alcune cose
		
		//Calcolare la radice quadrata di un numero
		System.out.println(Math.sqrt(9));
		
		//Conoscere il maggiore tra 2 numeri
		System.out.println(Math.max(5, 3));
		
		//Conoscere il minore tra 2 numeri
		System.out.println(Math.min(5, 3));
		
		int n1=3, n2 = 4;
		
		System.out.println(Math.max(n1, n2));
		
		//Esercizio
		/*
		 * Chiedere di inserire un numero da tastiera e restituire la radice quadrata
		 * 
		 * es: 
		 * Inserisci un numero: 9
		 * La radice quadrata del numero è: 3 
		 */
		
		//Esercizio 2
		/*
		 * Chiedere altri 2 numeri e restituire il numero con il valore massimo
		 * 
		 * Inserisci il primo numero: 7
		 * Inserisci il secondo numero: 9
		 * Il numero maggiore inserito è: 9
		 */
		
		//Valore assoluto, restituisce il valore del numero sempre positivo
		int n3 = -4;
		System.out.println("Il valore assoluto di -4 è: " + Math.abs(n3));
		
		//Elevare un numero a potenza es 3 elevato alla 5
		int base = 3;
		int esponente = 5;
		System.out.println("3 elevato alla 5 è: " + Math.pow(base, esponente));
		System.out.println(Math.pow(3, 2));
		
		
		//Generare un numero Random
		System.out.println(Math.random()); //Stamperà un numero random conpreso tra 0.0 e 1
		//Se voglio generare un numero random compreso tra 0 e 10
		System.out.println(Math.random() * 10);
		//Per eliminare i numeri dopo la virgola devo effettuare un CAST
		System.out.println((int)(Math.random() * 10)); //ATTENZIONE ora avrò i numeri random da 0 a 9
		//Per avere i numeri da 1 a 10
		System.out.println((int)(Math.random() * 10) + 1);
		
		//Grazie al metodo Random posso generare numeri randomici interi o booleani senza fare il cast
		System.out.println(random.nextInt(10)); // da 0 a 9
		System.out.println(random.nextBoolean());
		
	
		/*
		 * Esercizio 1:
		 * Simula il lancio di un dado. (Ricorda che il dado ha i numeri da 1 a 6)
		 *
		 */
		
		int dado = random.nextInt(6) + 1;
		System.out.println("Il lancio del dado ha restituito: " + dado);
		
		/*  Esercizio 2:
		 *  Genera un numero pari casuale
		 */  
		
		int casualePari = random.nextInt(50) * 2; //Moltiplicando per 2 otterrò un numero pari
		System.out.println("Numero pari random è: " + casualePari);
		
		/*  Esercizio 3:
		 *  Simula una partita a testa o croce
		 * 
		 */
		
		boolean moneta = random.nextBoolean(); //Estraggo a caso true o false
		System.out.println("è uscito: " + (moneta ? "Testa" : "Croce"));		
		
		

	}

}
