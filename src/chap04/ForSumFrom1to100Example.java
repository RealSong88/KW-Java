package chap04;

public class ForSumFrom1to100Example {
	public static void main(String[] args) {
		int sum = 0;
		for(int i = 1; i < 101; i++) {
			sum += i;
		}
		System.out.println(sum);
	}
}
