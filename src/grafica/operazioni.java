package grafica;

public class operazioni {
	
	public String somma(String a, String b) {
		return "La somma è: " + (Integer.parseInt(a) + Integer.parseInt(b));
	}
	
	public String sottrazione(String a, String b) {
		return "La sottrazione è: " + (Integer.parseInt(a) - Integer.parseInt(b));
	}
	
	public String moltiplicazione(String a, String b) {
		return "La moltiplicazione è: " + (Integer.parseInt(a) * Integer.parseInt(b));
	}
	
	public String divisione(String a, String b) {
		if(b.equals("0")) {
			return "Divisione per 0 impossibile";
		}else {
			return "La divisione è: " + (Integer.parseInt(a) / Integer.parseInt(b));
		}
	}

}