package oop.multi2;

public class Bus implements Transportation, Reserve{

	@Override
	public void reservation() {
		System.out.println("bus reservation");
	}

	@Override
	public void move() {
		System.out.println("bus move");
	}

}
