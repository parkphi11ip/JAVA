package api.lang.string;

import java.util.Scanner;

public class Test07_chatGPT {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

	    System.out.print("이름을 입력하세요: ");
        String name = sc.nextLine();
        
        String regex = "^[가-힣]{2,7}$";
        
        if (!name.matches(regex)) {
	        System.out.println("잘못된 이름입니다. 한글 2~7글자만 입력 가능합니다.");
	    }else{
	    	System.out.println("이름이 설정되었습니다: " + name);
	    }
        
        
        
	}
}