package chap04.ex;

import java.util.Scanner;

public class Exercise07 {

	public static void main(String[] args) {
		/*
		 * while���� Scanner�� �̿��ؼ� Ű����κ��� �Էµ� �����ͷ�
		 *  ����, ���, ��ȸ, ���� ����� �����ϴ� �ڵ带 �ۼ�
		 */
		boolean run = true;
		
		int balance = 0;
		
		Scanner sc = new Scanner(System.in);
		
		aaa : while(run) {
			System.out.println("======================================");
			System.out.println("1.���� | 2.��� | 3. �ܰ� | 4. ����");
			System.out.println("======================================");
			System.out.print("����> ");
			
			int choice = sc.nextInt();
			
			switch (choice) {
			case 1:
				System.out.print("���ݾ�> ");
				int getMoney = sc.nextInt();
				balance += getMoney;
				break;
				
			case 2:
				System.out.print("��ݾ�>");
				int subMoney = sc.nextInt();
				balance -= subMoney;
				break;
				
			case 3:
				System.out.println("�ܰ� : " + balance);
				break;
									
			case 4:
				break aaa;
			
			}
			
//			if(choice == 4) {
//				break;
//			}
		}
		
		System.out.println("���α׷� ����");
		sc.close();
	}

}
