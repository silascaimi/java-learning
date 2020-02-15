package br.com.scaimi.javaee;

import java.io.Serializable;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@SuppressWarnings("serial")
@Named
@RequestScoped
public class PageBean implements Serializable {
	
	private String page;
	
	private enum Pages{
		page_a, page_b;
	}
	
	public String getMessage() {
		return "Esta é uma mensagem do Bean!";
	}

	public String getPage() {
		return page;
	}

	public void setPage(String page) {
		this.page = page;
	}
	
	public Pages goTo() {
		if(page.equalsIgnoreCase("a")) {
			return Pages.page_a;
		}
		return Pages.page_b;
	}
}
