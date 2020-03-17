import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import com.javaee.jsf.model.Endereco;

@Named
@RequestScoped
public class JavaBean {

	Endereco endereco;
	
	public String processar() {
		System.out.println("Rua: " + endereco.getRua());
		System.out.println("Número: " + endereco.getNumero());
		
		return "result";
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	
}
