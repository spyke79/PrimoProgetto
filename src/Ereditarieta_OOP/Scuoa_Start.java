package Ereditarieta_OOP;

public class Scuoa_Start {

	public static void main(String[] args) {
		Studente s1 = new Studente("Mario","Rossi",16,"3A");
		Docente d1 = new Docente("Michele","Sorbo", 45, "Informatica");
		
		System.out.println(s1);
		System.out.println(s1.saluta());
		
		System.out.println(d1);
		System.out.println(d1.saluta());

	}

}
