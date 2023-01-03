package loop;

public class Test06 {

	public static void main(String[] args) {

		//q1. 1부터 100사이의 짝수 개수는?
		
//		int cnt = 0;
//		
//		for( int i=1; i<=100; i++) {
//			if(i%2==0) {
//				System.out.println(i);
//				cnt++;
//			}
//		}
//		System.out.println(cnt);
		//q2. 1부터 100까지의 합계는?
		
		int total=0;
		
		for(int i =1; i<=100; i++) {
			total+=1; System.out.println(i);
		}
		System.out.println(total);
	}

}
