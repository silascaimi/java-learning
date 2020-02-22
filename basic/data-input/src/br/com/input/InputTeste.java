package br.com.input;

import java.util.Scanner;

public class InputTeste {

	private static Scanner scanner;

	public static void main(String[] args) {
		scanner = new Scanner(System.in);

		System.out.print("Nome: ");
		String nome = scanner.nextLine();

		System.out.println("Idade: ");
		int idade = scanner.nextInt();

		System.out.println("Peso: ");
		double peso = scanner.nextDouble();

		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("Peso: " + peso);
	}

}
