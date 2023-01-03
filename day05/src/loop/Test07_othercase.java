package loop;

import java.util.Scanner;

public class Test07_othercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("기간(일) 입력");
		int period = sc.nextInt();

		System.out.println("첫날 개수 입력");
		int pushup = sc.nextInt();

		System.out.println("증가 개수 입력");
		int increase = sc.nextInt();

		sc.close();

		int total = 0;

		for(int day=1; day<=period; day++) {
			System.out.println(day+"일차 - "+pushup+"개");
			total += pushup;
			pushup += increase;
		}

		System.out.println("총 개수 : " + total);

	}
	

}
