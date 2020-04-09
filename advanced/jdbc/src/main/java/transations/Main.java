package transations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Main {

	private static Object o;

	public static void main(String[] args) throws SQLException {

		String url = "jdbc:mysql://localhost/teste?useTimezone=true&serverTimezone=UTC";

		try (Connection conn = DriverManager.getConnection(url, "root", "admin")) {
			System.out.println("Conectado ao banco de dados");

			String sql = "INSERT INTO PRODUTO (NOME) VALUES (?)";

			try (PreparedStatement stmt = conn.prepareStatement(sql)) {

				// Set commit como false
				conn.setAutoCommit(false);
				
				stmt.setString(1, "Sardinha");
				stmt.addBatch();
				stmt.executeBatch();
				
				o = null;
				o.toString();
				
				stmt.setString(1, "Bife");
				stmt.addBatch();
				stmt.executeBatch();
				
				// Aplica o commit
				conn.commit();		
				
				
				
				
				// Alternativa
				try {
					stmt.setString(1, "Sardinha");
					stmt.addBatch();
					stmt.executeBatch();
					
					o = null;
					o.toString();
					
					stmt.setString(1, "Bife");
					stmt.addBatch();
					stmt.executeBatch();
					
					// Aplica o commit
				} catch (Exception e) {
					conn.rollback();
					throw e;
				}
				
			}
		}
	}
}
