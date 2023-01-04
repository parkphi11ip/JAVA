package random;

import java.util.Random;

public class Test04 {

	public static void main(String[] args) {
//		# Test04
//
//		홈페이지에 경품 추첨 화면을 구현하려고 합니다
//
//		경품 추첨 확률은 다음과 같습니다
//
//		- 강남 아파트 : 1%
//		- 테슬라 : 3%
//		- 다음 기회에 : 96%
//
//		실행하면 확률에 따라 추첨 결과가 나오는 프로그램을 구현
		Random r = new Random();
		
		int giveaway = r.nextInt(100)+1;
		
		if(giveaway==1) {
		System.out.println("giveaway | 강남아파트");
		}
		if(giveaway==2&&giveaway==3&&giveaway==4) {
			System.out.println("giveaway | 테슬라 model S");
		}
		else {
			System.out.println("     Next chace.");
			System.out.println("--------------------");
		}
		System.out.println("giveaway number | "+giveaway);
		
		
	}
}
