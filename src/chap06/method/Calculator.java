package chap06.method;

public class Calculator {
	// �޼ҵ�
	void powerOn() {
		System.out.println("������ �մϴ�.");
	}
	int plus(int x, int y){
		int result = x + y;
		return result;
	}
	
	int sub(int x, int y) {
		int result = x - y;
		return result;
	}
	
	int multi(int x, int y) {
		int result = x * y;
		return result;
	}
	
	double divide(int x, int y) {
		double result = (double) x / y;
		return result;
	}
	
	void powerOff() {
		System.out.println("������ ���ϴ�.");
	}
}