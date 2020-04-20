package resultset.utility;

import java.sql.ResultSet;

public class ProductNavUtility {
	
	ResultSet resultSet = null;
	
	// resultSet.beforeFirst()
	// move o cursor para antes do primeiro resgistro
	// resultSet.afterLast()
	// move o cursor para depois do último resgistro
	
	public ProductNavUtility(ResultSet resultSet) {
		this.resultSet = resultSet;
	}

	public void printForward() throws Exception {
		while(resultSet.next()) {
			String name = resultSet.getString("productName");
			System.out.println("   " + name);
		}
	}
	
	public void printFirst() throws Exception{		
		if(resultSet.first()) {
			String name = resultSet.getString("productName");
			System.out.println("   " + name);
		}
	}
	
	public void printLast() throws Exception{	
		if(resultSet.last()) {
			String name = resultSet.getString("productName");
			System.out.println("   " + name);
		}
	}

	public void printAt(int postion) throws Exception{		
		if(resultSet.absolute(postion)) {
			String name = resultSet.getString("productName");
			System.out.println("   " + name);
		}
	}

	public void printRelative(int postion) throws Exception{		
		if(resultSet.relative(postion)) {
			String name = resultSet.getString("productName");
			System.out.println("   " + name);
		}
	}

	public void printReverse() throws Exception {
		resultSet.afterLast();
		while (resultSet.previous()) {
			String name = resultSet.getString("productName");
			System.out.println("   " + name);
		}
	}
}
