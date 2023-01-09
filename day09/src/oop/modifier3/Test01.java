package oop.modifier3;

public class Test01 {
	public static void main(String[] args) {
		Academy s1 = new Academy("자바 마스터과정", 90, 1000000, "온라인");
		Academy s2 = new Academy("파이썬 기초", 60, 600000, "혼합");
		Academy s3 = new Academy("웹 개발자 단기완성", 120, 1200000, "오프라인");

		s1.output();
		s2.output();
		s3.output();
	}
}