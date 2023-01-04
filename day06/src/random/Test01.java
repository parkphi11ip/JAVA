package random;

import java.util.Random;

public class Test01 {

	public static void main(String[] args) {

		// :: random ::		
		// 무슨 값이 나올지 예측 할 수 없는 데이터 상태
		// 프로그램에서 랜덤 값을 생성하는 도구가 존재
		// 확률 구현, 시물레이션... 등을 구현 가능
		// 완전한 랜덤은 구현이 어려움
		// random이라는 도구를 생성하여 랜덤 값을 구현 (유사 랜덤)
		// 도구 ex. Scanner sc = new Scanner(System.in);
		
		Random r = new Random();
		
		int a =r.nextInt();
		System.out.println("a | "+a);
		
		//nextInt(개수)를 사용하면 0부터 해당 개수만큼의 정수 중에서 랜덤으로 반환
		int b=r.nextInt(6);
		System.out.println("b | "+b);

		//r.nextInt(6)+1 -> 1부터 6까지 랜덤
		int dice = r.nextInt(6)+1; // 주사위의 명령어
		System.out.println("dice |"+dice);
		
	}

}
