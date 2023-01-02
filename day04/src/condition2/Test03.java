package condition2;

public class Test03 {

	public static void main(String[] args) {

//		# 다중 조건
//
//		# Test03
//
//		지하철 이용요금 계산기
//
//		지하철은 나이에 따라 요금을 다음과 같이 다르게 받습니다
//
//		- 어르신(65세~) - 무료
//		- 성인(20세~64세) - 1250원
//		- 청소년(14세~19세) - 720원
//		- 어린이(8세~13세) - 450원
//		- 영유아(~7세) - 무료
//
//		카드 보증금이 500원일 때, 출생년도 4자리에 따라 지하철 이용요금을 구하여 출력
		
		int birthn = 2010;
		int deposit = 500;
		
		int age = 2023 - birthn + 1;
		
		int fare;
		
		if(age >= 65 || age <= 7) {
			fare = 0;
		}
		else if(age >= 20 && age <= 64) {
			fare = 1250;
		}
		else if(age >= 14 && age <= 19) { 
			fare = 750;
		}
		else {
			fare = 450;
		}
		
		System.out.println(age+"세.");
		System.out.println(fare+deposit+ "원입니다.");
		
		
		
	}

}
