package chap06.annotation;

import java.lang.reflect.Method;

public class PrintAnnotationExample {
	public static void main(String[] args) {
		Method[] declAredMethods = Service.class.getDeclaredMethods();
		//Service Ŭ�����κ��� �޼ҵ� ������ ���ɴϴ�.
		
		//Method ��ü�� �ϳ��� ó��
		
		for(Method method : declAredMethods) {
			//Annotation�� ����Ǿ����� Ȯ��
			if(method.isAnnotationPresent(Annotation.class)) {
				
				//Annotation ��ü ���
				Annotation printAnnotation = 
						method.getAnnotation(Annotation.class);
				
				//�޼ҵ� �̸� ���
				System.out.println("[" + method.getName() + "]");
				
				//���м� ���
				for(int i = 0; i < printAnnotation.number(); i++) {
					System.out.println(printAnnotation.value());
				}
				System.out.println();
				
				try {
					
					//�޼ҵ� ȣ��
					method.invoke(new Service());
				}catch(Exception e) {
					System.out.println();
				}
			}
		}
	}
}
