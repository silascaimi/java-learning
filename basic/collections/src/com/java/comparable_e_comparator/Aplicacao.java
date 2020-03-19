package com.java.comparable_e_comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Aplicacao {

	public static void main(String[] args) {

		Produto p1 = new Produto(4, "Feijão", 3.9);
		Produto p2 = new Produto(3, "Lasanha", 4.5);
		Produto p3 = new Produto(5, "Arroz", 5.2);
		Produto p4 = new Produto(1, "Lentilha", 3.9);
		Produto p5 = new Produto(2, "Macarrão", 4.0);
		
		
		// Utiliza o CompareTo da propria classe
		// Set<Produto> produtos = new TreeSet<>();
		
		// Utiliza um Comparator para ordenar o Set
		// Ordenar em ordem alfabética utilizando a classe DescricaoComparator
		// que implementa Comparator
		// Set<Produto> produtos = new TreeSet<>(new DescricaoComparator());
		
		List<Produto> produtos = new ArrayList<>();
		
		// Ordena os itens utilizando o CompareTo da propria classe
		Collections.sort(produtos);
		// Ordena os itens utilizando Comparator
		Collections.sort(produtos, new DescricaoComparator());
		
		produtos.add(p1);
		produtos.add(p2);
		produtos.add(p3);
		produtos.add(p4);
		produtos.add(p5);
		
		for (Produto produto : produtos) {
			System.out.println(produto);
		}	
	}
}
