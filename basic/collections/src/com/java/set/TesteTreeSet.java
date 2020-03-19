package com.java.set;
import java.util.Set;
import java.util.TreeSet;

public class TesteTreeSet {

	public static void main(String[] args) {

		// Elementos duplicados são ignorados
		// A ordem dos elementos é ordenada implementando a interface Comparable
		// Strings são ordendos em ordem alfabética
		
		Set<String> alunos = new TreeSet<>();
		
		alunos.add("João");
		alunos.add("José");
		alunos.add("Maria");
		alunos.add("Pedro");
		alunos.add("Pedro");
		
		imprimirAlunos(alunos);
	}
	
	public static void imprimirAlunos(Set<String> alunos) {
		for (String a : alunos) {
			System.out.println(a);
		}
	}

}
