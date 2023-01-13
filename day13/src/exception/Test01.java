package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
	
		//문제가 되는 상황
		//1. 실수 입력 시 java.util.InputMismatchException 발생
		//2. 한글 입력 시 java.util.InputMismatchException 발생
		//3. 영어 입력 시 java.util.InputMismatchException 발생
		//4. 인원이 0일 경우 java.lang.ArithmeticException 발생
		//5. 너무 큰 숫자 입력 시 java.util.InputMismatchException 발생
		//결론적으로 이 프로그램에서 파악한 문제는 2종류이다.
		//- 1, 2, 3, 5는 입력이 잘못된 경우
		//- 4번은 나눗셈이 잘못된 경우

		try {//문제가 발생하리라고 예상되는 지역(플랜 A)
			Scanner sc = new Scanner(System.in);

			System.out.print("금액 : ");
			int money = sc.nextInt();

			System.out.print("인원 : ");
			int people = sc.nextInt();

			sc.close();

			int result = money / people;
			int remain = money % people;

			System.out.println("1인당 "+result+"원");
			System.out.println("자투리 "+remain+"원");
			
			// 문제점
			// - 오류가 정말 2개만 발생할까?
			// - 장담할 수 없기에 "통합 처리"하는 방향으로 변경
			
//		}catch(InputMismatchException e) {//입력이 잘못되었을때의 플랜B
//		}catch(RuntimeException e) {
//		}catch(Exception e) {	//신경안쓰고 싶을때 쓰는 예외처리 메소드
		}catch(Throwable e) {	//보편적인 예외처리 메소드
			System.err.println("오류 발생");
		}
//		catch(ArithmeticException e) {//나누기가 잘못되었을때의 플랜B
//			System.err.println("인원수는 0일 수 없습니다");
//		}

		

		
	}
}
