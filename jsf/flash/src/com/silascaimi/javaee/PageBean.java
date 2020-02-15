package com.silascaimi.javaee;

import java.io.Serializable;
import javax.enterprise.context.RequestScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.faces.context.Flash;
//import javax.inject.Inject;
import javax.inject.Named;

@Named
@RequestScoped
@SuppressWarnings("serial")
public class PageBean implements Serializable {

	private String nome;

	// Criando o Flash com o JSF_2.2
	FacesContext fc = FacesContext.getCurrentInstance();
	ExternalContext ec = fc.getExternalContext();
	Flash flash = ec.getFlash();

	// Criando o Flash com o JSF_2.3 NÃO FUNCIONANDO
//	@Inject
//	private Flash flash;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String processar() {
		flash.put("nomeUsuario", nome);

		return "page_b?faces-redirect=true";
	}

}
