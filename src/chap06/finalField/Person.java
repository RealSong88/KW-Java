package chap06.finalField;

public class Person {
	final String nation = "Korea";
	//final은 생성자에서 한번 초기화 가능
	final String ssn;
	
	String name;
	
	public Person(String ssn, String name) {
		
		this.ssn = ssn;
		this.name = name;
	}
}
														