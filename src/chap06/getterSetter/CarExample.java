package chap06.getterSetter;

public class CarExample {
	public static void main(String[] args) {
		Car myCar = new Car();
		
		//잘못된 속도 변경		
		myCar.setSpeed(-50);  // myCar.speed = -50;
		
		System.out.println("현재 속도 : " + myCar.getSpeed());
		//myCar.getSpeed() = myCar.speed;
		
		myCar.setSpeed(60);		
		System.out.println("현재 속도 : " + myCar.getSpeed());
		
		if(!myCar.isStop()) {
			myCar.setStop(true);
		}
		
		System.out.println("현재 속도 : " + myCar.getSpeed());
	}
}
