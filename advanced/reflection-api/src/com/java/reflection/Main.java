package com.java.reflection;

import java.io.File;
import java.util.Scanner;

public class Main {
	
	// Usando reflection api para executar um método usando o nome de uma classe
	// lido em um arquivo de texto

	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws Exception {

		String className;
		
		try (Scanner scanner = new Scanner(new File("class_name.txt"))){
			className = scanner.nextLine();
		}
		
		Class<Bebida> bebidaClass = (Class<Bebida>) Class.forName(className);
		
		Bebida bebida = bebidaClass.getDeclaredConstructor().newInstance();
		
		bebida.prepararBebida();
	}

}
