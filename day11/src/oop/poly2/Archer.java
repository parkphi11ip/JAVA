package oop.poly2;

public class Archer extends Adventurer {

	public Archer(String id, int lv) {
		super(id, lv);
	}

	@Override
	public void str() {
		System.out.println("궁수가 활로 공격합니다.");
	}

	@Override
	public void move() {
		System.out.println("궁수가 숨어서 이동합니다.");
	}

	@Override
	public void shop() {
		System.out.println("궁수가 상점을 개설합니다.");
	}

}
