package array2d;

import java.util.Random;

public class Test06 {

	public static void main(String[] args) {
		
//		# Test06
//
//		지뢰찾기 만들기
//
//		지뢰찾기를 다음 요구사항에 맞게 구현
//
//		1. 9x9 배열을 준비(초급자)
//		2. 랜덤으로 10개의 폭탄을 지도에 배치(폭탄은 숫자 9로 설정)
//		3. 지도 출력
//		4. 폭탄이 아닌 칸의 숫자를 계산
//		5. 최종 지도 출력

		int size = 4;
		int[][] bomb = new int[size][size];
		//String.valueOf(9);


		Random r = new Random();
		for(int i=1; i <= 10; i++) {
			int row = r.nextInt(size);
			int col = r.nextInt(size);
			if(bomb[row][col]==0) {
			bomb[row][col] = 9;
		}else {
			i--;
		}
	}
		for(int i=0; i < size; i++) {
			for(int k=0; k < size; k++) {
				System.out.print(bomb[i][k]);
				System.out.print("  ");
			}
			System.out.println();
			System.out.println();
		
		}

	}

}
