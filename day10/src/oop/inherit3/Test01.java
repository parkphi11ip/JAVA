package oop.inherit3;

public class Test01 {

	public static void main(String[] args) {
		
		Browser a = new Browser();
		
		a.setUrl("www.dad.com");
		a.setMove("qd");
		
		a.url();
		
			System.out.println();
		// galaxy 객체를 생성.
		
		Chrome b = new Chrome();
		
		b.url();
		b.move();
		b.refresh();
		b.chromeStore();
		b.develop();
		
	}
}
