package chap04;

public class ForSumFrom1to100Example2 {
	public static void main(String[] args) {
		int sum = 0;
		int i = 1;
		// 미리 변수를 초기화하면 for문에 초기화 식에 변수 선언을 안해도된다.
		for(; i <= 100; i++) {
			sum += i;
		}
		System.out.println("1~100까지의 합은 : " + sum);
	}
}
