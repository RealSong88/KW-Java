package chap06.constructor;

public class CarExample {
	public static void main(String[] args) {
		Car myCar = new Car("∞À¡§", 3000);
			
		Car myCar2 = new Car();
		
		System.out.println(myCar);
		System.out.println(myCar2);
	}
}
