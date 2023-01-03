package loop;

public class Test03 {

	public static void main(String[] args) {

		//반복
		// q. hello를 10번 출력하세요
		
		// for(i라는 공이 1개 들어가있다; 10개이하면 실행; 1개씩 증가)
		// for(선언부; 조건부; 증감부)
//		for(int i=1; i<= 10; i++) {
//			System.out.println("hello");	
//		}
		
		// 1부터 10까지 화면에 출력 1,2,3,,,4,,,,7,,10
		//	반복을 위해 만든 변수를 반목문 내에서 사용할 수 있다.
//		for(int i=0; i<10; i++) {
//			System.out.println(i);	
//		}
		
		
		//q1.1부터 100까지 출력
		for(int i=1; i<=100; i++) {
			System.out.println("q1 : "+i);	
		}
		
		//q2.1부터 100까지 홀수를 출력
//		for(int i=1; i<=100; i+=2) {
//			System.out.println("문제2 : "+i);	
//		}
		for(int i=1; i<=100; i++) {
			if(i%2!=0) {System.out.println("q2 : "+i);	
			}
		}
		
		
		//q3.1부터 100까지 5의 배수를 출력
//		for(int i=1; i<=20; i++) {
//			System.out.println(i*5);	
//		}
		for(int i=1; i<=100; i++) {
			if(i%5==0) {
				System.out.println("q3 : "+i);
			}
		}
		
		//q4. 10부터 1까지 화면에 출력
		for(int i=10; i>=1; i--) {
			System.out.println("q4 : "+i);
		}
		
		
		
	}
}
