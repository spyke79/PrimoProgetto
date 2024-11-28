package EserciziOOP;

import java.util.Scanner;

public class Studente_start {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		Studente s1 = new Studente("Mario", "Rossi", "001");
		Studente s2 = new Studente("giuseppe", "verdi");
		Studente s3 = new Studente("   ALESSio  ", "   MARte  ", "   004");
		Studente s4 = new Studente("Marta","Flavi");
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		System.out.println("Istanze di Studente create: " + s1.num_studenti);
		
		System.out.println("Cambia il nome allo studente 1");
		String nNome = in.nextLine();
		
		s1.setNome(nNome);
		System.out.println("Nuovo Studente 1 " + s1);
	}

}
