package EserciziOOP;

public class Studente {

	private String nome;
	private String cognome;
	private String matricola;
	static int num_studenti = 0;//Variabile comune per tutte le istanze di Studente
	
	//Inizio costruttori
	public Studente(String nome, String cognome, String matricola) {
		this.nome = firstUpper(pulisciTesto(nome));
		this.cognome = firstUpper(pulisciTesto(cognome));
		this.matricola = pulisciTesto(matricola);
		num_studenti++; //Incremento il contatore degli Studenti creati
	}

	public Studente(String nome, String cognome) {
		this.nome = firstUpper(pulisciTesto(nome));
		this.cognome = firstUpper(pulisciTesto(cognome));
		this.matricola = "Non Presente";
		num_studenti++;
	}
	//Fine Costruttori

	//Incapsulamento - generare get e set delle proprietà
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = firstUpper(pulisciTesto(nome));
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = firstUpper(pulisciTesto(cognome));
	}

	public String getMatricola() {
		return matricola;
	}

	public void setMatricola(String matricola) {
		this.matricola = matricola;
	}
	
	//Fine incapsulamento
	
	@Override
	public String toString() {
		return "Studente [nome=" + nome + ", cognome=" + cognome + ", matricola=" + matricola + "]";
	}
	
	
	//Creo i metodi della classe
	
	//Pulire una stringa dai carattere che non servono
	private String pulisciTesto(String testo) {
		testo = testo.trim();
		testo = testo.toLowerCase();
		testo = testo.replace(",", "");
		testo = testo.replace(".", "");
		testo = testo.replace("  ", " ");
		return testo;
	}
	
	//Prima lettera maiuscola
	private String firstUpper(String testo) {
		return testo.substring(0,1).toUpperCase() + testo.substring(1);
	}
	
	
	
	
	
	
}
