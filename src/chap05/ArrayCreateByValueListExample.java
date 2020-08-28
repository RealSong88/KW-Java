package chap05;

public class ArrayCreateByValueListExample {
	public static void main(String[] args) {
		int[] scores = {83, 90, 87};
		
		System.out.println("scores[0] : " + scores[0]);
		System.out.println("scores[1] : " + scores[1]);
		System.out.println("scores[2] : " + scores[2]);
		
		int sum = 0;
		for(int i = 0; i < 3; i++) {
			sum += scores[i];
		}
		System.out.println("ÃÑÇÕ : " + sum);
		double avg = (double) sum / scores.length;
		System.out.println("Æò±Õ : " + avg);
		
		String[] str = {"ab", "cd", "ef"};
		
		for(int i = 0; i < str.length; i++) {
			System.out.println(str[i]);
		}
		str = new String[] {"ab", "cd", "ef", "hi"};
		for(int i = 0; i < str.length; i++) {
			System.out.println(str[i]);
		}
	}
}
