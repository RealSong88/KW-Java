package chap06.annotation;

public class Service {
	
	@Annotation
	public void method1() {
		System.out.println("���೻��1");
	}
	
	@Annotation("*")
	public void method2() {
		System.out.println("���೻��2");
	}

	@Annotation(value= "#", number = 20)
	public void method3() {
		System.out.println("���೻��3");
	}
}
