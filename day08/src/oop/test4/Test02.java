package oop.test4;

public class Test02 {

	public static void main(String[] args) {

		Olimpic p1 = new Olimpic();
		Olimpic p2 = new Olimpic();
		Olimpic p3 = new Olimpic();
		
		p1.setting("진종오", "사격", "하계", 4, 2, 0);
		p2.setting("김수녕", "양궁", "하계", 4, 1, 1);
		p3.setting("전이경", "쇼트", "동계", 4, 0, 1);
		
		p1.output(); //r1을 주인공으로 해서 output의 코드를 실행해라.
		p2.output();
		p3.output();
		
		
	}

}
