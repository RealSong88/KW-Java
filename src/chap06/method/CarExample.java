package chap06.method;

public class CarExample {
	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.setGas(3); // Car ��ü�� setGas() �޼ҵ� ȣ��
		
		boolean gasState = myCar.isLeftGas();
		if(gasState) {
			System.out.println("����մϴ�.");
			myCar.run();
		}
		
		if(myCar.isLeftGas()) {
			System.out.println("gas�� ������ �ʿ䰡 �����ϴ�.");
		} else {
			System.out.println("gas�� �����ϼ���.");
		}
	}
}
