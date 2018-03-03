package program1;

public class kalkulator {
	public static void main(String[] args){
		System.out.println("PROGRAM1 - Kalkulator\n");
		
		Car car = new Car();
		car.brand = "BMW";
		car.isNew = true;
		car.milleage = 100;
		car.price = 100000.99;
		
		Car car2 = new Car("Mazda");
		car2.isNew = false;
		car2.milleage = 220000;
		car2.price = 7999.99;
		
		car.printCar();
		car2.printCar();
	}
}
