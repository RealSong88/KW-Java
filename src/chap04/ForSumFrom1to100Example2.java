package chap04;

public class ForSumFrom1to100Example2 {
	public static void main(String[] args) {
		int sum = 0;
		int i = 1;
		// �̸� ������ �ʱ�ȭ�ϸ� for���� �ʱ�ȭ �Ŀ� ���� ������ ���ص��ȴ�.
		for(; i <= 100; i++) {
			sum += i;
		}
		System.out.println("1~100������ ���� : " + sum);
	}
}
