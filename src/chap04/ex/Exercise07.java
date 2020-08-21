package chap04.ex;

import java.util.Scanner;

public class Exercise07 {

	public static void main(String[] args) {
		/*
		 * while문과 Scanner를 이용해서 키보드로부터 입력된 데이터로
		 *  예금, 출금, 조회, 종료 기능을 제공하는 코드를 작성
		 */
		boolean run = true;
		
		int balance = 0;
		
		Scanner sc = new Scanner(System.in);
		
		aaa : while(run) {
			System.out.println("======================================");
			System.out.println("1.예금 | 2.출금 | 3. 잔고 | 4. 종료");
			System.out.println("======================================");
			System.out.print("선택> ");
			
			int choice = sc.nextInt();
			
			switch (choice) {
			case 1:
				System.out.print("예금액> ");
				int getMoney = sc.nextInt();
				balance += getMoney;
				break;
				
			case 2:
				System.out.print("출금액>");
				int subMoney = sc.nextInt();
				balance -= subMoney;
				break;
				
			case 3:
				System.out.println("잔고 : " + balance);
				break;
									
			case 4:
				break aaa;
			
			}
			
//			if(choice == 4) {
//				break;
//			}
		}
		
		System.out.println("프로그램 종료");
		sc.close();
	}

}
