package batch;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Main {

	public static void main(String[] args) throws SQLException {
		
		String url = "jdbc:mysql://localhost/teste?useTimezone=true&serverTimezone=UTC";

		try(Connection conn = DriverManager.getConnection(url, "root", "admin")){
			System.out.println("Conectado ao banco de dados");
			
			String sql = "INSERT INTO PRODUTO (NOME) VALUES (?)";
			
			try(PreparedStatement stmt = conn.prepareStatement(sql)){
				for (int i = 1; i < 1000; i++) {
					stmt.setString(1, "Produto " + i);
					stmt.addBatch();
				}
				
				stmt.executeBatch();
			}	
		}	
	}
}
