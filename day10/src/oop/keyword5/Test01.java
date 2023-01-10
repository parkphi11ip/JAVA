package oop.keyword5;

public class Test01 {
	public static void main(String[] args) {
		
		KHbank q = new KHbank("유재석", 0.3, 50000000);
		KHbank w = new KHbank("강호동", 0.5, 35000000);
		KHbank e = new KHbank("신호동", 0.2, 80000000);
		
		q.output();
		w.output();
		e.output();
		
		
	}

}
