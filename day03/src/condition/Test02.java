package condition;

public class Test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//어떤 숫자가 홀수, 짝수 판정 후에 출력.
		
		// 홀짝 판정 프로그램

		// 입력
		int n = 1;

		//계산
		boolean odd = n % 2 != 0;
		boolean even = n % 2 == 0;

		//출력
		//System.out.println(n);
		if (odd) {
			System.out.println("홀수입니다");
		}
		//if (even) {
		if (!odd) {
			System.out.println("짝수입니다");
		}

	}
	
}


