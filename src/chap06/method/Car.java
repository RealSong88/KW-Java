package chap06.method;

public class Car {
	//필드
	int gas;
	
	//생성자(생략시에 매개변수가 없는 생성자가 자동생성)
	
	//메소드
	void setGas(int gas) {
		this.gas = gas;
	}
	
	boolean isLeftGas() {
		if(gas == 0) {
			System.out.println("gas가 없습니다.");
			return false; // 중간에 리턴을 만난경우 메소드가 종료
		}
		
		System.out.println("gas가 있습니다?");
		return true;
	}
	
	void run() {
		while(true) {
			if(gas > 0) {
				System.out.println("달립니다.(gas 잔량 : " + gas + ")");
				gas -= 1;
			} else {
				System.out.println("멈춥니다.(gas 잔량 : " + gas + ")");
				return; // 메소드 실행 종료
			}
		}
	}
}
