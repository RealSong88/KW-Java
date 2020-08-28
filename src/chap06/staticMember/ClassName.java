package chap06.staticMember;

public class ClassName {
	//인스턴스 필드와 메소드
	
	int field1;
	void method1() {}
	
	//정적 필드와 메소드
	static int field2;
	static void method2() {}
	
	static {
//		field1 = 10; //접근불가
//		method1();   //인스턴스가 생성되지 않았기 때문에 사용이 안됨
		field2 = 10;
		method2();
	}
	
	static void method3() {
		//객체를 먼저 생성하면 인스턴스 필드나 메소드 사용 가능
		ClassName obj = new ClassName();
		obj.field1 = 10;
		obj.method1();
//		this.field1 = 10; //컴파일에러
//		this.method1();   //컴파일에러
		field2 = 10;
		method2();
	}
}
