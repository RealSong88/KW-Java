package chap06.finalField;

public class Person {
	final String nation = "Korea";
	//final�� �����ڿ��� �ѹ� �ʱ�ȭ ����
	final String ssn;
	
	String name;
	
	public Person(String ssn, String name) {
		
		this.ssn = ssn;
		this.name = name;
	}
}
														