package oop.method2;

public class CoffeeShop {

	String name, category; 
	int price;
	boolean event;

	
	void setting(String name, String category, 
			int price, boolean event) {
		
		this.name=name;
		this.category=category;
		this.price=price;
		this.event=event;	
	}
	
	void output() {
		System.out.println("");
		System.out.println(this.name+" | ");
		System.out.println(this.category+" | ");
		System.out.println(this.price+" | ");
		System.out.println(this.event+" | ");

	}
	
}
