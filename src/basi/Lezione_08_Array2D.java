package basi;

public class Lezione_08_Array2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Creaiamo l'elenco degli alunni per classe
		
		String[][]classi = {
				{"Michele","Mauro","Giovanni"},
				{"Modou","Luca","Maria","Giovanna"},
				{"Francesca","Antonio","Marco"}
		};
		
		//Ciclo for annidato
				for(int i = 0; i<=3; i++) {
					for(int y = 0; y<= 3; y++) {
						System.out.println("valore di i:" + i + " Valorei di y:" + y);
					}
				}
		
		//Per leggere un elemento dell'array
		
		//Stampo Maria che è nella classe 2 alla posizione 3. Ricorda la numerazione degl iindici che parte da 0
		System.out.println(classi[1][2]);
		
		System.out.println("\nClasse 0");
		System.out.println(classi[0][0]);
		System.out.println(classi[0][1]);
		System.out.println(classi[0][2]);
		
		System.out.println("\nCasse 1");
		System.out.println(classi[1][0]);
		System.out.println(classi[1][1]);
		System.out.println(classi[1][2]);
		System.out.println(classi[1][3]);
		
		System.out.println("\nClasse 2");
		System.out.println(classi[2][0]);
		System.out.println(classi[2][1]);
		System.out.println(classi[2][2]);
		
		System.out.println("Stapo il numero delle classi " + classi.length);
		System.out.println("Alunni nella classe 1 " + classi[1].length);
		
		for(int i = 0; i < classi.length; i++) {
			System.out.println("\nClasse " + i);
			for(int y = 0; y < classi[i].length; y++) {
				System.out.println("Alunno " + classi[i][y]);
			}
		}
		
		//Usiamo il foreach
		for(String[] classe:classi) {
			System.out.println(" ");
			for(String alunno:classe) {
				System.out.println(alunno);
			}
		}

		//Usiamo il foreach
		
		int[] ar = {1,3,4,5,12,6,7};
		
		for(int el:ar) {
			System.out.println(el);
		}
		
		for(int i=0; i<ar.length;i++) {
			System.out.println(ar[i]);
		}
		
		
		
	}

}
