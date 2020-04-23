package connection.drivermanager;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectComponent {
	
	public boolean tryConnection() throws Exception {
		
		try(Connection conn = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/teste?user=root&password=admin&serverTimezone=UTC")){
			
			return conn.isValid(2);
		}
	}

}
