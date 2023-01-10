package oop.inherit3;

public class Whale extends Browser {
//	웨일(Whale) 브라우저
	
//	파파고 번역 기능이 존재해야 한다(papago)
//	네이버 검색 기능이 존재해야 한다(naverSearch)
//	모든 기능들은 실행 시 간단한 텍스트 메세지가 출력되어야 한다
//	예를 들어 페이지 이동 기능을 실행하면 "페이지 이동 기능 실행"이라고 화면에 표시되면 된다
	public void papago() {
		System.out.println("papago.");
	}
	public void naverSearch() {
		System.out.println("Nsearch.");
	}

}
