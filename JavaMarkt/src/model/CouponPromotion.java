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
		}
		
	}

}
