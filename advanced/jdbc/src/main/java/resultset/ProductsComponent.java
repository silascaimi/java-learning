package resultset;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ProductsComponent {

	public void printProducts(double lowPrice, double highPrice) throws Exception {

		// Connection conn.prepareStament retorna um PreparedStatement
		// PreparedStatement stmt.executeQuery retorna um ResultSet

		try (Connection conn = DriverManager
				.getConnection("jdbc:mysql://localhost:3306/classicmodels?user=root&password=admin&serverTimezone=UTC");
				PreparedStatement stmt = conn.prepareStatement("SELECT productName, quantityInStock, buyPrice FROM products " 
				+ "WHERE buyPrice BETWEEN ? AND ?"
				+ "ORDER BY buyPrice")) {

				stmt.setDouble(1, lowPrice);
				stmt.setDouble(2, highPrice);
				
			try (ResultSet resultSet = stmt.executeQuery()) {

				while (resultSet.next()) {	
					String name = resultSet.getString("productName");
					int quantity = resultSet.getInt("quantityInStock");
					double price = resultSet.getDouble("buyPrice");
					System.out.format("%-45s %5d %10.2f%n", name, quantity, price);
				}
			}
		}
	}
}
