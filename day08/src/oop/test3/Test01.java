package oop.test3;

public class Test01 {

	public static void main(String[] args) {

		PokectMonster a1 = new PokectMonster();
		PokectMonster a2 = new PokectMonster();
		PokectMonster a3 = new PokectMonster();
		PokectMonster a4 = new PokectMonster();
		
		a1.num = 1;
		a1.name = "이상해씨";
		a1.elem = "풀 독";
		
		a2.num = 4;
		a2.name = "파이리";
		a2.elem = "불꽃";
		
		a3.num = 7;
		a3.name = "꼬부기";
		a3.elem = "물";
		
		a4.num = 25;
		a4.name = "피카츄";
		a4.elem = "전기";
		
		System.out.print(a1.name+" | ");
		System.out.print(a2.name+" | ");
		System.out.print(a3.name+" | ");
		System.out.print(a4.name+" | ");
		
		
		
		
	}

}
