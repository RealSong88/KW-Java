package chap06.method;

public class Computer {
	// 배열타입으로 선언하면, 메소드를 호출하기 전에 배열을 생성해야함
	int sum1(int[] values) {
		int sum = 0;
		
		for(int i = 0; i < values.length; i++) {
			sum += values[i];
		}
		return sum;
	}
	
	int sum2(int ... values) {
		// 들어온 매개변수들을 values라는 배열로 만듬.
		int sum = 0;
		for(int i = 0; i < values.length; i++) {
			sum += values[i];
		}
		return sum;
	}
}
