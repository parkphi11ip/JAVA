package oop.abstract1;

public class IPhone13 extends IPhone {

	public IPhone13(String color, String number) {
		super(color, number);
	}

	@Override
	public void siri() {
		System.out.println("iphone13 siri");
	}

	@Override
	public void call() {
		System.out.println("iphone13 call");
	}

	@Override
	public void sms() {
		System.out.println("iphone13 sms");
	}
	public void itunes() {
		System.out.println("iphone13 itunes");
	}

}
