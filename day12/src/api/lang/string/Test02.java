package api.lang.string;

import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) {
		
		String khId = "khacademy";
		String khPw = "student1234";
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("id를 입력해주세요.");
		String id = sc.next();
		
		System.out.println("pw를 입력해주세요.");
		String pw = sc.next();
		
		if(id.equalsIgnoreCase(khId)&&pw.equals(khPw)){
			System.out.println(" 로그인 성공 ! ");
		}else {
			System.out.println(" 실패 ");
		}
		
		
	}
}
