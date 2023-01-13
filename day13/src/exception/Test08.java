package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test08 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
	
		// 문제점 :
		// 스캐너가 어떨땐 닫히고 어떨떈 안닫침.
		
		// 원인 :
		// 예외 발생 여부에 따라 close()가 실행이 될 수도 안될수도 있어서
		Scanner sc = new Scanner(System.in);

		try {//문제가 발생하리라고 예상되는 지역(플랜 A)

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

			int result = money / people;
			int remain = money % people;

			System.out.println("1인당 "+result+"원");
			System.out.println("자투리 "+remain+"원");
			
		//예외가 발생하면 반드시 예외 정보가 객체 형태로 전달된다.	
		}catch(Exception e) {	
			e.printStackTrace();
			
		}
		finally { //예외 여부와 관계없이 무조건 실행되는 구문.
			sc.close();
		}

		
		
	}
}
