package chap06.annotation;

import java.lang.reflect.Method;

public class PrintAnnotationExample {
	public static void main(String[] args) {
		Method[] declAredMethods = Service.class.getDeclaredMethods();
		//Service 클래스로부터 메소드 정보를 얻어옵니다.
		
		//Method 객체를 하나씩 처리
		
		for(Method method : declAredMethods) {
			//Annotation이 적용되었는지 확인
			if(method.isAnnotationPresent(Annotation.class)) {
				
				//Annotation 객체 얻기
				Annotation printAnnotation = 
						method.getAnnotation(Annotation.class);
				
				//메소드 이름 출력
				System.out.println("[" + method.getName() + "]");
				
				//구분선 출력
				for(int i = 0; i < printAnnotation.number(); i++) {
					System.out.println(printAnnotation.value());
				}
				System.out.println();
				
				try {
					
					//메소드 호출
					method.invoke(new Service());
				}catch(Exception e) {
					System.out.println();
				}
			}
		}
	}
}
