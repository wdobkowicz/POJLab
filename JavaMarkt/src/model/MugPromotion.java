package model;

//import org.junit.experimental.categories.Categories;

public class MugPromotion implements IPromotion{

	@Override
	public boolean CanCalculate(Koszyk cart) {
		double koszykBrutto = cart.totalPriceOfProducts();
		if (koszykBrutto >= 200)
			return true;
		else
			return false;
	}

	boolean mugAdded(Koszyk cart) {
		boolean itIs = false;
		for(ProduktWKoszyku it : cart.getItems()) {
			if (it.getProduct().getName().equals("Kubek promocyjny")) {
				itIs = true;
			}
		}
		return itIs;
	}
	
	@Override
	public void CalculateOffer(Koszyk cart) {
		if (this.CanCalculate(cart) && !this.mugAdded(cart))
			cart.addProduct(new Produkt("Kubek promocyjny", 0.01));
		
	}

	@Override
	public String toString() {
		return "MugPromotion [Kubek promocyjny]";
	}
	
}