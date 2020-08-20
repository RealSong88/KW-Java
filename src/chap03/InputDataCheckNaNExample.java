package chap03;

public class InputDataCheckNaNExample {
	public static void main(String[] args) {
		String userInput = "NaN";
		// Double.valueOf(String s) 문자열을 더블로 바꾼다.
		double val = Double.valueOf(userInput);
		
		double currentBalance = 10000.0;
		
		if(Double.isNaN(val)) {
			System.out.println("NaN이 입력되어 처리할 수 없습니다.");
			val = 0.0;
		}
		
		currentBalance += val;
		System.out.println("현재 통장 잔고는 : " + currentBalance);
	}
}
