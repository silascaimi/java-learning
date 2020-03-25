package com.java.escrita;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

public class Aplicacao {

	public static void main(String[] args) throws FileNotFoundException, IOException {

		String s = "Texto para ser gravado no arquivo";

		
		/*
		 * // Método 1 try(OutputStream os = new FileOutputStream("saida.txt")){
		 * 
		 * byte[] buffer = s.getBytes();
		 * 
		 * os.write(buffer); }
		 */
		 

		
		/*
		 * // Método 2
		 * try(BufferedWriter writer = new BufferedWriter(new FileWriter("saida.txt"))){
		 * writer.write(s); }
		 */

		
		// Método 3
		// Continua gravando no final do arquivo existente
		  try (PrintWriter pw = new PrintWriter(new FileOutputStream("saida.txt", true))) {
		  pw.println(s);
		  }
		  
	}
}
