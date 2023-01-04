package random;

import java.util.Random;
import java.util.Scanner;

public class Test05 {

	public static void main(String[] args) {
//		# Test05
//
//		랜덤으로 10개의 구구단 문제를 출제하고, 사용자가 이를 풀 수 있도록 구현하세요
		
		Scanner sc = new Scanner(System.in);

		Random r = new Random();
		
				
		for(int i=2; i<=99; i++ ) {
			
			int danRandom = r.nextInt(99)+2;
			int danRandom2 = r.nextInt(99)+2;
			
			System.out.println("Please enter a valid number.");
			System.out.print(danRandom+" x "+danRandom2+" = ");
			
			int answer = sc.nextInt();
			
			if(danRandom*danRandom2==answer){
				System.out.println("Right answer. ");
				System.out.println("-----------------------------");
			}else {
				System.out.println("Wrong answer. ");
				System.out.println("Please enter the correct answer.");
				System.out.println("-----------------------------");
			}
	
		}
		sc.close();
	}

}
