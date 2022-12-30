package data02;

public class Test03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//목표 : 청소년 여부를 판정하는 프로그램
		//  중1(14) ~ 고3(19)까지 청소년이라고 보겠다.
		
		//
		int age = 14;
		
		//
//		boolean tean = 14 <= age <= 19; // 파이썬에서는 가능하고, 자바에서는 불가능
		boolean teen = 14 <= age && age <= 19;
		
		System.out.println(teen);
	}

}
