package chap06.constructor;

public class Car2 {
	String company = "���� �ڵ���";
	String model;
	String color;
	int maxSpeed;
	
	// ������
	// 1�� ������
	Car2(){
		
	}
	// 2�� ������
	Car2(String model){
		this.model = model;
	}
	// 3�� ������
	Car2(String model, String color){
		this.model = model;
		this.color = color;
	}
	// 4�� ������	
	Car2(String model, String color, int maxSpeed){
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}
