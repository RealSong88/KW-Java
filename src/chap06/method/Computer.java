package chap06.method;

public class Computer {
	// �迭Ÿ������ �����ϸ�, �޼ҵ带 ȣ���ϱ� ���� �迭�� �����ؾ���
	int sum1(int[] values) {
		int sum = 0;
		
		for(int i = 0; i < values.length; i++) {
			sum += values[i];
		}
		return sum;
	}
	
	int sum2(int ... values) {
		// ���� �Ű��������� values��� �迭�� ����.
		int sum = 0;
		for(int i = 0; i < values.length; i++) {
			sum += values[i];
		}
		return sum;
	}
}
