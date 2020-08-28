package chap06.accessModifier;

import chap06.accessModifier2.A;
public class C {
	public C() {
		A a = new A();
		
		a.field1 = 1;
//		a.field2 = 1; default 접근제어자 이므로 다른 패키지에서 사용 불가
//		a.field3 = 1; private 접근제어자 이므로 다른 패키지에서 사용 불가
		
		a.method1(); 
//		a.method2();  default 접근제어자 이므로 다른 패키지에서 사용 불가
//		a.method3();  private 접근제어자 이므로 다른 패키지에서 사용 불가
	}
}

