package exception;

import java.util.Scanner;

public class Test04 {

	public static void main(String[] args) {
		
	try {	
		Scanner sc = new Scanner(System.in);

		System.out.println( "년도를 입력해주세요.");
		String y = sc.next();
		System.out.println( "월을 입력해주세요.");
		String m = sc.next();
		System.out.println( "일을 입력해주세요.");
		String d = sc.next();
				
		int intValueY = Integer.parseInt(y);
		int intValueM = Integer.parseInt(m);
		int intValueD = Integer.parseInt(d);
		
		System.out.println(intValueY+"-"+intValueM+"-"+intValueD);
	}
	catch(Throwable e) {	//보편적인 예외처리
		System.err.println("오류 발생 : 잘못된 날짜 입력으로 계산이 불가합니다.");
	}
				
		
		
		
		
		
	}
}
