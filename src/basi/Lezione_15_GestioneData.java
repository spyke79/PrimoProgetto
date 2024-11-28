package basi;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Lezione_15_GestioneData {

	public static void main(String[] args) {
		
		//data Corrente
		LocalDate data = LocalDate.now(); //Data in formato Americano Anno/mese/Giorno
		System.out.println(data);
		
		//Cambio formattazione data
		DateTimeFormatter itDataMese = DateTimeFormatter.ofPattern("EEEE dd/MM/yyyy"); //Formatto 12/11/2024
		System.out.println("Data in formato Italiano: " + data.format(itDataMese));

	}

}
