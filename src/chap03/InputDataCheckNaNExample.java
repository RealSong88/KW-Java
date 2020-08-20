package chap03;

public class InputDataCheckNaNExample {
	public static void main(String[] args) {
		String userInput = "NaN";
		// Double.valueOf(String s) ���ڿ��� ����� �ٲ۴�.
		double val = Double.valueOf(userInput);
		
		double currentBalance = 10000.0;
		
		if(Double.isNaN(val)) {
			System.out.println("NaN�� �ԷµǾ� ó���� �� �����ϴ�.");
			val = 0.0;
		}
		
		currentBalance += val;
		System.out.println("���� ���� �ܰ�� : " + currentBalance);
	}
}
