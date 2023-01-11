package oop.abstract1;

public class IPhone14 extends IPhone {

	public IPhone14(String color, String number) {
		super(color, number);
	}

	@Override
	public void siri() {
		System.out.println("iphone14 siri");
	}

	@Override
	public void call() {
		System.out.println("iphone14 call");
	}

	@Override
	public void sms() {
		System.out.println("iphone14 sms");
	}
	public void faceTime() {
		System.out.println("iphone14 faceTime");
	}

}
