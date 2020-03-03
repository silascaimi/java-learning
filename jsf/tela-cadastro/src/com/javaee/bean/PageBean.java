package com.javaee.bean;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import com.javaee.model.Linguagem;

@Named("cadastro")
@RequestScoped
public class PageBean {

	private String nome;
	private String email;
	private Boolean isRecebeEmail;
	private Character sexo;
	private String observacao;
	private String senha1;
	private String senha2;

	private Integer[] linguagens;

	public Linguagem[] getListaLinguagens() {
		return Linguagem.LINGUAGENS;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Character getSexo() {
		return sexo;
	}

	public void setSexo(Character sexo) {
		this.sexo = sexo;
	}

	public Integer[] getLinguagens() {
		return linguagens;
	}

	public void setLinguagens(Integer[] linguagens) {
		this.linguagens = linguagens;
	}

	public Boolean getIsRecebeEmail() {
		return isRecebeEmail;
	}

	public void setIsRecebeEmail(Boolean isRecebeEmail) {
		this.isRecebeEmail = isRecebeEmail;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public String getSenha1() {
		return senha1;
	}

	public void setSenha1(String senha1) {
		this.senha1 = senha1;
	}

	public String getSenha2() {
		return senha2;
	}

	public void setSenha2(String senha2) {
		this.senha2 = senha2;
	}

	public String getLinguagensAsString() {

		String str = "";

		for (int i = 0; i < Linguagem.LINGUAGENS.length; i++) {
			for (int j = 0; j < linguagens.length; j++) {

				if (Linguagem.LINGUAGENS[i].getId() == linguagens[j]) {
					str += Linguagem.LINGUAGENS[i].getNome() + " ";
				}
			}
		}

		return str;
	}

}
