package basi;

public class Lezione_14_Overload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		somma(12,4);
		somma(3,5);
		somma(12.4,4);
		somma(2,4,6);
		
	}
	
	//Metodi Somma
	//OVERLOAD è la tecnica per avere più metodi con lo stesso nome ma con parametri diversi
	//Sarà ikl compilatore a decidere quale metodo utilizzare in base ai parametri
	public static void somma(int a, int b) {
		System.out.println(a + b);
	}
	
	public static void somma(double a, double b) {
		System.out.println(a+b);
	}
	
	public static void somma(int a, int b, int c) {
		System.out.println(a+b+c);
	}
	
	

}
