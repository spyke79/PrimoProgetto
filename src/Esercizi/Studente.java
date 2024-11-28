package Esercizi;

public class Studente {
	
	public String nome;
	public String cognome;
	public String matricola;
	
	public Studente(String nome, String cognome, String matricola) {
		this.nome = nome;
		this.cognome = cognome;
		this.matricola = matricola;
	}
	
	public void saluta() {
		System.out.println("Ciao dallo studente " + nome + " " + cognome + " " + matricola);
	}

}
