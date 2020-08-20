package chap02;

public class GarbageValueExample {
	public static void main(String[] args) {
		byte var1 = 125;
		int var2 = 125;
		for(int i = 0; i < 5; i++) {
			var1++;
			var2++;
			System.out.println("var1 : " + var1 + "\t var2 : " + var2);
		}
		// 오버플로우
		System.out.println("");
		
		byte var3 = -125;
		int var4 = -125;
		for(int i = 0; i < 5; i++) {
			var3--;
			var4--;
			System.out.println("var3 : " + var3 + "\t var4 : " + var4);
			
		}
		
	}
}
