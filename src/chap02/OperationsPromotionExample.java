package chap02;

public class OperationsPromotionExample {
	public static void main(String[] args) {
		
		byte byteValue1 = 10;
		byte byteValue2 = 20;
		byte byteValue3 = (byte)(byteValue1 + byteValue2);
		System.out.println(byteValue3);
		// 자바는 정수 연산일 경우 int 타입을 기본으로 연산한다.
		// 이유는 피 연산자를 4byte 단위로 저장하기 때문이다.
		int intValue1 = byteValue1 + byteValue2;
		System.out.println(intValue1);
		
		char charValue1 = 'A';
		char charValue2 = 1;
//		char charValue3 = charValue1 + charValue2;
		int intValue2 = charValue1 + charValue2;
		System.out.println("유니코드 = "  + intValue2);
		System.out.println("출력문자 = " + (char)intValue2);
		
		int intValue3 = 10;
		int intValue4 = intValue3/4;
		System.out.println(intValue4);
		
		int intValue5 = 10;
//		int intValue6 = 10 / 4.0;
		//피 연산자가 실수인 경우 나머지 연산자도 실수가 되기 때문에 int에 넣을 수 없습니다.
		double doubleValue = intValue5 / 4.0; 
		System.out.println(doubleValue);
		
	}
}
