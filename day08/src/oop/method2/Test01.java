package oop.method2;

public class Test01 {

	public static void main(String[] args) {
		
		CoffeeShop q = new CoffeeShop();
		CoffeeShop w = new CoffeeShop();
		CoffeeShop e = new CoffeeShop();
		CoffeeShop r = new CoffeeShop();
		
		q.setting("아메리카노", "음료", 2500, true);
		w.setting("모카라떼", "음료", 3500, false);
		e.setting("치즈케이크", "디저트", 5000, true);
		r.setting("마카롱", "디저트", 3000, false);
		
		
		q.output();
		w.output();
		e.output();
		r.output();
		
		}
		
	}

