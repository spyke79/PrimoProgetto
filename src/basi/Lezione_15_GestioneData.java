package basi;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Lezione_15_GestioneData {

	public static void main(String[] args) {
		
		//data Corrente
		LocalDate data = LocalDate.now(); //Data in formato Americano Anno/mese/Giorno
		System.out.println(data);
		
		//Cambio formattazione data
		DateTimeFormatter itDataMese = DateTimeFormatter.ofPattern("EEEE dd/MM/yyyy"); //Formatto 12/11/2024
		System.out.println("Data in formato Italiano: " + data.format(itDataMese));
		
		//Ottenre l'ora corrente
		LocalTime ora = LocalTime.now(); //Ora : minuti : secondi . millisecondi
		System.out.println(ora);
		
		//Per avere sia data che ora
		LocalDateTime data_completa = LocalDateTime.now();
		System.out.println(data_completa);
		
		DateTimeFormatter itDataCompleta = DateTimeFormatter.ofPattern("EEEE, dd MMMM yyyy HH:mm.ss");
		System.out.println("Data con tutto formattato: " + data_completa.format(itDataCompleta));

	}

}
