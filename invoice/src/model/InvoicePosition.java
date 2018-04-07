package model;

public class InvoicePosition {
	public static double TAX_5 = 0.05;
	public static double TAX_8 = 0.08;
	public static double TAX_23 = 0.23;
	
	private Product product;
	private int count;
	private double tax;
	
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public double getTax() {
		return tax;
	}
	public void setTax(double tax) {
		this.tax = tax;
	}
	
}
