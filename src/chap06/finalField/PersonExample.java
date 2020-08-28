package chap06.finalField;

public class PersonExample {
	public static void main(String[] args) {
		Person p1 = new Person("123456-1234567", "계백");
		
		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);
		
//		p1.nation = "America";    //nation은 final로 선언이 되어서 수정 불가
//		p1.ssn = "125667-1236677";
		p1.name = "이순신"; //인스턴스 필드임으로 수정 가능
	}
}
