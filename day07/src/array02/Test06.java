package array02;

public class Test06 {

	public static void main(String[] args) {

		//데이터를 시계방향으로 2번 이동한 결과를 출력
		// 1회전 : 40 30 50 20 10
		// 2회전 : 10 40 30 50 20
	
		int[]data=new int[] {30,50,20,10,40};

		for(int k=0;k<2;k++) {				//1바퀴회전 2번반복
		// 1바퀴 회전
		int backup = data[data.length-1]; 	// 마지막 데이터
		for(int i=data.length-1; i>0; i--) {// 마지막부터 1까지
			data[i] = data[i-1];
		}
		data[0] = backup;
		}
		
		for(int i=0; i<data.length; i++) {
			System.out.print(data[i]);
			System.out.print(" ");
		}
		System.out.println();
	}

}
