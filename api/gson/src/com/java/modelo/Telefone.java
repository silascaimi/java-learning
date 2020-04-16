package com.java.modelo;

public class Telefone {

	private TipoTelefone tipoTelefone;
	private String numero;
	
	public Telefone() {
	}

	public Telefone(TipoTelefone tipoTelefone, String numero) {
		this.tipoTelefone = tipoTelefone;
		this.numero = numero;
	}

	public TipoTelefone getTipoTelefone() {
		return tipoTelefone;
	}

	public void setTipoTelefone(TipoTelefone tipoTelefone) {
		this.tipoTelefone = tipoTelefone;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}


	
	
}
