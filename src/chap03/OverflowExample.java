package chap03;

public class OverflowExample {
	public static void main(String[] args) {
		int x = 1000000;
		int y = 1000000;
		
		int z = x * y;
		
		System.out.println(z);
		
		long x2 = 10000000;
		long y2 = 10000000;
		
		long z2 = x2 *  y2;
		System.out.println(z2);
	}
}
