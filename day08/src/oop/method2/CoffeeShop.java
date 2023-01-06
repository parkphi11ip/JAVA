package oop.method2;

public class CoffeeShop {

	String name, category; 
	int price;
	boolean event;

	int rate=20;
	
	void setting(String name, String category, 
			int price, boolean event) {
		
		this.name=name;
		this.category=category;
		this.price=price;
		this.event=event;	
	}
	
	void output() {
		if(this.event) {
		System.out.println("");
		System.out.println(this.name+" | ");
		System.out.println(this.category+" | ");
		System.out.println(this.price*(100-rate)/100+" | ");
		System.out.println("(행사중)");

		}else {
			System.out.println("");
			System.out.println(this.name+" | ");
			System.out.println(this.category+" | ");
			System.out.println(this.price+" | ");
			System.out.println(" - ");
		}
	}
	
}
	

