package oop.method1;

public class Mobile {

	String tellecom, product;
	int monthpay, data, calltime, sms;
	
	void output() {
		
		System.out.print(this.tellecom+" | ");
		System.out.print(this.product+" | ");
		System.out.print(this.monthpay+" | ");
		System.out.print(this.data+" | ");
		System.out.print(this.calltime+" | ");
		System.out.print(this.sms+" | ");
		
	}
	
	void setting(String tellecom, String product, 
			int monthpay, int data, int calltime, int sms) {
		
		this.tellecom=tellecom;
		this.product=product;
		this.monthpay=monthpay;
		this.data=data;
		this.calltime=calltime;
		this.sms=sms;
	
	}

}