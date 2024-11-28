package introOOP;

public class Incapsulamento {

	//Definiamo delle proprietà es nome cognome eta
	private String nome;
	private String cognome;
	private int eta;
	
	public Incapsulamento(String nome, String cognome, int eta) {
		this.nome = nome;
		this.cognome = cognome;
		this.eta = eta;
	}

	public Incapsulamento(String nome, String cognome) {
		this.nome = nome;
		this.cognome = cognome;
	}

	@Override
	public String toString() {
		return "Incapsulamento [nome=" + nome + ", cognome=" + cognome + ", eta=" + eta + "]";
	}
	
	//Tecnica dell'incapsulamento o meglio conosciata con il nome di get e set
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
	
	
	
	
	
	
	
	
	
}
