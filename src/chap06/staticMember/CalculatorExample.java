package chap06.staticMember;

public class CalculatorExample {
	public static void main(String[] args) {
		double result1 = 10 * 10 * Calculator.pi;
		
		int result2 = Calculator.plus(10, 5);
		int result3 = Calculator.minus(10, 5);
		
		System.out.println("result1 : " + result1);
		System.out.println("result2 : " + result2);
		System.out.println("result3 : " + result3);
		
		testMethod();
		
		
		CalculatorExample ce = new CalculatorExample();
		ce.testMethod2();
	}
	
	static void testMethod() {
		System.out.println("테스트 수행");
	}
	// static 을 사용하지 않으면, 객체를 생성해야 이 메소드를 사용할 수 있다.
	void testMethod2() {
		System.out.println("테스트 수행2");
	}
}
