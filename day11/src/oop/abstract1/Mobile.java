package oop.abstract1;

//추상 클래스(abstract class)
//- 상속을 위한 상위 클래스
//- 일반 클래스와 다른 점이 세 가지 있다
//	1. 클래스에 abstract라고 꼭 표시를 해야 한다
//	2. 객체 생성이 불가능하다
//	3. 추상 메소드를 가질 수 있다
public abstract class Mobile {
	//필드 - 일반 클래스와 달라지는 부분이 없다
	protected String number;
	protected String color;
	
	//생성자 - 일반 클래스와 동일
	public Mobile(String color, String number) {
		this.color = color;
		this.number = number;
	}
	
	//메소드 
	//- 추상 메소드와 일반 메소드로 구현
	//- 추상 메소드는 이름은 아는데 내용을 모를 때
	public abstract void call();
	public abstract void sms();
	public void output() {
		System.out.println("Number : " + number);
		System.out.println("Color : " + color);
	}
}