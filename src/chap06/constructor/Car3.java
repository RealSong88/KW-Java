package chap06.constructor;

public class Car3 {
	// 필드
	String company = "현대 자동차";
	String model;
	String color;
	int maxSpeed;
	
	// 생성자
	Car3(){}
	Car3(String model) {
//		this.model = model;
//		this.color = "은색";
//		this.maxSpeed = 250;
		this(model, "은색", 250);
	}
	
	Car3(String model, String color){
//		this.model = model;
//		this.color = color;
//		this.maxSpeed = 250;
		this(model, color, 250);
	}
	Car3(String model, String color, int maxSpeed){
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}
