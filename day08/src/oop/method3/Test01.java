package oop.method3;

public class Test01 {

public static void main(String[] args) {

		Phone q = new Phone();
		Phone w = new Phone();
		Phone e = new Phone();
		Phone r = new Phone();
		
		q.setting("갤럭시22s", "SK", 1800000, 0);
		w.setting("갤럭시22s", "KT", 1750000, 24);
		e.setting("아이폰14", "LG", 2000000, 30);
		r.setting("아이폰14", "SK", 1999999, 0);
		
		
		q.output();
		w.output();
		e.output();
		r.output();
		
	}

}
