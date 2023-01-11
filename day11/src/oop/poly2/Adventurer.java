package oop.poly2;

public abstract class Adventurer {

	private String id;
	private int lv;
	

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getLv() {
		return lv;
	}

	public void setLv(int lv) {
		this.lv = lv;
	}

	public Adventurer(String id, int lv) {	
		this.id = id;
		this.lv = lv;
	}
	
	public void info() {
		System.out.print("캐릭터 정보 | ");
		System.out.println("ID : "+id+" level : "+lv);
		System.out.println();
	}
	public void choose() {
		System.out.println();
		System.out.println("      1 : 공격");
		System.out.println("      2 : 이동");
		System.out.println("      3 : 상점개설");
		System.out.println("      4 : 캐릭터정보");
		System.out.println();
	}
	
	public abstract void str();
	public abstract void move();
	public abstract void shop();
	
		
	
	
	
}
