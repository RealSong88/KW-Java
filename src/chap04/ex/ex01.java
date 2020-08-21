package chap04.ex;

public class ex01 {
	public static void main(String[] args) {
		// for문을 활용하며 구구단을 2~9단까지 출력
		
		for(int i = 2; i < 10; i++) {
			System.out.println("*****" + i + "단*****");
			for(int j = 1; j < 10; j++) {
				System.out.println(i + " x " + j + " = " + (i * j));
			}
			System.out.println();
		}
		
		for(int i = 1; i < 10; i++) {
//			System.out.println("*****" + i + "단*****");
			for(int j = 2; j < 10; j++) {				
				System.out.print(j + " x " + i + " = " + (i * j) + "\t");
			}
			System.out.println();
		}
	}
}
