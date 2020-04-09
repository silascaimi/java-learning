package statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Main {

	public static void main(String[] args) throws Exception {

		String connection = "jdbc:mysql://localhost/teste";
		String timezone = "?useTimezone=true&serverTimezone=UTC";

		String url = connection + timezone;

		try (Connection conn = DriverManager.getConnection(url, "root", "admin")) {
			System.out.println("Conectou no banco de dados");

			String sql = "INSERT INTO PRODUTO (NOME) VALUES ('Arroz')";

			try (Statement stmt = conn.createStatement()) {
				stmt.executeUpdate(sql);
				System.out.println("Produto inserido");
			}
		}
	}
}
