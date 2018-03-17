package model;

import java.util.ArrayList;

public class CouponPromotion implements IPromotion{
	
	Produkt produkt;
	
	public CouponPromotion(Produkt produkt) {
		super();
		this.produkt = produkt;
	}

	@Override
	public boolean CanCalculate(Koszyk cart) {
		ArrayList<ProduktWKoszyku> koszykBrutto = cart.getItems();
		if (!koszykBrutto.isEmpty())
			return true;
		else
			return false;
	}

	@Override
	public void CalculateOffer(Koszyk cart) {
		if (this.CanCalculate(cart)) {
			//sprawdzić czy jest taki produkt o tej nazwie i jeśli tak, to obniżyć cenę
			System.out.println("----------------------------------\nCalculate offer - CouponPromotion");
			this.produkt.showDetails();
			if(this.produkt.getName()=="Kartofle"){
				this.produkt.setPrice(this.produkt.getPrice()*0.7);
			}
			System.out.println("Naliczono rabat 30%!");
			this.produkt.showDetails();
			cart.promotionSumOfProducts = cart.totalPriceOfProducts() - this.produkt.getPrice() * 0.3;
			System.out.println("----------------------------------");
		}
		
	}

}
