package oop.poly2;

public class Warrior extends Adventurer {

	public Warrior(String id, int lv) {
		super(id, lv);
	}

	@Override
	public void str() {
		System.out.println("전사가 칼로 공격합니다!");
	}

	@Override
	public void move() {
		System.out.println("전사가 뛰어서 이동합니다!");
	}

	@Override
	public void shop() {
		System.out.println("전사가 상점을 개설합니다!");
	}

}
