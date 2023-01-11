package oop.multi2;

public class Test01 {

	public static void main(String[] args) {
		
		Bus a = new Bus();
		a.move();
		a.reservation();
		
		Airplane b = new Airplane();
		b.move();
		b.fly();
		b.reservation();
		
		Drone c = new Drone();
		c.move();
		c.fly();
		c.off();
		
		Kickboard d = new Kickboard();
		d.move();
		d.on();
		
		Train e = new Train();
		e.move();
		e.reservation();
		
		
		
		
	}
}
