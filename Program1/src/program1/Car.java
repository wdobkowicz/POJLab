package program1;

public class Car {
	String brand;
	boolean isNew;
	int milleage;
	double price;
	
	void printCar(){
		System.out.println("*** Dane o samochodzie:");
		System.out.println("Marka: "+ brand);
		System.out.println("Nowy: "+ isNew);
		System.out.println("Przebieg: "+ milleage);
		System.out.println("Cena: "+ price+"\n");
	}
	
	Car(){
		System.out.println("***Inicjacja z nowego konstruktora\n");
	}
	
	Car(String brand){
		System.out.println("*** Inicjacja z konstruktora z nazwą\n");
		this.brand=brand;
	}
}
