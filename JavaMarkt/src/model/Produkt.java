package model;

public class Produkt {
	String nazwa;
	double cena;
	
	void showDetails(){
		System.out.println("\nSzczegóły produktu:");
		System.out.println("Nazwa: "+this.nazwa+", cena: "+this.cena+" zł");
	}
	
	public String getName() {
		return nazwa;
	}
	public void setName(String nazwa) {
		this.nazwa = nazwa;
	}
	public double getPrice() {
		return cena;
	}
	public void setPrice(double price) {
		this.cena = price;
	}
	
	public Produkt(){
		System.out.println("Zainicjowano nowy produkt!");
	}
	public Produkt(String nazwa){
		System.out.println("Zainicjowano nowy produkt '"+nazwa+"'!");
		this.nazwa=nazwa;
	}
	public Produkt(String nazwa, double cena) {
		super();
		this.nazwa = nazwa;
		this.cena = cena;
	}
}

	
