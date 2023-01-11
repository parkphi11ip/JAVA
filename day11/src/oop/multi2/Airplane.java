package oop.multi2;

public class Airplane implements Transportation, Flyable, Reserve{

	@Override
	public void reservation() {
		System.out.println(" airplane reservation");
	}

	@Override
	public void fly() {
		System.out.println("airplane fly");
		
	}

	@Override
	public void move() {
		System.out.println("airplane moove");
	}

	
	
}
