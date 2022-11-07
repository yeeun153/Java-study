package hw;

public class CarTest {

	public static void main(String[] args) {
		Car c1 = new Car("red");
		Car c2 = new Car("blue");
		Car c3 = new Car("RED");
		
		System.out.printf("자동차 수 : %d,빨간색 자동차 수 : %d",
				Car.getNumOfCar(), Car.getNumOfRedCar());
	}
}

class Car{
	String color;
	static int NumOfCar = 0;
	static int NumOfRedCar = 0;
	
	public Car(String color) {
		this.color = color;
		NumOfCar++;
		
		if(color.equalsIgnoreCase("red"))
			NumOfRedCar++;
	}
	
	public static int getNumOfCar() {
		return NumOfCar;
	}
	
	public static int getNumOfRedCar() {
		return NumOfRedCar;
	}
}
