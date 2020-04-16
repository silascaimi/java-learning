import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class ExemploJOptionPane1 {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
		
		// Altera a visualização da menssagem
		UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
		
		// Mostra mensagem em pop-up para o usuário
		JOptionPane.showMessageDialog(null, "Seu cadastro foi realizado com sucesso!");
		
		// Warning message
		JOptionPane.showMessageDialog(null, "Email não informado", "Atenção", JOptionPane.WARNING_MESSAGE);
		
		// Error message
		JOptionPane.showMessageDialog(null, "CPF inválido", "Erro", JOptionPane.ERROR_MESSAGE);
		
		// Messagem vazia
		JOptionPane.showMessageDialog(null, "Obrigado", "Obrigado", JOptionPane.PLAIN_MESSAGE);
		
		// Messagem utilizando icone 
		URL url = ExemploJOptionPane1.class.getResource("algaworks.png"); // indicar o caminho da imagem
		Icon icone = new ImageIcon(url);
		JOptionPane.showMessageDialog(null, "Obrigado", "AlgaWorks", JOptionPane.INFORMATION_MESSAGE, icone);
	}
}
