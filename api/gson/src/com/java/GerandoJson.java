package com.java;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.java.modelo.Cliente;
import com.java.modelo.Endereco;
import com.java.modelo.Telefone;
import com.java.modelo.TipoTelefone;

public class GerandoJson {

	public static void main(String[] args) {

		Endereco endereco = new Endereco("Florencio", "Salvador", "Bahia");
		Telefone residencial = new Telefone(TipoTelefone.RESIDENCIAL, "7137189909");
		Telefone comercial = new Telefone(TipoTelefone.COMERCIAL, "75997886655");
		List<Telefone> telefones = new ArrayList<>();
		
		telefones.add(residencial);
		telefones.add(comercial);
		
		Cliente cliente = new Cliente("Silas", 32, endereco, telefones);

		Gson gson = new Gson();
		String json = gson.toJson(cliente);
		
		System.out.println(json);

		Cliente cliente2 = gson.fromJson(json, Cliente.class);
		
		for (Telefone telefone : cliente2.getTelefones()) {
			System.out.println(telefone.getTipoTelefone() + ": " + telefone.getNumero());
		}
		
	}

}
