package chap03;

public class BitReverseOperatorExample {
	public static void main(String[] args) {
		int v1 = 10;
		int v2 = ~v1;
		int v3 = ~v1 + 1;
		System.out.println(toBinaryString(v1) + " (������ : " + v1 + ")");
		System.out.println(toBinaryString(v2) + " (������ : " + v2 + ")");
		System.out.println(toBinaryString(v3) + " (������ : " + v3 + ")");
		System.out.println();
		
		int v4 = -10;
		int v5 = ~v4;
		int v6 = ~v4 + 1;
		System.out.println(toBinaryString(v4) + " (������ : " + v4 + ")");
		System.out.println(toBinaryString(v5) + " (������ : " + v5 + ")");
		System.out.println(toBinaryString(v6) + " (������ : " + v6 + ")");
		
//		int v7 = -1;
//		String str = Integer.toBinaryString(v7);
//		System.out.println(str);

	}
	
	public static String toBinaryString(int value) {
		String str = Integer.toBinaryString(value);
		
//		System.out.println(str);
		// ����� ��� 32��Ʈ ǥ���� ���ϱ� ������ ���̰� 32�� �� ������ ���� ���� 0 �߰� 
		while(str.length() < 32) {
			str = "0" + str;
		}
		return str;
	}
}
