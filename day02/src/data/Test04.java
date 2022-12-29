package data;
import java.lang.*;
public class Test04 {

	public static void main(String[] args) {
		//입력 -----------------------------------
		int adultPrice = 16000; 
		int teenPrice = 10000;
		int adultCount = 2;
		int teenCount =3;
		//처리 -----------------------------------
		int adultTotal = adultCount * adultPrice;
		int teenTotal = teenCount * teenPrice;
		
		int total = adultTotal + teenTotal;
	
		// int xxx 라는 정수 저장변수를 만들어서 xxx을 저장.
		
		//출력 -----------------------------------
		System.out.println(adultTotal);
		System.out.println(total);

		
		
		
		
	}

}
