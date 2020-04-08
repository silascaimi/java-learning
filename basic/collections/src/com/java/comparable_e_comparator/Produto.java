package com.java.comparable_e_comparator;

import java.util.Comparator;

public class Produto implements Comparable<Produto>{
	private int id;
	private String titulo;
	private double preco;
	
	public static final Comparator<Produto> BY_ID = Comparator.comparing(Produto::getId);
	
	public Produto(int id, String titulo, double preco) {
		this.id = id;
		this.titulo = titulo;
		this.setPreco(preco);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	@Override
	public String toString() {
		return id + ", "+ titulo + ", " + preco;
	}

	@Override
	public int compareTo(Produto o) {
		// Insere os criterios para ordenacao
		// retornar zero faz com que não haja itens duplicados
		// ao retornar 1 permite manter itens com o mesmo preco na lista
		if (this.preco == o.preco) {
			return 1;
		}
		if (this.preco > o.preco) {
			return 1;
		}
		return -1;
	}
}
