package loop;

import java.util.Scanner;

public class Test11 {

	public static void main(String[] args) {

		// 5개 입력 후 평균을 출력

		int total=0;
		
		Scanner sc = new Scanner(System.in);

		for(int i=1; i < 6; i++) {
			System.out.println("정수 입력");
			double n = sc.nextDouble();
			total += n;
			double average = total/i;
			System.out.println("평균 | "+average);
		}

		sc.close();
		
		
		
		
		
	}

}
