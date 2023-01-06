package oop.method4;

	public class Test01 {

	public static void main(String[] args) {
	
	ShoppingMall q = new ShoppingMall();
	ShoppingMall w = new ShoppingMall();
	ShoppingMall e = new ShoppingMall();
	ShoppingMall r = new ShoppingMall();
	
	q.setting("참이슬후레쉬", "주류", 1200, true, true);
	w.setting("클라우드맥주", "주류", 3000, false, true);
	e.setting("바나나킥", "과자", 1500, false, true);
	r.setting("허니버터칩", "과자", 2000, true, false);
	
	q.output();
	w.output();
	e.output();
	r.output();
	
	}
}
