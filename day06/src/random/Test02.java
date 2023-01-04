package random;

import java.util.Random;

public class Test02 {

	public static void main(String[] args) {
//		# Random
//		
//		# Test02
//		다음에서 요구하는 랜덤값을 구하여 출력
//		1. 로또 번호 1개 (1부터 45 사이의 정수)
//		2. 두 자리 정수 중 1개
//		3. OTP 번호 1개 (6자리)
//		4. 동전을 던진 결과 출력(앞 또는 뒤)
//		5. 윷놀이 한 턴 결과 출력(도/개/걸/윷/모/빽도)

		Random r = new Random();
		System.out.println();
		
		//1
		
		int lotto = r.nextInt(45)+1; 
		System.out.println("lotto | "+lotto);
		System.out.println();
		//2
		
		int integel = r.nextInt(99)-99; 
		System.out.println("integel | "+integel);
		System.out.println();
		
		//3
		
		int cnt=0;
		for(int i=0;i<=6;){
		int otp = r.nextInt(9); 
		System.out.print(otp);
		cnt++;
		
		if(cnt==6) {
			System.out.println(" | otp");
			break;
			}
		}System.out.println();
		
		//4
		
		int coinflip = r.nextInt(2)-1; 
		if(coinflip==-1) {
		System.out.println("coinflip | 앞");
		}else {
			System.out.println("coinflip | 뒤");
		}System.out.println();
		
		//5
		
		int yut = r.nextInt(6)+1;
		if(yut==1) {
		System.out.println("yut | 도");
		}if(yut==2) {
			System.out.println("yut | 개");
		}if(yut==3) {
			System.out.println("yut | 걸");
		}if(yut==4) {
			System.out.println("yut | 윷");
		}if(yut==5) {
			System.out.println("yut | 모");
		}if(yut==6) {
			System.out.println("yut | 빽도");
		}
			
		
		
	}

}
