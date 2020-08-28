package chap05.ex;

public class Exercise08 {
	public static void main(String[] args) {
		int[][] array = {
				{95, 86},
				{83, 92, 96},
				{78, 83, 93, 87, 88}		
		};
		
		int sum = 0;
		double avg = 0.0;
		
		int total_length = 0;
		for(int i = 0; i < array.length; i++) {
			for(int k = 0; k < array[i].length; k++) {
				sum += array[i][k];
				total_length++;
			}
			// ¶Ç´Â
			// total_length += array[i].length;
		}
		System.out.println(total_length);
		
		avg = (double) sum / total_length;
		
		System.out.println("sum : " + sum);
		System.out.println("avg : " + avg);
	}
}
