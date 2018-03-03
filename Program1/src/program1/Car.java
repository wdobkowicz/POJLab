package program1;

public class Car {
	String brand;
	boolean isNew;
	int milleage;
	double price;
	
	void printCar(){
		System.out.println("Marka: "+ brand);
		System.out.println("Nowy: "+ isNew);
		System.out.println("Przebieg: "+ milleage);
		System.out.println("Cena: "+ price);
	}
}
