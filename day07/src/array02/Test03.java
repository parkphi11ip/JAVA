package array02;

import java.util.Random;

public class Test03 {

	public static void main(String[] args) {

		int[]data=new int[] {10,20,30,40,50};
		
		for (int i = 0; i < data.length; i++) {
			System.out.println(data[i]);
		}
		System.out.println();
		
		//ex : 무작위로 데이터 1개를 출력
		Random r = new Random();
		
		int index = r.nextInt(data.length);
		int choice = data[index];
		
		System.out.println(choice);
		
		
	}

}
