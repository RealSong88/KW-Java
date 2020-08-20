package chap03.ex;

public class Ex01 {
	public static void main(String[] args) {
		// 입력이 90점 이상이면 'A', 80점 이상이면 'B', 70점 이상이면 'C', 60점 이상이면 'D'가 나오는 삼항 연산자
		
		int score = 75;
		
		char grade = (score > 90) ? 'A' : (score > 80) ? 'B' : (score > 70) ? 'C' : (score >60) ? 'D' : 'F';
		System.out.println(score + "점은 " + grade + "등급이다.");
		
		int value = 356;
		System.out.println((int)(value / 100) * 100);
		System.out.println((5+10)*7/2.0);
	}
}
