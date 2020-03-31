package com.java.annotation;

public class MinhaClasse {
	
	@Executar("A")
	public void m1(String valor) {
		System.out.println("m1()" +  " " + valor);
	}
	
	@Executar("B")
	public void m2(String valor) {
		System.out.println("m2()" + " " + valor);
	}
	
	public void m3(String valor) {
		System.out.println("m3()" + " " + valor);
	}

}
