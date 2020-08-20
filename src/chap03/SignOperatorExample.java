package chap03;

public class SignOperatorExample {
	public static void main(String[] args) {
		int x = -100;
		int result1 = +x;
		int result2 = -x;
		System.out.println("result1 = " + result1);
		System.out.println("result2 = " + result2);
		
		short s = 100;
		/*
		 * short result3 = -s; 자바에서는 부호 연산을 하여도 
		 * 산출 타입은 int가 되기 때문에 int보다 작은 타입에는 값을 넣을 수 없다.
		 */
		int result3 = -s;
		System.out.println("result3 = " + result3);
	}
}
