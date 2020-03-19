package com.java.set;
import java.util.HashSet;
import java.util.Set;

import com.java.Aluno;

public class TesteHashSet {

	public static void main(String[] args) {
		
		// Elementos duplicados são ignorados
		// A ordem dos elementos pode ser diferente

		Aluno a1 = new Aluno("Jos�");
		Aluno a2 = new Aluno("Jo�o");
		Aluno a3 = new Aluno("Maria");
		Aluno a4 = new Aluno("Pedro");
		
		Set<Aluno> alunos = new HashSet<>();
		
		alunos.add(a1);
		alunos.add(a2);
		alunos.add(a3);
		alunos.add(a4);
		
		imprimirAlunos(alunos);
	}
	
	public static void imprimirAlunos(Set<Aluno> aluno) {
		for (Aluno a : aluno) {
			System.out.println("Nome: " + a.getNome());
		}
	}
}
