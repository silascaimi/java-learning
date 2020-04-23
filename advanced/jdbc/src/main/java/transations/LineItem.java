package transations;

public class LineItem {
	public String productCode;
	public int quantityOrdered;
	public double priceEach;
	
	public LineItem(String productCode, int quantityOrdered, double priceEach) {
		super();
		this.productCode = productCode;
		this.quantityOrdered = quantityOrdered;
		this.priceEach = priceEach;
	}


}
