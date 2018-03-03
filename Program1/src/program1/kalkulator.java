package program1;

public class kalkulator {
	public static void main(String[] args){
		System.out.println("PROGRAM1 - Kalkulator");
		
		Car car = new Car();
		car.brand = "BMW";
		car.isNew = true;
		car.milleage = 100;
		car.price = 100000.99;
		
		car.printCar();
	}
}
