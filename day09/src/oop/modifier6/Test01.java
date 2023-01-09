package oop.modifier6;

public class Test01 {

	public static void main(String[] args) {

		NCS q = new NCS("피카츄", "응용sw기초기술활용", 50,60);
		NCS w = new NCS("라이츄", "응용sw기초기술활용", 40,80);
		NCS e = new NCS("파이리", "프로그래밍언어활용", 60,65);
		
		//q.setScore(60);
		
		q.output();
		w.output();
		e.output();
		
	}

}
