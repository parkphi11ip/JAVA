package oop.keyword4;

public class Galaxy {

	//데이터를 정적static과 동적dynamic으로 구분하여 생ㄱ가하자.
	//정적인 데이터는 만들지 않아도 알 수 있으며, 모두가 동일하게 관리되어야 한다.
	//static이라는 키워드를 이용해서 표시를 해준다.
	//getter / setter 메소드도 static으로 구현해야 함.
	
	private static String company = "삼성";
	
	//동적인 데이터는 객체를 만들면서 설정하며, 객체마다 각자 다르게 관리한다.
	//일반 필드로 생성한다.
	
	private String number;
	private String color;
	
	public Galaxy(String number, String color) {
		this.setColor(color);
		this.setNumber(number);
	}
	
	public void output() {
		System.out.println(this.getNumber());
		System.out.println(this.getColor());
//		System.out.println(this.getCompany()); //잘못된 방법
		System.out.println(getCompany());
	}
	
	
	//생성자에서는 static항목을 초기화하지 않음.
	
	public static String getCompany() {
		return company;
	}
	public static void setCompany(String company) {
		Galaxy.company = company;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
}
