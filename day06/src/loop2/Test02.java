package loop2;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("숫자 입력");
			int n = sc.nextInt();
			
			if(n==0) {	// 0이 입력되었다면 
				break;	// 반복중지
			}
		}
		
		sc.close();
		
	}

}
