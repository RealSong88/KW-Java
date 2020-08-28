package chap06.staticMember;

public class Televison {

	static String company = "Samsung";
	static String model = "OLED";
	static String info;
	
	static {
		info = company + "-" + model;
	}
}
