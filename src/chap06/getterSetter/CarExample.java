package chap06.getterSetter;

public class CarExample {
	public static void main(String[] args) {
		Car myCar = new Car();
		
		//�߸��� �ӵ� ����		
		myCar.setSpeed(-50);  // myCar.speed = -50;
		
		System.out.println("���� �ӵ� : " + myCar.getSpeed());
		//myCar.getSpeed() = myCar.speed;
		
		myCar.setSpeed(60);		
		System.out.println("���� �ӵ� : " + myCar.getSpeed());
		
		if(!myCar.isStop()) {
			myCar.setStop(true);
		}
		
		System.out.println("���� �ӵ� : " + myCar.getSpeed());
	}
}
