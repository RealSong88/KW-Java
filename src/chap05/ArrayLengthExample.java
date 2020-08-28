package chap05;

public class ArrayLengthExample {
	public static void main(String[] args) {
		int[] scores = {83, 90, 87};
		
		int sum = 0;
		
		for(int i = 0; i < scores.length; i++) {
			//배열.length = 배열의 길이(최대 index + 1)	
			sum += scores[i];
		}
		System.out.println("총합 : " + sum);
		
		double avg = (double) sum / scores.length;
		System.out.println("평균 : " + avg);
	}
}
