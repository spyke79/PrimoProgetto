package introOOP;

public class Incapsulamento_start {

	public static void main(String[] args) {
		Incapsulamento i1 = new Incapsulamento("Mario", "Rossi", 34);
		Incapsulamento i2 = new Incapsulamento("michele", "sorbo", 34);
		
		System.out.println(i1);
		System.out.println(i2);
		
		System.out.println("Il nome dello studente 1 è: " + i1.getNome());

	}

}
