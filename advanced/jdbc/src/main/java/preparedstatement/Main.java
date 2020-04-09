package preparedstatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Main {

	public static void main(String[] args) throws SQLException {

		String[] nomeProdutos = {"Fejão", "Batata", "Cebola", "Tomate"};

		String url = "jdbc:mysql://localhost/teste?useTimezone=true&serverTimezone=UTC";

		try (Connection conn = DriverManager.getConnection(url, "root", "admin")) {
			System.out.println("Conectou ao banco de dados");

			try (PreparedStatement stmt = conn.prepareStatement("INSERT INTO PRODUTO (NOME) VALUES (?)")) {
				for (String produto : nomeProdutos) {
					stmt.setString(1, produto);
					stmt.executeUpdate();
				}
			}
			
			System.out.println("Produtos adicionados ao banco de dados");
		}
	}
}
