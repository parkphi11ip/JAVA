package oop.test1;

// java (JVM)에게 메세지란 이렇게 생겼다라고 알려주기 위해 만든 영역
// 메시지 = 작성자 string + 내용 string + 전송시각 string + 안읽은사람수 int
public class Message {

	// 멤버 필드 : 클래스를 구성하는 세부 데이터를 저장하는 변수.
	
	String writer; // 메시지에는 작성자 O 
	String content; // 메시지에는 내용 O
	String time; // 메시지에는 전송시각 O
	int remain; // 메시지에는 안읽은 사람수 O
	
	
}
