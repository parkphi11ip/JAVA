package oop.constructor1;

//학생 클래스
public class Student {
//	field
	String name;
	int score;

//	constructor - 생성 조건
//	- 반드시 클래스와 같은 이름으로 작성해야 한다
//	- 오버로딩 가능
	Student(String name, int score) {
		this.name = name;
		this.score = score;
	}

//	method
//	void setting(String name, int score) {//설정 기능
//		this.name = name;
//		this.score = score;
//	}
	void output() {
		System.out.println(this.name);
		System.out.println(this.score);
	}
}