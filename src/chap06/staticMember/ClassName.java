package chap06.staticMember;

public class ClassName {
	//�ν��Ͻ� �ʵ�� �޼ҵ�
	
	int field1;
	void method1() {}
	
	//���� �ʵ�� �޼ҵ�
	static int field2;
	static void method2() {}
	
	static {
//		field1 = 10; //���ٺҰ�
//		method1();   //�ν��Ͻ��� �������� �ʾұ� ������ ����� �ȵ�
		field2 = 10;
		method2();
	}
	
	static void method3() {
		//��ü�� ���� �����ϸ� �ν��Ͻ� �ʵ峪 �޼ҵ� ��� ����
		ClassName obj = new ClassName();
		obj.field1 = 10;
		obj.method1();
//		this.field1 = 10; //�����Ͽ���
//		this.method1();   //�����Ͽ���
		field2 = 10;
		method2();
	}
}
