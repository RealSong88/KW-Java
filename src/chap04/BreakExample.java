package chap04;

public class BreakExample {
	public static void main(String[] args) {
		while(true) {
			int num = (int) (Math.random() * 6) + 1;
			System.out.println(num);
			
			if(num == 6) {
				break; // 반복문을 종료하는 명령어(switch문 도..)
			}
		}
		System.out.println("프로그램 종료?");
	}
}
