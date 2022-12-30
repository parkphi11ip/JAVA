package data02;

import java.time.Year;

public class Test02 {

	public static void main(String[] args) {

		// 2000년생의 성인여부를 판정하여 출력 
		// 사용자의 출생년도 4자리를 이용.
		
		int bth = 2004;
		int nowY = Year.now().getValue();
		
		int age = nowY - bth + 1;
				
		boolean old = age >= 20;
		
		System.out.println(nowY);
		
		if(old){
			System.out.println(age+"세이므로 그는 성인이다.");
			
		}else {
			System.out.println(age+"세이므로 그는 미성년자이다.");
		}
		
		
	}
	
}
//		System.out.println(howold+"세");
		
