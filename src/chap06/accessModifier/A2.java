package chap06.accessModifier;

public class A2 {
	//필드
	
	A2 a1 = new A2(true);
	A2 a2 = new A2(1);
	A2 a3 = new A2("문자열");
	
	//생성자
	public A2(boolean b) {}
	A2(int b){}
	private A2(String s) {}
}
