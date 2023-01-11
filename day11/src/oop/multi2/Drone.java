package oop.multi2;

public class Drone implements Electronic, Transportation, Flyable{

	@Override
	public void fly() {
		System.out.println(" Dron fly ");
	}

	@Override
	public void move() {
		System.out.println("Dron Mooove");
	}

	@Override
	public void on() {
		System.out.println("turn on Dron");
	}

	@Override
	public void off() {

		System.out.println("turn off Dron");
		
	}

}
