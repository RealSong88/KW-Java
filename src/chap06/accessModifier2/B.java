package chap06.accessModifier2;

public class B {
	public B() {
		A a = new A();
		a.field1 = 1;
		a.field2 = 1; //default 임으로 같은 패키지내에서 사용가능
//		a.field3 = 1; 접근불가
		
		a.method1();
		a.method2();
//		a.method3(); 접근불가
	}
	
	
}
