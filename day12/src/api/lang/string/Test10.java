package api.lang.string;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("주민번호를 입력해주세요. ");
		String RRN = sc.next();
		sc.close();
		
		String regex ="\\d{2}([0]\\d|[1][0-2])([0][1-9]|[1-2]\\d|[3][0-1])[-]*[1-4]\\d{6}";
		
	        Pattern p = Pattern.compile(regex);
	        Matcher m = p.matcher(RRN);

	        if (m.find()) {
	            System.out.println("올바른 형식입니다.");
	        } else {
	            System.out.println("올바르지 않은 형식입니다.");
	        }
		
	}
}
