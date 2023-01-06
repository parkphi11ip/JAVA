package oop.method3;

public class Phone {

	String name, telecome; 
	int price;
	boolean contract;

	
	void setting(String name, String telecome, 
			int price,boolean contract) {
		this.name=name;
		this.telecome=telecome;
		this.price=price;
		this.contract=contract;	
	}
	
	void output() {
		if(this.contract) {
		System.out.println("");
		System.out.println(this.name+" | ");
		System.out.println(this.telecome+" | ");
		System.out.println(this.price+" | ");
		System.out.println(this.price);
		}else {
			System.out.println("");
			System.out.println(this.name+" | ");
			System.out.println(this.telecome+" | ");
			System.out.println(this.price*0.95+" (약정없음) ");
			System.out.println("설정하지 않음");
		}
	}
	
}
	

