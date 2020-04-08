package com.java.comparable_e_comparator;

import static com.java.comparable_e_comparator.Produto.BY_ID;

import java.util.Set;
import java.util.TreeSet;

public class Aplicacao {

	public static void main(String[] args) {

		Produto p1 = new Produto(4, "Feijão", 3.9);
		Produto p2 = new Produto(3, "Lasanha", 4.5);
		Produto p3 = new Produto(5, "Arroz", 5.2);
		Produto p4 = new Produto(1, "Lentilha", 3.9);
		Produto p5 = new Produto(2, "Macarrão", 4.0);
		Produto p6 = new Produto(2, "Macarrão", 4.0);
		
		// Usando TreeSet
		// Utiliza o CompareTo da propria classe
		//Set<Produto> produtos = new TreeSet<>();
		
		// Utiliza um Comparator 
		// Ordenar em ordem alfabética utilizando a classe DescricaoComparator
		// que implementa Comparator
		// Set<Produto> produtos = new TreeSet<>(new DescricaoComparator());
		
		//Usando o atributo Comparator da propria classe
		Set<Produto> produtos = new TreeSet<>(BY_ID); 
		
		
		//List<Produto> produtos = new ArrayList<>();
		
		produtos.add(p1);
		produtos.add(p2);
		produtos.add(p3);
		produtos.add(p4);
		produtos.add(p5);
		produtos.add(p6);
		
		for (Produto produto : produtos) {
			System.out.println(produto);
		}	
		
		System.out.println();
		
		// Criando um novo set para ordenar por pelo CompareTo - por preço
		Set<Produto> produtosByPrice = new TreeSet<Produto>();
		
		produtosByPrice.addAll(produtos);
		
		for (Produto produto : produtosByPrice) {
			System.out.println(produto);
		}	
		
		// Usando List
		// Ordena os itens utilizando o CompareTo da propria classe
		//Collections.sort(produtos);
		// Ordena os itens utilizando Comparator
		//Collections.sort(produtos, new DescricaoComparator());
	}
}
