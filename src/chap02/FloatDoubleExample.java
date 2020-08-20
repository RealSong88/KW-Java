package chap02;

public class FloatDoubleExample {
	public static void main(String[] args) {
		double var1 = 3.14;
//		float var2 = 3.14; //컴파일 에러 (type missmatch)
		// 자바에서는 소숫점을 찍으면 기본적으로 double로 인식하기 때문에 Type missmatch 발생
		float var3 = 3.14f;
		
		double var4 = 0.1234567890123456789;
		float var5 = 0.1234567890123456789f;
		
		System.out.println("var1 : " + var1);
		System.out.println("var3 : " + var3);
		System.out.println("var4 : " + var4);
		System.out.println("var5 : " + var5);
		
		int var6 = 3000000;
		double var7 = 3e6;
		float var8 = 3e6f;
		double var9 = 2e-3;
		
		System.out.println("var6 : " + var6);
		System.out.println("var7 : " + var7);
		System.out.println("var8 : " + var8);
		System.out.println("var9 : " + var9);
		
	}
}
