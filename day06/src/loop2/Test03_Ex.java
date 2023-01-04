package loop2;

import java.util.Scanner;

public class Test03_Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int nindex = 0;
		int total = 0;
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("숫자 입력");
			int n = sc.nextInt();
			
			 if(n==-1) {	
				break; 	
			}
			 else{
				 total += n;
				 nindex++;
			}
		}
	
		sc.close();
		int average = total/nindex;
		System.out.println(average+" | "+total);
		
	}

}
