package com.java.invocacao;

public class Televisao {
	
	private boolean ligado;
	private int canal;
	
	Televisao(){
		ligado = true;
	}
	
	public void ligar() {
		if (!isLigado()) {
			ligado = true;
			System.out.println("Tv foi ligada");
		} else {
			System.out.println("Tv já está ligada");
		}
	}
	
	public void desligar() {
		if (isLigado()) {
			ligado = false;
			System.out.println("Tv foi desligada");
		} else {
			System.out.println("Tv já está desligada");
		}
	}
		
	public void mudarCanal(int canal) {
		this.canal = canal;
		System.out.println("Canal mudado para " + canal);
	}
	
	public int getCanal() {
		return canal;
	}
	
	public boolean isLigado() {
		return ligado;
	}
}
