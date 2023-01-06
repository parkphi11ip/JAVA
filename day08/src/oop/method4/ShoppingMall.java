package oop.method4;

public class ShoppingMall {

	String name, category; 
	int price;
	boolean delivery;
	boolean event;

	int rate = 10;
	
	void setting(String name, String category, 
			int price,boolean delivery, boolean event) {
		this.name=name;
		this.category=category;
		this.price=price;
		this.delivery=delivery;	
		this.event=event;
	}
	
	void output() {
		
		if(this.delivery && (!this.event)) {
			System.out.println("");
			System.out.println(this.name+" | ");
			System.out.println(this.category+" | ");
			System.out.println(this.price+" | ");
			System.out.println("새벽배송이 가능한 상품은 2500원의 배송비가 추가됩니다.");
		}if(this.event) {
			System.out.println("");
			System.out.println(this.name+" | ");
			System.out.println(this.category+" | ");
			System.out.println(this.price*(100-rate)/100+" | 현재 '행사중' 인 상품입니다. 할인이 적용되었습니다.");
			if(this.delivery&&this.event) {
				System.out.println("새벽배송이 가능한 상품은 2500원의 배송비가 추가됩니다.");
	
			}
		}
	}
}
