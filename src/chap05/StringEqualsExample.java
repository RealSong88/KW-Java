package chap05;

public class StringEqualsExample {
	public static void main(String[] args) {
		String strVar1 = "신민철";
		String strVar2 = "신민철";
		
		if(strVar1 == strVar2) {
			System.out.println("strVar1과 strVar2는 참조가 같음");
		} else {
			System.out.println("strVar1과 strvar2는 참조가 다름");
		}
		
		if(strVar1.equals(strVar2)) {
			System.out.println("데이터값이 같음");
		} else {
			System.out.println("데이터값이 다름");
		}
		
		String strVar3 = new String("신민철");
		String strVar4 = new String("신민철");
		
		if(strVar3 == strVar4) {
			System.out.println("strVar3과 strVar4는 참조가 같음");
		} else {
			System.out.println("strVar3과 strvar4는 참조가 다름");
		}
		
		if(strVar3.equals(strVar4)) {
			System.out.println("데이터값이 같음");
		} else {
			System.out.println("데이터값이 다름");
		}
		
		
	}
	
}
