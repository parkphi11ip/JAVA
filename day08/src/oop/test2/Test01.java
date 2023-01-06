package oop.test2;

public class Test01 {

	public static void main(String[] args) {

		Soccer u1 = new Soccer();
		
		u1.name = "킬리안 음바페";
		u1.contry = "프랑스";
		u1.rank = 1;
		u1.goal = 8;
		
		Soccer u2 = new Soccer();
		
		u2.name = "리오넬 메시";
		u2.contry="아르헨티나";
		u2.goal=7;
		u2.rank=2;
		
		Soccer u3 = new Soccer();
		
		u3.contry="프랑스";
		u3.goal = 4;
		u3.name="올리비에 지루";
		u3.rank=3;
		
		Soccer u4 = new Soccer();
		
		u4.name="훌리안 알바레스";
		u4.contry="아르헨티나";
		u4.rank=4;
		u4.goal=4;
		
		System.out.println(u1.name+" | "+u1.goal);
		System.out.println(u2.name+" | "+u2.goal);
		System.out.println(u3.name+" | "+u3.goal);
		System.out.println(u4.name+" | "+u4.goal);
		
		
		
	}

}
