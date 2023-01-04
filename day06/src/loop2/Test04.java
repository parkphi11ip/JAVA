package loop2;

import java.util.Scanner;

public class Test04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int life = 100;
		int cnt = 0;
		
		Scanner sc = new Scanner(System.in);

		while(true) {
			System.out.println("숫자 입력시 숫자 차감 : 10이하의 숫자만 적립이됩니다.");
			int de = sc.nextInt();
			
			if(de<10) {
				
			cnt ++;
			life -= de;
			
			System.out.println("remain life | "+life);
			
			if(life < 0) {
				System.out.println("Game Over");
				break;
			}

			}
		}
		//
		sc.close();
		System.out.println("입력한숫자"+" | "+cnt);
	}
}
