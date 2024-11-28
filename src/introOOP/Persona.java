package introOOP;

public class Persona {
	
	/*
	 * Voglio definire le caratteristiche (proprietà) di una persona
	 * 
	 * Le visibilità sono di tre tipi:
	 * 
	 * Public = la proprietà sarà visibile a tutti
	 * Protected = la proprietà è visibile solo dalla classe e dai sui figli
	 * Private = La proprietà è visibile solo dalla classe
	 */
	
	//Definisco le proprietà della classe
	public String nome;
	public String cognome;
	public int eta;
	public String nazione;
	
	//Creo il costruttore della classe. Se non lo inserisco JAVA ne crea uno di default
	Persona(String nome, String cognome, int eta, String nazione){
		//Devo assegnare i parametri ricevuti dal costruttore alle proprietà della classe
		//In caso di omonimia di variabili si usa this.<nome_proprietà>
		
		this.nome = nome; //This. mi risferisco alla prietà della classe
		this.cognome = cognome;
		this.eta = eta;
		this.nazione = nazione;
		
	}
	
	//OVERLOAD del Costruttore
	Persona(String nome, String cognome){
		//Devo assegnare i parametri ricevuti dal costruttore alle proprietà della classe
		//In caso di omonimia di variabili si usa this.<nome_proprietà>
		
		this.nome = nome; //This. mi risferisco alla prietà della classe
		this.cognome = cognome;
		
	}
	
	Persona(String nome, String cognome, int eta){
		//Devo assegnare i parametri ricevuti dal costruttore alle proprietà della classe
		//In caso di omonimia di variabili si usa this.<nome_proprietà>
		
		this.nome = nome; //This. mi risferisco alla prietà della classe
		this.cognome = cognome;
		this.eta = eta;
		
	}
	
	Persona(String nome, String cognome, String nazione){
		//Devo assegnare i parametri ricevuti dal costruttore alle proprietà della classe
		//In caso di omonimia di variabili si usa this.<nome_proprietà>
		
		this.nome = nome; //This. mi risferisco alla prietà della classe
		this.cognome = cognome;
		this.nazione = nazione;
		
	}
	
	//Vado a fare l'overload del metodo toString per cancellare le informazione di quando si 
	//Stampa la classe es syso(u1)
	//Polimorfismo
	public String toString() {
		return "Nome: " + nome + " Cognome: " + cognome + " Della classe Persona";
	}
	
	//Vado a definire i metodi della classe
		public void saluta() {
			System.out.println("Ciao dall'utente: " + nome + " " + cognome);
		}

}
