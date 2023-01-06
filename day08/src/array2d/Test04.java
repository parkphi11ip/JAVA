package array2d;

import java.util.Random;
import java.util.Scanner;

public class Test04 {

	public static void main(String[] args) {
		
		int cnt = 0;
		int total =0;
		
		int[][] data = new int[][] {
			{90, 80, 85,77},
			{60, 85, 73,92},
			{50, 70, 70,80}
		};
		
		
		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data[i].length; j++) {
				System.out.print(data[i][j]);
				System.out.print("\t");
				total += data[i][j]; 
				cnt++;
				}
			System.out.println();
		}
			
		System.out.println("모든 데이터 평균 | "+total/cnt);
		
		//랜덤으로 값 1개를 배열 중에서 출력

		Random r = new Random();
	
		int arrRdm1 = r.nextInt(data.length);
		int arrRdm2 = r.nextInt(data[0].length);

		int choice = data[arrRdm1][arrRdm2]; 
		System.out.println("choice = " + choice);
		
		
	}
	
}
