package Ereditarieta_OOP;

public class Studente extends Persona {
	
	//Aggiungo le proprietà in più che caratterizzano lo studente lo studente
	private String classe;

	public Studente(String nome, String cognome, int eta, String classe) {
		super(nome, cognome, eta);
		this.classe = classe;
	}

	public String getClasse() {
		return classe;
	}

	public void setClasse(String classe) {
		this.classe = classe;
	}

	@Override
	public String toString() {
		return "Studente [classe=" + classe + " Nome = " + super.getNome() + " Cognome = " + super.getCognome() +"]";
	}
	
	@Override //Questo è un decoratore
	public String saluta() {
		return "Saluta secondo Studente";
	}
	
	

}
