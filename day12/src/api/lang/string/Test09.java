package api.lang.string;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test09 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println(" 전화번호를 입력해주세요. ");
		String number = sc.next();
		
//		System.out.println(number.charAt(0));
//		System.out.println(number.charAt(1));
//		System.out.println(number.charAt(2));
		
		String pattern ="^01(?:0|1|[6-9])-(?:\\d{3}|\\d{4})-\\d{4}$";
	        Pattern p = Pattern.compile(pattern);
	        Matcher m = p.matcher(number);

	        if (m.find()) {
	            System.out.println("올바른 형식입니다.");
	        } else {
	            System.out.println("올바르지 않은 형식입니다.");
	        }
		
		
		
	}
}
