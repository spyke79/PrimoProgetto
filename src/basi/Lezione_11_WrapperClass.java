package basi;

import java.util.ArrayList;
import java.util.Scanner;

public class Lezione_11_WrapperClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		//In JAVA le variabili possono dividersi in tipi Primitivi
		// int, char, double, float
		
		/*
		 * e in tipi REFERENZIALI (reference).
		 * I tipi Referenziali hanno i metodi ma sono più difficili da gestire per il processore.
		 * Vanno usati poco.
		 * 
		 */
		
		//TIPI PRIMITIVI
		int numero = 3;
		char carattere = 'c';
		double num_double = 15.36;
		boolean vero = true;
		float num_float = 15.36f;
		
		//Tipi REFERENZIALI
		String frase = "Ciao Mondo";
		Integer intero = 4; //reference di int
		Character carattere_r = 'r'; //referenze di char
		Double double_r = 15.36;
		Boolean vero_r = true;
		
		/*
		 * Il motivo per cui si usano i refernce è perchè gli ArrayList (che sono un evoluzione degli array)
		 * Accettano solo tipi referenziali
		 * 
		 * per utilizzarli bisogna richiamare la libreria java.util.ArrayList
		 * 
		 * ArrayList sono degli array ma ridimensionabili
		 * Accettano solo reference
		 * 
		 */
		
		//int[] num = new int[10];
		//Creare un ArrayList di Stringhe
		ArrayList<String> persone = new ArrayList<String>();
		
		//Per inserire un elemento nell0arraylist si usa il metodo add() che inserisce un elemento alla fine dell'ArrayList
		persone.add("Modou");
		persone.add("Michele");
		persone.add("Mario");
		persone.add("Andrea");
		
		//Stampo tutto l'arrayList
		System.out.println(persone);

		//Per conoscere la dimensione dell'array (Quanti elementi ci sono nell'array)
		System.out.println("ELementi nell'array: " + persone.size());
		
		//Per stamapre un elemento ad un determito indicice si usa get()
		System.out.println("Elemeto all'indice 1: " + persone.get(1));
		
		//Stampare tutti gli elemnti dell'array
		//Con FOR
		for(int i = 0; i<persone.size(); i++){
			System.out.println(persone.get(i));
		}
		
		//Con ForEach
		System.out.println("Stampa ArrayList con forEach");
		for(String el:persone) {
			System.out.println(el);
		}
		
		//Per ordinare un array
		System.out.println("Elemeto 0 prime dell'ordinamento: " + persone.get(0));
		persone.sort(null); //Ordino l'array prima della stampa. Si cambia per sempre l'ordine dell'array
		System.out.println(persone);
		System.out.println("Elemeto 0 dopo l'ordinamento: " + persone.get(0));
		
		//Voglio inserire un elemento ad un determinato indice
		persone.add(1, "Carlo");
		System.out.println("Array dopo inseriemnto Carlo:" + persone);
		
		//Modificare un elemento di un indice
		persone.set(3, "Francesco");
		System.out.println("Array dopo set:" + persone);
		
		//Per elimare un elemento si deve conoscere l'indice
		persone.remove(3);
		System.out.println("Array dopo remove(3):" + persone);
		
		//Consocere l'indice di un elemento. indexOf() e case sensitive
		System.out.println("Modou è all'indice: " + persone.indexOf("Modou"));
		
		//Vedere se un elemento è presente nell'array
		if(persone.contains("Modou")) {
			System.out.println("Persona Presente");
		}else {
			System.out.println("Persona non presente");
		}
		
		//Come copiare un array list
		ArrayList<String> persone_clone = (ArrayList<String>)persone.clone();
		System.out.println("Clonazione: " + persone_clone);
		
		//Per cancellare tutti gli elementi di un array
		persone.clear();
		System.out.println(persone.size());
		
		/*
		 * Assolutamente! Le ArrayList sono strutture dati molto versatili in Java, e praticare con esercizi di diversa complessità ti aiuterà a padroneggiare al meglio questa classe. Ecco una serie di esercizi, dal più semplice al più complesso:

		Esercizi di base
		- Creazione e riempimento:
			- Crea una ArrayList di Stringhe e aggiungi 5 nomi.
			- Crea una ArrayList di Integer e riempila con 10 numeri casuali.
		
		- Accesso agli elementi:
			- Stampa il primo e l'ultimo elemento dell'ArrayList di Stringhe.
			- Calcola la somma degli elementi dell'ArrayList di Integer.
		
		- Modifica:
			- Sostituisci il terzo elemento dell'ArrayList di Stringhe con un nuovo valore.
			- Rimuovi tutti gli elementi pari dall'ArrayList di Integer.
		
		
		Esercizi intermedi
		- Ordinamento:
			- Ordina alfabeticamente l'ArrayList di Stringhe.
			- Ordina in ordine crescente l'ArrayList di Integer.
		
		- Ricerca:
			- Verifica se un determinato valore è presente nell'ArrayList di Integer.
			- Trova l'indice della prima occorrenza di un elemento nell'ArrayList di Stringhe.
		
		- Manipolazione:
			- Inverti l'ordine degli elementi nell'ArrayList di Integer.
			- Crea una nuova ArrayList contenente solo gli elementi comuni a due ArrayList esistenti.
				 */
		
		
	}

}
