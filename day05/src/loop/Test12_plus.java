package loop;

import java.util.Scanner;

public class Test12_plus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		 Test12
		
		int cnt = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" 몇 단? (9단까지 지원 됩니다.)");
		int n = sc.nextInt();
		
		for(int i=n; i<=9; i++) {
			System.out.println( n+"x"+i+"="+"?");
			System.out.println(" 정답을 입력하세요.");
			int answer = sc.nextInt();
			if(answer==i*n) {
				System.out.println("------------------");
				System.out.println(" 정답 ! ");
				cnt++;
				if (cnt ==2) {
					break;}
			}else {
				System.out.println(" 땡 ㅠ ");
			}
			
	}
		System.out.println("~~~~~~~~~~~~~~~~~~");
		System.out.println(" 정답개수 : "+cnt);
		System.out.println("~~~~~~~~~~~~~~~~~~");
	}
}
