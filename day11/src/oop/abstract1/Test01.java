package oop.abstract1;

public class Test01 {

	public static void main(String[] args) {
		
		IPhone13 a = new IPhone13("red", "123-24---4-241");
		a.call();
		a.sms();
		a.siri();
		a.itunes();
		a.output();
		
		System.out.println();
		
		IPhone14 b = new IPhone14("black", "12442-1424-142");
		b.call();
		b.sms();
		b.siri();
		b.faceTime();
		b.output();
		
		System.out.println();

		Galaxy22s c = new Galaxy22s("white","2140-42421-2");
		c.call();
		c.sms();
		c.bixby();
		c.samsungpay();
		c.output();
		
		
	}
}
