package oop.inherit6;

public class Phone {

	private String num;
	private String color;

	public void call() {
		System.out.println("call");
	}
	public void sms() {
		System.out.println("message");
	}
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}

	
	
}
