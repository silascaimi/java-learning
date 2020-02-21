package datas;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class TesteData {

	public static void main(String[] args) {

		// Exibe data e hora atual
		Date hoje = new Date();
		System.out.println(hoje);
		
		System.out.println();
		  
		// Cria formatador de data
		DateFormat f = new SimpleDateFormat("dd/MM/yyyy");
		DateFormat fShort = DateFormat.getDateInstance(DateFormat.SHORT);
		DateFormat fMedium = DateFormat.getDateInstance(DateFormat.MEDIUM);
		DateFormat fLong = DateFormat.getDateInstance(DateFormat.LONG);
		//
		DateFormat fLongIngles = DateFormat.getDateInstance(DateFormat.LONG, new Locale("en","US"));
		
		// Transforma um Date formatado em uma String
		String dataHoje = f.format(hoje);
		System.out.println("Simple: " + dataHoje);
		
		dataHoje = fShort.format(hoje);
		System.out.println("Short: " + dataHoje);
		
		dataHoje = fMedium.format(hoje);
		System.out.println("Medium: " + dataHoje);
		
		dataHoje = fLong.format(hoje);
		System.out.println("Long: " + dataHoje);
		
		dataHoje = fLongIngles.format(hoje);
		System.out.println("Long Ingles: " + dataHoje);
		
		
		System.out.println();
		// Transforma um String em um Date formatado
		String dataAniversario = "20/11/1987";
		try {
			Date aniversario = f.parse(dataAniversario);
			System.out.println("Aniversario: " + aniversario);
		} catch (ParseException e) {
			e.printStackTrace();
		}
			
		//-----------------------------------
		
		// Obtem um valor em miliseguntos representando o Date
		Date date = new Date();
		long mili = date.getTime();
		System.out.println(mili);
		 
	}

}
