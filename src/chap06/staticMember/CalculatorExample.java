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
		System.out.println("�׽�Ʈ ����");
	}
	// static �� ������� ������, ��ü�� �����ؾ� �� �޼ҵ带 ����� �� �ִ�.
	void testMethod2() {
		System.out.println("�׽�Ʈ ����2");
	}
}
