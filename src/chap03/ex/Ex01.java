package chap03.ex;

public class Ex01 {
	public static void main(String[] args) {
		// �Է��� 90�� �̻��̸� 'A', 80�� �̻��̸� 'B', 70�� �̻��̸� 'C', 60�� �̻��̸� 'D'�� ������ ���� ������
		
		int score = 75;
		
		char grade = (score > 90) ? 'A' : (score > 80) ? 'B' : (score > 70) ? 'C' : (score >60) ? 'D' : 'F';
		System.out.println(score + "���� " + grade + "����̴�.");
		
		int value = 356;
		System.out.println((int)(value / 100) * 100);
		System.out.println((5+10)*7/2.0);
	}
}
