package loop;

import java.util.Scanner;

public class Test12_plus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		 Test12
		
		int cnt = 0; 										//cnt 카운터 변수 지정. 
		
		Scanner sc = new Scanner(System.in); 
		
		System.out.println(" 몇 단? (9단까지 지원 됩니다.)");
		int n = sc.nextInt(); 								// 인풋변수 지정. 
		
		for(int i=n; i<=100; i++) { 							// n = 인풋 변수 몇단부터 시작인가 지정. 
			System.out.println( n+"x"+i+"="+"?");
			System.out.println(" 정답을 입력하세요.");
			int answer = sc.nextInt(); 						// 인풋변수 지정 .
			if(answer==i*n) { 								// 지정한 인풋변수랑 연결 i*n for 반복문의 답
				System.out.println("------------------");
				System.out.println(" 정답 ! ");
				cnt++; 										// cnt 변수 : if문 충족시에 1씩 저장.
				if (cnt ==2) {
					break;} 								// cnt 변수 : 윗 if문 충족시 1씩저장. 2가 될시에 break를 통해 반복문 끝.
			}else { 										// 답 틀렸을시에 실행됨. 
				System.out.println(" 땡 ㅠ ");
			}
			
	}														//  반복문의 중요한 로
		System.out.println("~~~~~~~~~~~~~~~~~~");
		System.out.println(" 정답개수 : "+cnt);
		System.out.println("~~~~~~~~~~~~~~~~~~");
	}
}
