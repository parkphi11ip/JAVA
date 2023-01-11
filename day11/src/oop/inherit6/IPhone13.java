package oop.inherit6;

public class IPhone13 extends IPhone {

	public void itunes() {
		System.out.println("iphone13 itunes ..!");
	}
	@Override
	public void call() {
		System.out.println("iphone13 call");
	}
	@Override
	public void sms() {
		System.out.println("iphone13 message");
	}
	@Override
	public void siri() {
		System.out.println("iphone13 siri ..!");
	}
}
