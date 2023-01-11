package oop.multi2;

public class Kickboard implements Electronic, Transportation{

	@Override
	public void move() {
		System.out.println("Kickboard movv");
	}

	@Override
	public void on() {
		System.out.println("turn on kickboard");
	}

	@Override
	public void off() {
		System.out.println("turn off kickboard");
		
	}

}
