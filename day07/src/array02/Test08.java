package array02;

public class Test08 {

	public static void main(String[] args) {
		
		//키가 가장 큰 사람의 값과 위치를 출력

		double [] data = new double[] {150.8, 180.2, 175.9, 162.7, 170.3};
		
		//1. 맨 앞 데이터가 가장 크다고 가정
		double max = data[0];
		int rank = 0;

		//2. 뒤의 데이터들(1~4)과 비교
		for(int i=1; i<data.length; i++) {
			if(max < data[i]) {
				rank=i;			// 위치수정 
				max = data[i];	
			}
		}
		
		
		System.out.println("최대값 | " + max);
		System.out.println("최대값 위치 | " + rank);
		System.out.println(data[0]);
		

	}
	

}
