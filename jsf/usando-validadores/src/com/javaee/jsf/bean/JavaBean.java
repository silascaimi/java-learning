package com.javaee.jsf.bean;

import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.ValidatorException;
import javax.inject.Named;

@Named
@RequestScoped
public class JavaBean {
	
	private String nome;
	private Integer idade;
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Integer getIdade() {
		return idade;
	}
	
	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	
	public void validarInicial(FacesContext contex, UIComponent ui, Object value) {
		String s = (String) value;
		
		if (s!= null && !s.startsWith("A")) {
			FacesMessage msg = new FacesMessage("Nome não começa com a letra A");
			throw new ValidatorException(msg);
		}
		
	}
}
