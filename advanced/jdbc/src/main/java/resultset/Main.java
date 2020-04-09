package resultset;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {

	public static void main(String[] args) throws SQLException {

		String url = "jdbc:mysql://localhost/teste?useTimezone=true&serverTimezone=UTC";

		try (Connection conn = DriverManager.getConnection(url, "root", "admin")) {
			System.out.println("Conectando no banco de dados");

			String sql = "SELECT * FROM PRODUTO	";

			try (PreparedStatement stmt = conn.prepareStatement(sql)) {
				try (ResultSet rs = stmt.executeQuery()) {
					while (rs.next()) {
						int id = rs.getInt("ID");
						String nome = rs.getString("NOME");

						System.out.println(id + " " + nome);
					}
				}
			}
		}
	}
}
