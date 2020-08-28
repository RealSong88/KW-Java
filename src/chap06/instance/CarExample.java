package chap06.instance;

public class CarExample {
	public static void main(String[] args) {
		Car myCar = new Car("캠핑카");
		Car yourCar = new Car("스파크");
		
		myCar.run();
		yourCar.run();
	}
}
    