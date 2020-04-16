package com.java.thread;

public class Aplicacao {

	public static void main(String[] args) {

		ContadorThread contador = new ContadorThread();
		contador.start();
	}

}
