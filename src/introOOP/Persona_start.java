package introOOP;

public class Persona_start {

	public static void main(String[] args) {
		//Voglio usare la classe Persona per definire nuovi utenti
		
		Persona u1 = new Persona("Modou", "Gaye"); //Ho dichiarato un oggetto della classe Persona. Termine tecnico istanziare
		Persona u2 = new Persona("Michele", "Sorbo", 45, "Italia");
		Persona u3 = new Persona("Mario","Rossi");
		Persona u4 = new Persona("Maria", "Merola", 34);
		Persona u5 = new Persona("Ugo", "Foscolo","Italia");
		
//		u1.nome = "Modou";
//		u1.cognome = "Gaye";
		
		System.out.println("nome dell'utente 1: " + u1.nome + " Cognome: " + u1.cognome);
		
//		u2.nome = "Mario";
//		u2.cognome = "Sorbo";
		
		System.out.println("nome dell'utente 2: " + u2.nome + " Cognome: " + u2.cognome);
		
		u1.saluta();
		u2.saluta();
		u3.saluta();
		
		System.out.println(u1);
		

	}


}
