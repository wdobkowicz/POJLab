package model;

public class Main {
	
	public static void main(String[] args){
		System.out.println("Stawka VAT: "+InvoicePosition.TAX_5);
		System.out.println("Stawka VAT: "+InvoicePosition.TAX_8);
		System.out.println("Stawka VAT: "+InvoicePosition.TAX_23);
		
		Product product = new Product("ABC123", "TV", 1000);
	
		
		System.out.println("Code: "+product.getCode());
		System.out.println("Code: "+product.getName());
		System.out.println("Code: "+product.getPrice());
	}
}
