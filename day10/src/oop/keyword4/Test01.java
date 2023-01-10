package oop.keyword4;

public class Test01 {

	public static void main(String[] args) {
		
		// static 필드, 메소드는 객체 없이 호출 할 수 있음.
		System.out.println(Galaxy.getCompany());
		
		Galaxy.setCompany("화웨이"); // ****static의 좋은점 : 객체가 필요없이 일괄 관리가 됨.

		Galaxy g1= new Galaxy("010-1212-2444", "블랙");
		Galaxy g2= new Galaxy("010-5412-2144", "랙");
		Galaxy g3= new Galaxy("010-8216-2564", "블");
				
		g1.output();
		g2.output();
		g3.output();
		
	//	g1.setCompany("애플"); //잘못된 접근방법
		
		
		
	}
}
