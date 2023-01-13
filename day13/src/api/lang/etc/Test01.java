package api.lang.etc;

import java.util.Random;

public class Test01 {
	public static void main(String[] args) {
		
		//Math 클래스
		// 생성자 없음 (아예 생성이 불가/ 미리 생성 해두었거나 대행해주는 경우)
		// 이 클래스는 모든 필드와 메소드가 static이므로 첫 번째 경우라 볼 수 있다.
		// 아무데서나 편하게 부를 수 있는 일회용 계산 클래스
		
		// Math a = new Math;
		
		System.out.println(Math.PI);
		System.out.println(Math.E);
		
		System.out.println(Math.round(1.5));
		System.out.println(Math.floor(1.5));
		System.out.println(Math.ceil(1.1));
		
		Random r = new Random();
		int a = r.nextInt(6)+1;
		int b = r.nextInt(6)+1;
		
		System.out.println("a="+a+",b="+b);
		
		
	}
}
