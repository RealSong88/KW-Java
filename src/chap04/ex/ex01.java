package chap04.ex;

public class ex01 {
	public static void main(String[] args) {
		// for���� Ȱ���ϸ� �������� 2~9�ܱ��� ���
		
		for(int i = 2; i < 10; i++) {
			System.out.println("*****" + i + "��*****");
			for(int j = 1; j < 10; j++) {
				System.out.println(i + " x " + j + " = " + (i * j));
			}
			System.out.println();
		}
		
		for(int i = 1; i < 10; i++) {
//			System.out.println("*****" + i + "��*****");
			for(int j = 2; j < 10; j++) {				
				System.out.print(j + " x " + i + " = " + (i * j) + "\t");
			}
			System.out.println();
		}
	}
}
