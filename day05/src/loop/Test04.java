package loop;

public class Test04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		# Test04
//
//		다음 요구사항에 맞는 값을 계산하여 출력하세요
//
//		```
//		두 자리 정수 중에서 369 게임을 한다면 박수를 쳐야하는 숫자를 출력
//		```
		
		for(int i=1; i<=100; i++) {
			int ten = i/10;
			int one = i%10;
			boolean hasten = ten == 3 || ten == 6 || ten == 9;
			boolean hasone = ten == 3 || ten == 6 || ten == 9;
			boolean has369 = hasone || hasten;
			if(has369) {
				System.out.println(i);
			}
		
		}
	
	}

}
