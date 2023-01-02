package input;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		// 목표 : Scanner를 System.in에 결합시켜서 사용
		
		//도구생성
		// 자동 import : ctrl + shift + O
		// new는 우측에 적힌 내용을 새로 만들라는 의미의 연산자
		// sc는 참조변수(리모컨)이며 생성한 입력도구를 사용하기 위한 변수
		
		Scanner sc = new Scanner(System.in); //
		
		System.out.println("숫자 입력하세요");
		int n = sc.nextInt(); 	// int 값 한개 읽어주세요.라는 뜻.
		System.out.println("숫자 :"+n);
		
		System.out.println("숫자입력하소");
		int m = sc.nextInt();
		System.out.println("입력 : "+m);
		
		System.out.println("실수 ㄱ");
		double w = sc.nextDouble();
		System.out.println("입력 : "+w);
		
		// 모든 사용을 마치고 정리.
		sc.close();
		
		
		
	}

}
