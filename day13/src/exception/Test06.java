package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test06 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
	
		//	문제점
		// 1. 개발자는 문제라고 생각하는데, 자바는 문제가 아니라고 생각하는 경우
		// 2. 예외가 여러 종류가 발생하는데 구분할 수 있는 방법이 있을까?
		//

		try {//문제가 발생하리라고 예상되는 지역(플랜 A)
			Scanner sc = new Scanner(System.in);

			System.out.print("금액 : ");
			int money = sc.nextInt();
			if(money<=0) {	// 자바가 감지하지 못하는 예외상황
//				Exception ex = new Exception();
//				throw ex;
				throw new Exception("금액은 음수가 될 수 없습니다.");
			}

			System.out.print("인원 : ");
			int people = sc.nextInt();
			if(people<=0) {	
				throw new Exception("인원은 0이하가 될 수 없습니다.");
			}
			sc.close();

			int result = money / people;
			int remain = money % people;

			System.out.println("1인당 "+result+"원");
			System.out.println("자투리 "+remain+"원");
			
		//예외가 발생하면 반드시 예외 정보가 객체 형태로 전달된다.	
		}catch(Exception e) {	
//			System.err.println("오류 발생");
//			System.out.println(e);
//			System.out.println(e.getClass());
//			System.out.println(e.getMessage());
			if(e.getMessage() != null) {
				System.out.println(e.getMessage());
			}
			else {
				System.out.println("오류가 발생했습니다.");
			}
		}

		//문제점 : 개발자는 원래 발생하던 문제점을 보고싶어함.
		

		
	}
}
