package oop.test01;

public class Test01 {

	public static void main(String[] args) {

		//카톡 메시지 2개
		// 낱개 데이터가 아니라 미리 만들어준 Message 클래스의 객체를 생성
		Message m1 = new Message();
		
		m1.writer = "박필립";
		m1.content =  "안녕하세요." ;
		m1.time = "오후 3:02";
		m1.remain = 1;
		
		System.out.println(m1.writer); 
		System.out.println(m1.content);
		System.out.println(m1.time);
		System.out.println(m1.remain);
		
		Message m2 = new Message();

		
	}

}
