package chap04.ex;

public class ex02 {
	public static void main(String[] args) {
		//while���� Math.random()�޼ҵ带 ���ؼ� �ΰ��� �ֻ����� 
		//������ �� ������ ���� (��1, ��2) ���·� ǥ��, ���� ���� 5��
		//�ƴϸ� ��� �ֻ����� ������, ���� ���� 5�̸� ������ ���ߴ� �ڵ带 �ۼ�
		
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
