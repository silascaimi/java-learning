package resultset;

import java.sql.SQLException;

public class Main {

	public static void main(String[] args) throws SQLException {

		try {
			ProductsComponent comp = new ProductsComponent();
			comp.printProducts(50.0d, 100.0d);
		} catch (Exception e) {
			util.ExceptionHandler.handleException(e);
		}
		
	}
}
