package model;

import java.util.ArrayList;

public class CouponPromotion implements IPromotion{

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
			
		}
		
	}

}
