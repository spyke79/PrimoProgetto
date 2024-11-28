package basi;

import java.util.Scanner;

public class Lezione_07_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		//Creo un array di interi
		
		int[] ar_numerico = new int[5]; //Ho creato un array di 5 Posizioni di interi
		
		//Gli array sono constituiti da indici e valore.
		//Per inserire un valore in un array devo specificare in quale posizione(indice) devo inserirlo.
		//La numerazione degli indici inizia da 0.
		//Se ho un array di 5 posizioni gli indici saranno 0 1 2 3 4
		
		ar_numerico[0] = 3; //Ho inserito il valore 3 nella prima posizione dell'array
		ar_numerico[1] = 4;
		ar_numerico[2] = 5;
		ar_numerico[3] = 9;
		ar_numerico[4] = 14;
		
		//Poso creare un array e inserire direttamente i valo
		int[] ar_num2 = {3,5,7,34,54,43,5,3,21,12,32,134,5,4,32,2,43,12,21};
		
		//Per stampare il contenuto di un array devo indicare quale indice visualizzare
		
		//System.out.println(ar_num2[2]);
		
		//Se voglio stampare tutti gli elementi di un array 
		for(int i = 0; i < 5; i++) {
			System.out.println(ar_numerico[i]);
		}
		
		//Conoscere la lunghezza di un array. Il metodo length inizia a contare da 1
		System.out.println("L'array num2 ha: " + ar_num2.length + " elementi");
		System.out.println("L'array numerico ha: " + ar_numerico.length + " elementi");
		
		//Per stampare un array con length
		for(int i=0; i < ar_num2.length; i++) {
			System.out.println(ar_num2[i]);
		}
		
		//Per modificare il contenuto di un array ad un determinato indice
		ar_numerico[2] = 24;
		
		for(int i = 0; i < 5; i++) {
			System.out.println(ar_numerico[i]);
		}
		
		//Dato l'array ar_num2 dire quale elemetno è alla prima posizione e quale elemento è all'ultma posizione
		
		System.out.println("-------------------");
		//Stampare ar_num2 al contrario
		for(int i = ar_num2.length - 1; i >= 0; i--) {
			System.out.println(ar_num2[i]);
		}
		
		//Dato l'array ar_num2, dire quanti elementi sono pari e quanti sono dispari. incremento variabile pari e
		// dispari con ++
		
		int pari = 0, dispari = 0; //Sono i contatori dei numeri pari e dispari
		
		//Scorro l'array
		for(int i=0; i < ar_num2.length; i++) {
			if(ar_num2[i]%2 == 0) {
				pari++;
			}else {
				dispari++;
			}
		}
		
		System.out.println("Ci sono " + pari + " numeri pari");
		System.out.println("Ci sono " + dispari + " numeri dipari");
		
		
		//Fare la somma di tutti gli elementi dentro l'array ar_num2
		
		//Trova il numero più grande dell'array ar_num2
		
		//Inverti l'ordine degli elementi dell'array ar_num2 e salvali in un nuovo array chiamato ar_num2_invertito 
		//(Attenzione alla grandezza dell'array appena creato):
		
		int[] ar_num2_in = new int[ar_num2.length]; //Creo l'array grande quanto ar_num2
		
		int y = 0; //Indice del nuovo array invertito
		
		for(int i = ar_num2.length - 1; i >= 0; i--) {
			ar_num2_in[y] = ar_num2[i];
			y++; //Aumento l'indice del nuovo array
		}
		
		System.out.println("----Sampa Invertito-----");
		for(int i=0; i < ar_num2_in.length; i++) {
			System.out.println(ar_num2_in[i]);
		}
		
		
		//Creami un array dei soli numeri pari dellarray ar_num2
		//int[] ar_pari = new int[]; //Da completare per risolvere l'esercizio

	}

}
