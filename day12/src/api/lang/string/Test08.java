package api.lang.string;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test08 {
   
	public static void main(String[] args) {
        
		Scanner sc = new Scanner(System.in);

        System.out.print("아이디를 입력하세요 : ");
        String id = sc.nextLine();

        String pattern = "^[a-z][a-z0-9_]{7,19}$";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(id);

        if (m.find()) {
            System.out.println("올바른 형식입니다.");
        } else {
            System.out.println("올바르지 않은 형식입니다.");
        }
    }
}
