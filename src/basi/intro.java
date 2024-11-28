package basi;

//Vado ad importare le funzionalità per leggere l'imput della tastiera
import java.util.Scanner; //Importo la classe Scanner di sistema

public class intro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Ciao Mondo!!!");
		
		/*
		 * In JAVA ci sono i tipi di dati primitivi e sono:
		 * 
		 * int per i numeri interi es 1, 2, 99, -4, -100. Questi si scrivono senza apici
		 * 
		 * String che servono a memorizzare parole o frasi. Si scrivono tra doppi apici "Stringa"
		 * 
		 * char per i signololi caratteri. Serve a memorizzare un singolo carattere es: a, b, r. Si scrivono tra singolo apice 'c'.
		 *  
		 * float o Double servono a memorizzare numeri con la virgola. Si scrivono sneza apici
		 * 
		 * booleani servono a memorizzare solo true o false
		 * 
		 */
		
		/*
		 * Regole per la scrittura dei nomi della variabili
		 * 
		 * 1) La variabile si scrive sempre con iniziale minuscola
		 * 
		 * 2) Non è possibile inserire spazzi nei nomi delle variabili 
		 * es anno di nascita diventa:
		 * 
		 * Metodo con _ = anno_di_nascita
		 * Metodo Camel Case = (Inizio sempre con la lettera minuscola) annoDiNascita
		 * 
		 * 3) Non iniziare mai con un numero
		 * 
		 * 4) Non chiamare una variabile con un nome di sistema es(int for, int while)
		 */
		
		//Prima di utilizzare una variabile la devo dichiarare
		//Per dichiarare una variabile vado a inserire prima il tipo di variabile e poi inserisco il nome della variabile

		int n1; //Dichiarazione della vabile
		
		n1 = 3; //Assegnazione del valore ad una variabile
		
		int n2 = 4; //Dichiaro e inizializzo la variabile
		System.out.println(n1 + n2);
		
		//Variabili stringa
		String nome = "Michele";
		
		//Come unire delle variabili nel system.out. Questa tecnica si chiama concatenazione
		System.out.println("Il nome inserito è: " + nome);
		
		//Variabili Char
		char carattere = 'c';
		System.out.println(carattere);
		char numero = '1'; //Non è un intero ma è un carattere 
		System.out.println(n1 + numero);
		
		//Variabili Booleane posso essere solo true o false
		boolean attivo = true;
		
		//Variabili float e double
		double mille = 1000.0;
		System.out.println(mille);
		
		float milleFloat = 1000.0f;
		System.out.println(milleFloat);
		
		//Vado a dichiarare un oggetto della classe Scanner
		Scanner input = new Scanner(System.in);
		
		//Se voglio prendere una stringa da tasiera devo usare nextLine()
		System.out.println("Inserisci il tuo cognome: ");
		String cognome = input.nextLine();
		System.out.println("Il cognome inserito è: " + cognome);
		
		//Se voglio prendere un intero dalla tastiera nextInt()
		System.out.println("Inserisci la tua età: ");
		int eta = input.nextInt();
		System.out.println("L'età inserita è: " + eta);
		
		/*
		 * Esercizio:
		 * Chiedere di inserire il nome, cognome ed età e far stamapre tutti in un unica riga
		 * 
		 * es:
		 * Inserisci il tuo nome:
		 * Michele
		 * 
		 * Inserisci il tuo congome:
		 * Sorbo
		 * 
		 * Inserisci la tua età:
		 * 44
		 * 
		 * Nome: Michlele Cognome: Sorbo Età: 44
		 */
		
		eta = 80;
		
		//Costanti: sono variabili che non possono cambiare nel tempo. Devo dichiararle e inizializzarle sempre inseme
		final String NOMESOCIETA = "TalentForm"; //DIchiaro una costante
		
		//nomeSocieta = "Mia";
		
		//Le costanti si dichiarano scritte in maiuscolo
		final double PIGRECO = 3.14;
		
		
		
		
		
	}

}
