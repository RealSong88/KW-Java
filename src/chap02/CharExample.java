package chap02;

public class CharExample {

	public static void main(String[] args) {
		char c1 = 'A';
		char c2 = 65;
		// 65는 ASCII 코드
		// 0 ~ 127까지 할당되어있는 표준 코드
		// American Standard Code for Information Interchange
		// 미국 정보 교환 표준 부호
		char c3 = '\u0041';
		
		char c4 = '가';
		char c5 = 44032;
		char c6 = '\uac00';
		
		int uniCode1 = c1;
		int uniCode2 = c4;
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		System.out.println(c5);
		System.out.println(c6);
		System.out.println(uniCode1);
		System.out.println(uniCode2);
	}

}
