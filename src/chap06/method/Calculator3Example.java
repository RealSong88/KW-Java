package chap06.method;

public class Calculator3Example {
	public static void main(String[] args) {
		Calculator3 myCalc = new Calculator3();
		
		//���簢���� ���� ���ϱ�
		double result1 = myCalc.areaRectangle(10);
		
		//���簢���� ���� ���ϱ�
		double result2 = myCalc.areaRectangle(10, 20);
		
		//������
		System.out.println("���簢���� ���� = " + result1);
		System.out.println("���簢���� ���� = " + result2);
		
	}
}
