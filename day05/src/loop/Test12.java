package loop;

import java.util.Scanner;

public class Test12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		 Test12
//
//		 사용자가 원하는 구구단을 출력하는 프로그램을 구현하세요
//
//		 (+추가) 다 만드셨다면 정답 부분을 사용자가 입력하게 만들어 정답/오답 판정이 가능하게 하세요
//
//		 ```java
//		 //괄호 친 부분은 사용자가 입력하는 부분입니다
//		 원하는 구구단 : (5)
//		 5 x 1 = (5)
//		 정답!
//		 5 x 2 = (9)
//		 오답!
//		 ...
//		 5 x 9 = (45)
//		 정답!
//		 정답 개수 : 2
//		 ```
		Scanner sc = new Scanner(System.in);

			System.out.println("뭔 숫자?");
			int y=sc.nextInt(); // left
			System.out.println("몇단까지?");
			int x=sc.nextInt(); // 몇단 까지
			
		
		
		for(int z=1; z<=x; z++) {
			for(int j=y; j<=15; z++) {
				System.out.println(j+" x "+z+" = "+z*j);
				if(z==x){
				      break; 
			} 
		} 
		
		}
		
	}

}