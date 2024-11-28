package basi;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Lezione_12_TryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		double n1, n2, risultato;

		/*
		 * Il Try catch serve a gestire gli errori in determinate occasioni
		 */
		
		try {
			System.out.println("inserisci il primo numero della divisione");
			n1 = in.nextDouble();
			
			System.out.println("inserisci il secondo numero della divisione");
			n2 = in.nextDouble();
			
			risultato = n1/n2;
			
			System.out.println("il Risultato è: " + risultato);
			
		}catch(InputMismatchException e){
			System.out.println("Puoi inserire solo numeri");
		}catch(ArithmeticException e) {//Errori di calcolo aritmetici
			System.out.println("Non si può dividere per 0");
		}catch(Exception e) { //Viene eseguita solo se c'è un errore nel blocco try
			System.out.println("Errore di tipo: " + e); //Stampo a video l'errore
		}
		
		System.out.println("Blocco dopo il try catch");
		
		int[] ar = {2,5,7};
		int indice;
		
		try {
			System.out.println("Inserisci un numero tra 0 e 2 e scorpi il numero");
			indice = in.nextInt();
			
			System.out.println("il numero è: " + ar[indice]);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Puoi inserire solo numeri tra 0 e 2");
		}
		
		
	}

}
