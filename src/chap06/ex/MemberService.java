package chap06.ex;

public class MemberService {
	
	boolean login(String id, String password) {
		if(id == "hong" && password == "12345") {
			return true;
		} else {
		return false;
		}
	}
	void logout(String name) {
		System.out.println("로그아웃 되었습니다.");
	}
}
