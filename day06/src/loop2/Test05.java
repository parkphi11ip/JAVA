package loop2;

import java.util.Scanner;

public class Test05 {

	public static void main(String[] args) {
		
		// do ~ while 반복(사용하지 않음)
		// 1. 사람들이 사용하지 않음.
		// 2. 구문이 어려움 (격식을 많이 갖춰야 함)
		
		// ex : 사람들에게 점수를 입력받는 예제 0~100
		
		Scanner sc = new Scanner(System.in);

		int score;
		
		do {
			System.out.println("점수입력");
			score=sc.nextInt();
		}
		while(!(score>=0&&score<=100));
			
		
		
		sc.close();
	}

}
