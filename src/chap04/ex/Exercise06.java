package chap04.ex;

public class Exercise06 {
	public static void main(String[] args) {
		// for문을 이용해 삼각형을 출력하라
		
		for(int i = 5; i > 0; i--) {
			for(int j = i; j <= 5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		
		for(int i = 0; i < 5; i++) {
			for(int j = 5 - i; j > 0; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
