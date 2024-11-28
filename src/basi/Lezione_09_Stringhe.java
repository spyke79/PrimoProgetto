package basi;

import java.util.Scanner;

public class Lezione_09_Stringhe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		//Le stringhe in JAVA sono sempre viste come un Array di caratteri
		String nome = "Michele Sorbo";
		
		//Conoscere la prima lettera della stringa
		System.out.println(nome.charAt(0));
		
		//Conoscere la lunghezza di una stringa
		System.out.println(nome.length()); //Numero di caratteri spazzi complresi
		
		//Stampami l'ultimo carattere della stringa
		System.out.println(nome.charAt(nome.length()-1));

		//Gestione caratteri
		char a='a', b='b';
		
		//Per verificare l'uguagllianza tra caratteri posso usare ==
		
		if(a == b) {
			System.out.println("I caratteri sono uguali");
		}else {
			System.out.println("I caratteri sono diversi");
		}
		
		//Per confrontare se un carattere della stringa è uguale ad un altro carattere
		if(a == nome.charAt(1)) {
			System.out.println("I caratteri sono uguali");
		}else {
			System.out.println("I caratteri sono diversi");
		}
		
		//Es1:
		//Data una stringa contenente "Ciao Mondo" restituire il numero di voacli: a,e,i,o,u
		//Da fare in 2 versioni
		//1 versione usare le variabili char
		//2 versione usare un array di caratteri contenenti le vocali
		
		//Prima Versione
		String parola = "Ciao Mondo";
		
		int num_vocali = 0; //é il mio contatore di vacale
		for(int i = 0; i< parola.length(); i++) {
			if(parola.charAt(i) == 'a' || parola.charAt(i) == 'e' || parola.charAt(i) == 'i' || parola.charAt(i) == 'o' || parola.charAt(i) == 'u') {
				num_vocali++;
			} //Fine IF
		}//Fine FOR
		
		System.out.println("Il numero delle vocali è: " + num_vocali);
		
		//Seconda Versione (con Array contenete le vocali)
		//Creo array di cratteri con le vocali e per ogni lettera faccio il controllo su tutto l'array
		num_vocali = 0; //Resetto la variabile dopo esempio 1
		char[] vocali = {'a','e','i','o','u'};//Creo array delle vocali
		
		for(int i=0; i<parola.length(); i++) {//Faccio il ciclo per prendere ogni carattere della Stringa parola
			//alternativa: for(int c = 0; c<vocali.length(); c++)
			for(char v:vocali){ //Uso il forEach per ciclare l'array vocali e vontrallare se il carattere della parola è presente nell'array variabili
				if(v == parola.charAt(i)) {
					num_vocali++;
				}//FIne IF
			}//Fine ForEach sull'array vocali
		}//Fine FOR sull'array Parola
		
		System.out.println("Il numero delle vocali metodo 2 è: " + num_vocali);
		
		//Es2
		//Prendere una stringa e scriverla al contrario
		/*
		 * Chiedi di inserire una stringa da tastiera e rstituirla al contrario
		 */
		
		System.out.println("Inserisci una parola o frase e te la scrivo al contrario");
		String parola_2  =in.nextLine();//Prendo la stringa da tastiera
		
		//Faccio il for partendo dall'ultimo indice della stringa fino all'indice 0
		for(int c = parola_2.length()-1; c >= 0; c--) {
			System.out.print(parola_2.charAt(c)); //Stampo il carattere senza creare una nuova riga usando solo print
		}
		
		/*
		 * Es3:
		 * 
		 * Verificare se una parola è palindroma es osso, anna
		 * 
		 */
		
		System.out.println("\nScrivi una parola o frase e ti dirò se è palindorma o no");
		String parola_3 = in.nextLine(); //Prendo la parola o frase da Tastiera
		String parola_revers = ""; //Creo la stringa vuota dove inserirò la parola al contrario
		
		//Popolo la stringa con la parola invertita
		for(int c = parola_3.length()-1; c >= 0; c--) {
			parola_revers += parola_3.charAt(c);
		}
		
		System.out.println("Il  revers della parola è: " + parola_revers);
		
		//Per vedere se è palindroma devo controllare se la parola inserita è uguale al suo revers
		if(parola_3.equals(parola_revers)) {
			System.out.println("La parola o frase è Palindroma");
		}else {
			System.out.println("La parola o frase non è Palindroma");
		}
		
		
		
	}

}
