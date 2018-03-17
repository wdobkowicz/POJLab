package model;

import java.util.ArrayList;

public class Main {
	public static ArrayList<Produkt> getSampleProducts(int n) {
		ArrayList<Produkt> sample = new ArrayList<>();
		for (int i = 1; i <= n; i++) {
			Produkt p = new Produkt("Produkt nr" + i, i * 25);
			sample.add(p);
		}
		return sample;
	}

	public static Koszyk getSampleCart() {
		Koszyk c = new Koszyk();
		for (Produkt p : getSampleProducts(10)) {
			c.addProduct(p);
		}
		return c;
	}

	public static void main(String[] args) {
		System.out.println("Witaj w JavaMarkt!\n");
		//Produkt p1 = new Produkt("Cegła");
		//p1.setPrice(5.99);		
		//p1.showDetails();
		
		System.out.println(getSampleCart().getItems());
		Koszyk cart = new Koszyk();
		cart.addProduct(new Produkt("Kartofle", 200))
		    .addProduct(new Produkt("Gazeta", 100))
		    .addPromotion(new ValuePromotion())
		    .applyPromotions();

		System.out.println("Cart Before Mug Promotion: "+cart);

		cart.addPromotion(new MugPromotion())
		    .applyPromotions()
		    .applyPromotions();
		
		cart.addPromotion(new CouponPromotion(new Produkt("Kartofle",200)))
			.applyPromotions();

		System.out.println("Cart After Mug and Coupon Promotion: "+cart);
	}
}
