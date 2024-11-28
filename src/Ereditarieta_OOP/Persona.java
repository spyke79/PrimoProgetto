package Ereditarieta_OOP;

public class Persona {
	
	/*
	 * completare con Segretario:
	 * inserire stanza
	 * riscirvere il saluto con: "Buongiorno dal Segretario"
	 * 
	 * 
	 * Bidello:
	 * inserire area
	 * riscrivere il toString() con nome cognome e area
	 * 
	 */
	
	//La classe con le proprietà in comune tra tutte le figure
	private String nome;
	private String cognome;
	private int eta;
	
	public Persona(String nome, String cognome, int eta) {
		this.nome = nome;
		this.cognome = cognome;
		this.eta = eta;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public int getEta() {
		return eta;
	}

	public void setEta(int eta) {
		this.eta = eta;
	}

	@Override
	public String toString() {
		return "Persona [nome=" + nome + ", cognome=" + cognome + ", eta=" + eta + "]";
	}
	
	public String saluta() {
		return "Saluta secondo Persona";
	}
	
	
	
	

}
