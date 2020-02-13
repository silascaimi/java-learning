package br.com.java.basic.strings;

public class StringExemplo2 {

	public static void main(String[] args) {

		String s1 = "Pedro";
		String s2 = " Pedro   C";

		System.out.println(s1.equalsIgnoreCase(s2));

		System.out.println(s1.charAt(0));

		// Remove caracteres em branco antes e depois da String
		System.out.println(s2.trim());

		// substring(int beginIndex);
		// substring(int beginIndex, int endIndex);

		System.out.println(s1.indexOf('r'));

		String curso = "Curso_de_desenvolvimento";
		System.out.println(curso.replaceAll("_", " "));

	}

}
