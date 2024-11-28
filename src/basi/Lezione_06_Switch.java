package basi;

import java.util.Scanner;

public class Lezione_06_Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		/*
		 * è sinmile a if else if.
		 * 
		 * Tutti gli switch possono diventare if else if
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
		 * 
		 * Fatto con SWITCH
		 * 
		 */
		
		System.out.println("Scegli un operazione, digita: \n1 - somma \n2 - sottrazione \n3 - moltiplicazione \n4 - Divisione");
		int operatore = in.nextInt();
		
		int num1, num2;
		
		//Faccio inserire i numeri per l'operazione
		System.out.println("Inserisci il primo numero: ");
		num1 = in.nextInt();
		System.out.println("Inserisci il secondo numero: ");
		num2 = in.nextInt();
		
		switch(operatore) {
		case 1:
			System.out.println("La somma è: " + (num1 + num2));
			break;
		
		case 2:
			System.out.println("La sottrazione è: " + (num1 - num2));
			break;
			
		case 3:
			System.out.println("La moltiplicazione è: " + (num1 * num2));
			break;
			
		case 4:
			if(num2 != 0) {
				System.out.println("La divisione è: " + (num1 / num2));
			}else {
				System.out.println("La divisione non è possibile.");
			}
			
			break;
		
		default:
			System.out.println("Scelta non valida");
		}
		
		
		/*
		 * Esempio con Stringhe
		 */
		
		in.nextLine(); //PEr resettare il buffer di lettura
		
		System.out.println("Inserisci il tuo nome");
		String nome = in.nextLine();
		
		switch(nome) { //if(nome.equals("Michele")
		case "Michele":
			System.out.println("Ciao " + nome);
			break;
		case "Modou":
			System.out.println("Ciao " + nome);
			break;
		default:
			System.out.println("Non ti conosco");
		}
		
		

	}

}
