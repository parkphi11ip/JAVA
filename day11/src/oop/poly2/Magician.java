package oop.poly2;

public class Magician extends Adventurer {

	public Magician(String id, int lv) {
		super(id, lv);
	}

	@Override
	public void str() {
		System.out.println("마법사가 마법으로 공격합니다.");
	}

	@Override
	public void move() {
		System.out.println("마법사가 텔레포트로 이동합니다");
	}

	@Override
	public void shop() {
		System.out.println("마법사가 상점을 개설합니다.");
	}

}
