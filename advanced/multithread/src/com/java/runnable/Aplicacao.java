package com.java.runnable;

public class Aplicacao {

	public static void main(String[] args) {

		ContadorRunnable contador = new ContadorRunnable();
		Thread t = new Thread(contador);
		t.start();
	}

}
