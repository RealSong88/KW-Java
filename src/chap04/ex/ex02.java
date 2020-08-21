package chap04.ex;

public class ex02 {
	public static void main(String[] args) {
		//while문과 Math.random()메소드를 통해서 두개의 주사위를 
		//던졌을 때 나오는 눈을 (눈1, 눈2) 형태로 표시, 눈의 합이 5가
		//아니면 계속 주사위를 던지고, 눈의 합이 5이면 실행을 멈추는 코드를 작성
		
		while(true) {
			int dice1 = (int)(Math.random() * 6) + 1;
			int dice2 = (int)(Math.random() * 6) + 1;
			
			if(dice1 + dice2 == 5) {
				break;
			}
			
			System.out.println("(" + dice1 + ", " + dice2 + ")");
		}
//		char var3 = '';
		float var5 = 10;
//		System.out.println(var3);
		System.out.println(var5);
		
	}
}
