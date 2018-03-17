package model;

public class ProduktWKoszyku {
	private Produkt produkt;
	private double currentPrice;
	
	public ProduktWKoszyku(Produkt produkt){
		this.produkt = produkt;
		this.currentPrice = produkt.getPrice();
	}

	public Produkt getProduct() {
		return produkt;
	}

	public void setProduct(Produkt produkt) {
		this.produkt = produkt;
	}

	public double getCurrentPrice() {
		return currentPrice;
	}

	public void setCurrentPrice(double currentPrice) {
		this.currentPrice = currentPrice;
	}

	@Override
	public String toString() {
		return "Produkt w Koszyku: [produkt=" + produkt.nazwa + ", currentPrice=" + currentPrice + "]\n";
	}
}