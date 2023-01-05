package array02;

import java.util.Scanner;

public class Test02_Ex {

	public static void main(String[] args) {

		//사용자에게 이름 5개를 입력받아서 배열 저장하고 출력하는 프로그램을 구현
		
		Scanner sc = new Scanner(System.in);

		System.out.println("이름 5개 입력");
		String user1=sc.next();
		String user2=sc.next();
		String user3=sc.next();
		String user4=sc.next();
		String user5=sc.next();
		
		sc.close();
		
		String[] name = new String[] {user1,user2,user3,user4,user5};
		
		for (int i = 0; i < name.length; i++) {
			System.out.println(name[i]);
		}
	}

}
