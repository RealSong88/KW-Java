package chap06.constructor;

public class Car2 {
	String company = "현대 자동차";
	String model;
	String color;
	int maxSpeed;
	
	// 생성자
	// 1번 생성자
	Car2(){
		
	}
	// 2번 생성자
	Car2(String model){
		this.model = model;
	}
	// 3번 생성자
	Car2(String model, String color){
		this.model = model;
		this.color = color;
	}
	// 4번 생성자	
	Car2(String model, String color, int maxSpeed){
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}
