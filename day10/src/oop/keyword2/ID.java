package oop.keyword2;

//(주의) 클래스에서는 입력을 고려하지 않는다
public class ID {

	private final String id;
	private String password;
	private int point;

	public ID(String id, String password) {
		this.id = id;
		this.setPassword(password);
		this.setPoint(100);
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		if(point < 0) return;
		this.point = point;
	}

	public String getId() {
		return id;
	}

	public void output() {
		System.out.println("<회원 정보>");
		System.out.println("아이디 : " + this.id);
		System.out.println("비밀번호 : " + this.password);
		System.out.println("포인트 : " + this.point + "point");
	}

}