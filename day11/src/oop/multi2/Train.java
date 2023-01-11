package oop.multi2;

public class Train implements Transportation, Reserve{

	@Override
	public void reservation() {
		System.out.println("Train reservation");
	}

	@Override
	public void move() {
		System.out.println("Train mooooooove");
	}

	
	
}
