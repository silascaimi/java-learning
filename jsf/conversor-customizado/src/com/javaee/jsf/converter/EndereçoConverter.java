package com.javaee.jsf.converter;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import com.javaee.jsf.model.Endereco;;

@FacesConverter(forClass = Endereco.class)
public class EndereçoConverter implements Converter<Object> {

	@Override
	public Object getAsObject(FacesContext context, UIComponent ui, String value) {
		if (value == null) {
			return null;
		}

		String[] tokens = value.split(",");
		Endereco endereco = new Endereco();
		endereco.setRua(tokens[0].trim());
		endereco.setNumero(tokens[1].trim());

		return endereco;
	}

	@Override
	public String getAsString(FacesContext context, UIComponent ui, Object value) {
		Endereco endereco = (Endereco) value;
		return endereco.getRua() + ", " + endereco.getNumero();
	}

}
