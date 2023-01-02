package input;

import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		// 목표 : 입력을 이용한 나이계산 문제
		
		//
		Scanner sc = new Scanner(System.in);
		System.out.println("출생년도 4자리 입력하시오");
		int birth = sc.nextInt();
		sc.close();
		
		//
		int age = 2023 - birth +1;
		
		//
		System.out.println("당신의 나이는 " + age + "세 입니다.");
		
		

		
	}

}
