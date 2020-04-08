package com.java.set.equals_e_hashcode;

import java.util.HashSet;
import java.util.Set;

public class Aplicacao {

	public static void main(String[] args) {

		Produto p1 = new Produto(1, "Produto 1");		
		Produto p2 = new Produto(1, "Produto 2");	
		
		Produto p3 = p2;
		
		Set<Produto> produtos = new HashSet<>();
		
		produtos.add(p1);
		produtos.add(p2);
		produtos.add(p3);
		
		for (Produto produto : produtos) {
			System.out.println(produto);
		}
	}
}
