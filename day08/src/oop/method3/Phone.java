package oop.method3;

public class Phone {

	String name, telecome; 
	int price;
	int contract;
	
	int rate = 5 ;
	
	void setting(String name, String telecome, 
			int price,int contract) {
		this.name=name;
		this.telecome=telecome;
		this.price=price;
		this.contract=contract;	
	}
	
	void output() {
		if(contract==0) {
			System.out.println("");
			System.out.println(this.name+" | ");
			System.out.println(this.telecome+" | ");
			System.out.println(this.price*(100-rate)/100+" (약정없음) ");
			System.out.println("설정하지 않음");
		}
		else {
			System.out.println("");
			System.out.println(this.name+" | ");
			System.out.println(this.telecome+" | ");
			System.out.println(this.price+" | ");
			System.out.println(this.price/this.contract+" | "+this.contract+"개월 할부 금액 ");
		}
		
	}
}
