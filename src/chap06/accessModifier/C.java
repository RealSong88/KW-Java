package chap06.accessModifier;

import chap06.accessModifier2.A;
public class C {
	public C() {
		A a = new A();
		
		a.field1 = 1;
//		a.field2 = 1; default ���������� �̹Ƿ� �ٸ� ��Ű������ ��� �Ұ�
//		a.field3 = 1; private ���������� �̹Ƿ� �ٸ� ��Ű������ ��� �Ұ�
		
		a.method1(); 
//		a.method2();  default ���������� �̹Ƿ� �ٸ� ��Ű������ ��� �Ұ�
//		a.method3();  private ���������� �̹Ƿ� �ٸ� ��Ű������ ��� �Ұ�
	}
}

