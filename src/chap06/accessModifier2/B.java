package chap06.accessModifier2;

public class B {
	public B() {
		A a = new A();
		a.field1 = 1;
		a.field2 = 1; //default ������ ���� ��Ű�������� ��밡��
//		a.field3 = 1; ���ٺҰ�
		
		a.method1();
		a.method2();
//		a.method3(); ���ٺҰ�
	}
	
	
}
