package oop.keyword3;

public class Galaxy {

	private String number;
	private String company;
	private String color;
	
	public Galaxy(String number, String color) {
		this.setCompany("삼성");
		this.setNumber(number);
		this.setColor(color);
	}
	public void output() {
		System.out.println(getCompany());
		System.out.println(getNumber());
		System.out.println(getColor());
	}
	
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	
}
