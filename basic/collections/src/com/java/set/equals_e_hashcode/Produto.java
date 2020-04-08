package com.java.set.equals_e_hashcode;

import java.util.Objects;

public class Produto {

	private int id;
	private String titulo;
	
	public Produto(int id, String titulo) {
		this.id = id;
		this.titulo = titulo;
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

	@Override
	public String toString() {
		return id + ", "+ titulo;
	}

	@Override
	public int hashCode() {
		
		// Implementação dafault
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + id;
//		result = prime * result + ((titulo == null) ? 0 : titulo.hashCode());
//		return result;
		
		// Introduzido com Java 7
		return Objects.hash(id, titulo);

	}

	@Override
	public boolean equals(Object obj) {
		
		// Implementação default customizável
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Produto other = (Produto) obj;
//		if (id != other.id)
//			return false;
//		if (titulo == null) {
//			if (other.titulo != null)
//				return false;
//		} else if (!titulo.equals(other.titulo))
//			return false;
//		return true;
		
		// Introduzido com o Java 7
		return Objects.equals(id, titulo);
		
	}
	
}
