package com.java.leitura;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Aplicacao {

	public static void main(String[] args) throws IOException {
		/*// Método 1
		 * try (InputStream is = new FileInputStream("entrada.txt")) {
		 * 
		 * byte[] buffer = new byte[1024];
		 * 
		 * int bytesLidos = is.read(buffer); // Quantidade de bytes lidos
		 * 
		 * String texto = new String(buffer, 0, bytesLidos); // Cria String com
		 * bytesLidos para evitar lixo System.out.println(texto); }
		 * 
		 */
		
		
		/*// Método 2
		 * // Maneira de criação dinâmica alocando apenas o espaço necessário try
		 * (InputStream is = new FileInputStream("entrada.txt")) {
		 * 
		 * byte[] buffer = new byte[4];
		 * 
		 * StringBuilder texto = new StringBuilder();
		 * int bytesLidos;
		 * 
		 * while((bytesLidos = is.read(buffer)) > -1) { texto.append(new String(buffer,
		 * 0, bytesLidos)); }
		 * 
		 * System.out.println(texto); }
		 */
		
		

		/* // Método 3 
		 * // Maneira mais simples de se trabalhar try(BufferedReader reader
		 * = new BufferedReader(new FileReader("entrada.txt"))){
		 * 
		 * String texto = "";
		 * String line;
		 * while ((line = reader.readLine()) != null) {
		 * texto += line + "\n"; }
		 * 
		 * System.out.println(texto); }
		 */
		
		
		// Método mais simplificado
		try(Scanner scanner = new Scanner(new File("entrada.txt"))){
			String s = "";
			while (scanner.hasNextLine()) {
				String line = scanner.nextLine();
				s += line + "\n";
			}
			System.out.println(s);
		}

	}
}
