package com.java.set;
import java.util.LinkedHashSet;
import java.util.Set;

import com.java.Aluno;

public class TesteLinkedHashSet {

	public static void main(String[] args) {
		
		// Elementos duplicados são ignorados
		// A ordem dos elementos permanece a mesma

		Aluno a1 = new Aluno("Jos�");
		Aluno a2 = new Aluno("Jo�o");
		Aluno a3 = new Aluno("Maria");
		Aluno a4 = new Aluno("Pedro");
		
		Set<Aluno> alunos = new LinkedHashSet<>();
		
		alunos.add(a1);
		alunos.add(a2);
		alunos.add(a3);
		alunos.add(a4);
		alunos.add(a4);
		
		imprimirAlunos(alunos);
	}
	
	public static void imprimirAlunos(Set<Aluno> aluno) {
		for (Aluno a : aluno) {
			System.out.println("Nome: " + a.getNome());
		}
	}
}
