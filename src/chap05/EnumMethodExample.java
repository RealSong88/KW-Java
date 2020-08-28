package chap05;

public class EnumMethodExample {
	public static void main(String[] args) {
		//name() 메소드
		Week today = Week.SUNDAY;
		String name = today.name();
		System.out.println(name);
		
		// ordinal() 메소드
		int ordinal = today.ordinal();
		System.out.println(ordinal);
		
		//compareTo() 메소드
		// 매개값으로 주어진 열거 객체를 기준으로 전후로 몇번재 위치하는지를 반환하는 메소드
		Week day1 = Week.MONDAY;
		Week day2 = Week.WEDNESDAY;
		int result1 = day1.compareTo(day2);
		int result2 = day2.compareTo(day1);
		System.out.println(result1);
		System.out.println(result2);
		
		// valueOf() 메소드
		// 매개값으로 주어진 문자열과 동일한 무자열을 가지는 열거 객체를 반환한다.
		if(args.length == 1) {
			String strDay = args[0];
			Week weekDay = Week.valueOf(strDay);
			if(weekDay == Week.SATURDAY || weekDay == Week.SUNDAY) {
				System.out.println("주말 이군요");
			} else {
				System.out.println("평일 이군");
			}			
		}
		
		// values() 메소드
		// 열거타입의 모든 열거 객체들을 배열로 만들어 반환합니다.
		Week[] days = Week.values();
		for(Week day : days) {
			System.out.println(day);
		}
	}
}
