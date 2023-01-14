package api.lang.string;

import java.util.Scanner;

import java.util.regex.Pattern;

public class Test10 {

	public static void main(String[] args) {
		 
		Scanner sc = new Scanner(System.in);
		
		System.out.print("생년월일을 입력하세요 : ");

		String birth = sc.next();

		sc.close();
		
		String regex = "^(19|20)[0~9]{2,2}-(0[0-9]|1[0-2])-(0[0-9]|1[0-9]|2[0-9]|3[0-1])$";
		
		if(Pattern.matches(regex, birth)) {
			System.out.println("생년월일 : " + birth);
		}else {
			System.out.println("올바른 형식이 아닙니다.");
		}
	}
}


		  

