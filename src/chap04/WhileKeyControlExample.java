package chap04;

public class WhileKeyControlExample {
	public static void main(String[] args) throws Exception {
		boolean run = true;
		int speed = 0;
		int keyCode = 0;
		
		while(run) {
			if(keyCode != 13 && keyCode != 10) {
				System.out.println("-------------------------");
				System.out.println("1.종속 | 2.감속 | 3.중지");
				System.out.println("-------------------------");
				System.out.print("선택 : ");
			}		
		
			keyCode = System.in.read(); // 버퍼에 저장된 enter(13, 10)의 키코드, 세바퀴 돌아서 keyCode 1, 2, 3 을 읽어 출력
			 // 버퍼에 들어있던 캐리지 리턴 13과 라인피드 10이 입력되어 코드가 세번 돈다.
			if(keyCode == 49) { // 1 을 읽었을 경우
				speed++;
				System.out.println("현재 속도 = " + speed);
			} else if(keyCode == 50) { // 2 를 읽었을 경우
				speed--;
				System.out.println("현재 속도 = " + speed);
			} else if (keyCode == 51) { // 3 을 읽었을 경우
				run = false;
			}
		}
		System.out.println("프로그램 종료");
	}
}
