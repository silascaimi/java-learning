import javax.swing.JOptionPane;

public class ExemploJOptionPane3 {

	public static void main(String[] args) {

		String[] opcoes = {"Masculino", "Feminino"};
		String sexo = (String) JOptionPane.showInputDialog(null, "Selecione o sexo", "AlgaWorks", 
				JOptionPane.PLAIN_MESSAGE, null, opcoes, opcoes[0]);
		
		System.out.println("Sexo selecionado: " + sexo);
		
		String nome = (String) JOptionPane.showInputDialog(null, "Digite o seu nome", "AlgaWorks", JOptionPane.PLAIN_MESSAGE, null, null, null);
		
		System.out.println("Seu nome é: " + nome);
	}

}
