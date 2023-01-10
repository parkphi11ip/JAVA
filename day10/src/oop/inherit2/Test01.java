package oop.inherit2;

public class Test01 {

	public static void main(String[] args) {

	IPhone a = new IPhone();
	a.setNumber("010-1519-1581");
	a.setColor("black");
	
	a.call();
	a.sms();
	a.airDrop();
	
		System.out.println();
	// galaxy 객체를 생성.
	
	Galaxy b = new Galaxy();
	b.setNumber("010-449-4844");
	b.setColor("white");

	b.call();
	b.sms();
	b.samsungPay();
	
	
	}
}
