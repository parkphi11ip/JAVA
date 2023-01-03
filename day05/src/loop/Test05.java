package loop;

import java.util.Scanner;

public class Test05 {

	public static void main(String[] args) {

//		# Test05
//
//		다음 요구사항에 맞게 프로그래밍 하세요
//
//		- 사용자에게 `분`, `초`를 입력받는다
//		- 입력받은 시간부터 0분 0초까지 반복적으로 1초씩 감소하도록 출력
//		- 모든 출력을 마치고 `시간이 다 되었습니다` 출력
//
//		```
//		분 입력 : 2
//		초 입력 : 30
//		2분 30초 후 알람이 울립니다
//		2분 29초 후 알람이 울립니다
//		2분 28초 후 알람이 울립니다
//		...
//		0분 2초 후 알람이 울립니다
//		0분 1초 후 알람이 울립니다
//		시간이 다 되었습니다!
//		```
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("분, 초를 입력하세요");
		int min = sc.nextInt();
		int sec = sc.nextInt();
		
		sc.close();
		
		int time = min*60+sec;
		
		for(int i = time; i>0; i--) {
			int min2 = i/60;
			int sec2 = i%60;
			System.out.println(min2+"분 "+sec2+"초 후 알람이 울립니다.");
		}
		
	}

}
