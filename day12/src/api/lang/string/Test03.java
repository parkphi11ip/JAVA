package api.lang.string;

import java.util.Scanner;

public class Test03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("닉네임을 입력하세요.");
		
		String nickname =sc.next();
		
		sc.close();
		
		if(nickname.length()>=2 && nickname.length() <= 10 && !nickname.contains("운영자")) {
			System.out.println(nickname+" 생성되었습니다.");
		}else {
			System.out.println(nickname+" 생성이불가합니다.");
		}
	}
}
