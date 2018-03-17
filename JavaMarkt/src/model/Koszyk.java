package model;

import java.util.ArrayList;

public class Koszyk {
	ArrayList<ProduktWKoszyku> items = new ArrayList<>();
	ArrayList<IPromotion> promotions = new ArrayList<>();
	double promotionSumOfProducts = 0;
	
	public double totalPriceOfProducts(){
		double sum = 0;
		for(ProduktWKoszyku it : items)
			sum += it.getProduct().getPrice();
		return sum;
	}
	public double totalPriceOfDiscountedProducts(){
		double sum = 0;
		for(ProduktWKoszyku it : items)
			sum += it.getCurrentPrice();
		return sum;
	}
	public ArrayList<ProduktWKoszyku> getItems() {
		return items;
	}
	public Koszyk addProduct(Produkt p) {
		items.add(new ProduktWKoszyku(p));
		promotionSumOfProducts += p.getPrice(); 
		return this;
	}

	public Koszyk addPromotion(IPromotion p) {
		promotions.add(p);
		return this;
	}
	
	public Koszyk applyPromotions(){
		for(IPromotion p : promotions){
			p.CalculateOffer(this);
		}
		return this;
	}
	
	@Override
	public String toString() {
		return "Koszyk [\nitems=" + items + "\npromotions=" + promotions + "\npromotionSumOfProducts="
				+ promotionSumOfProducts + "]\n";
	}
	
}



