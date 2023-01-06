package oop.test4;

public class Olimpic {

	//field
	String name;
	String event;
	String div;
	int Gmedal;
	int Smedal;
	int Cmedal;
	

	//method
	//기본형태 : void 이름(준비물){코드}
	//This : 코드가 실행 될 당시의 주인공(=자기 자신 객체, 내꺼)
	void output() {
		System.out.println("");
		System.out.print(this.name+" | ");
		System.out.print(this.event+" | ");
		System.out.print(this.div+" | ");
		System.out.print(this.Gmedal+" | ");
		System.out.print(this.Smedal+" | ");
		System.out.print(this.Cmedal+" | ");
	}
	
	void setting(String name,String event,String div,
			int Gmedal, int Smedal, int Cmedal  ){
		this.name = name;
		this.event = event;
		this.div = div;
		this.Gmedal=Gmedal;
		this.Smedal=Smedal;
		this.Cmedal=Cmedal;
	}
}
