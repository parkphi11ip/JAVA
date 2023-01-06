package array2d;

import java.util.Random;

public class Test05 {

	public static void main(String[] args) {

		int[][] data = new int[][] {
		{1,2,3,4,5},
		{6,7,8,9,10},
		{11,12,13,14,15},
		{16,17,18,19,20},
		{21,22,23,24,25}};
		
		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data[i].length; j++) {
				System.out.print(data[i][j]);
				System.out.print("\t");
			}
		System.out.println();
		}
		
		Random r = new Random();
		
		int arrRdm1 = r.nextInt(data.length);
		int arrRdm2 = r.nextInt(data[0].length);

		int bingo = data[arrRdm1][arrRdm2]; 
		System.out.println("bingo ! = " + bingo);
		}
	}
