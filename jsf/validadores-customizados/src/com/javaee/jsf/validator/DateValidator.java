package com.javaee.jsf.validator;

import java.util.Date;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

@FacesValidator("dateValidator")
public class DateValidator implements Validator<Object> {

	@Override
	public void validate(FacesContext context, UIComponent ui, Object value) throws ValidatorException {

		Date nascimento = (Date) value;
		Date now = new Date();
		
		if (value != null && nascimento.after(now)) {
			FacesMessage msg = new FacesMessage("Data digita é maior que a data atual");
			throw new ValidatorException(msg);
		}
	}

}
