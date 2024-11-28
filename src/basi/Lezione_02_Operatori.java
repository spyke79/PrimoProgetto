package basi;

import java.util.Scanner;

public class Lezione_02_Operatori {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		int n1, n2, n3, somma;
		
		/*
         * Le operazioni in JAVA sono:
         * 
         * + Somma es 2 + 2 = 4
         * 
         * - Sottrazione es 2 - 2 = 0
         * 
         * / divisione es 2 / 2 = 1
         * 
         * * moltiplicazione 2 * 2 = 4
         * 
         * % modulo (Il resto della divisione) 2%2 = 0 - 3%2 = 1
         */
		
		//Esempio Somma
		n1 = 3;
		n2 = 5;
		System.out.println(n1+n2);
		somma = n1 + n2;
		System.out.println("La somma è: " + somma);
		//System.out.println("La somma è: " + (n1 + n2));
		
		//Esempio sottrazione
		System.out.println("LA sottrazione è: " + (n1 - n2));
		
		//Esempio Moltiplicazione
		System.out.println("Moltiplicazione: " + (n1 * n2));
		
		//Esempio della Divisione. Attenzione a non dividere un numero per 0
		System.out.println("La divisione è: " + (n1 / n2));
		
		//Operazione % ritorna il resto della divisione
		System.out.println("Operazione Modulo: " + (n1%n2));
		
		//Operatori di COMPARAZIONE
				/*
				 * > Maggiore
				 * 
				 * >= Maggiore Uguale
				 * 
				 * < Minore
				 * 
				 * <= Minore Uguale
				 * 
				 * == Uguale
				 * 
				 *!= Diverso
				 *
				 *Questi operatori ritornano sempre un valore boolenao, true se la comparazione è vera o false se la comparazione è falsa
				 * 
				 */
		
		System.out.println(n1 > n2);
		
		n1 = 5;
		n2 = 5;
		System.out.println(n1 >= n2);
		
		//Operatore diverso
		System.out.println(n1 != 3);
		
		//Operatori di incremento
		/*
		 * ++ incremento 
		 * -- decremento
		 */
		
		int i = 3;
		int y = 4;
		
		i++;
		System.out.println("Il valore di i è: " + i);
		
		i--;
		System.out.println("Il valore di i è: " + i);
		
		System.out.println("Il valore di y è: " + (++y));
		
		//Operatore ternario
		
		String nome = "Modou";
		String cognome = nome == "Michele" ? "Sorbo" : "Non conosco il tuo cognome";
		
		//variabile = <condizione> ? <vero> : <falso>
		
		System.out.println(cognome);
		
		//Paro o dispari
		n1 = 4;
		String esito = n1%2 == 0 ? "pari": "dispari";
		System.out.println("Il numero è: " + esito);
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		 * Esercizio 1
		 * Scrivere un programma che chieda 3 numeri da tastiera e ne stampi la somma
		 * 
		 * Esercizio 2
		 * Scrivere un programma che presi due numeri da tastiera stampa la moltiplicazione
		 * 
		 * Esercizio 3
		 * Scrivere un programma che prende un numero da tastiera e scrive se il numero è pari o sipari
		 */
		

	}

}
