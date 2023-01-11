package oop.poly2;

import java.util.Scanner;

public class Test01 {

	@SuppressWarnings("resource")
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" < 캐릭터를 선택 하십시오.>");
		System.out.println();
		System.out.println("      1 : 전사");
		System.out.println("      2 : 마법사");
		System.out.println("      3 : 궁수");
		
		Adventurer a = new Warrior("전사최고112", 1);
		Adventurer b = new Magician("나는야블랙마법사", 1);
		Adventurer c = new Archer("레골라스", 1);
		
		String m = sc.next();
		switch(m) {
		case "1":
			System.out.println("  전사가 생성되었습니다. ");
			a.choose();
			String n1 = sc.next();
			switch(n1) {
			case "1":
				a.str();
				return; 
			case "2":
				a.move();;
				return;
			case "3":
				a.shop();
				return;
			case "4":
				a.info();
				return; 
			}
		case "2":
			System.out.println("  마법사가 생성되었습니다. ");
			b.choose();
			String n2 = sc.next();
			switch(n2) {
			case "1":
				b.str();
				return; 
			case "2":
				b.move();;
				return;
			case "3":
				b.shop();
				return;
			case "4":
				b.info();
				return; 
			}
		case "3":
			System.out.println("  궁수가 생성되었습니다. ");
			c.choose();
			String n3 = sc.next();
			switch(n3) {
			case "1":
				c.str();
				return; 
			case "2":
				c.move();;
				return;
			case "3":
				c.shop();
				return;
			case "4":
				c.info();
				return; 
			}
		default :
			System.out.println("  숫자를 똑바로 입력해주세요.  ");
			break;
		}	
		sc.close();
		
			
	}
}
