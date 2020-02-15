package br.com.java.basic.strings;

public class StringExemplo1 {

	public static void main(String[] args) {

		String s1 = new String(); // cria novo objeto da classe String
		String s2 = "abc"; // cria uma string
		String s3 = "abc";
		String s4 = new String("abc");

		s1 = s2.toUpperCase();

		System.out.println(s1);

		System.out.println(s1.concat(s2));

		System.out.println(s2.equals(s3));
		System.out.println(s2 == s3);
		System.out.println(s2.equals(s4));
		System.out.println(s2 == s4);

	}

}
