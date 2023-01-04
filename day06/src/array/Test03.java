package array;

public class Test03 {

	public static void main(String[] args) {

//		# Test03
//
//		다음 데이터를 저장하고, 문제에서 요구하는 내용을 구현하세요
//
//		- 데이터 : 33, 45, 31, 54, 67, 36, 39
//
//		요구사항
//
//		1. 모든 데이터 출력
//		2. 짝수 데이터 출력
//		3. 50이 넘는 데이터 개수 출력
//		4. 모든 데이터 합계 출력
//		5. 모든 데이터 평균 출력
		
		int total = 0;
		int cnt=0;
		
		int[] data=new int[] {33,45,31,54,67,36,39}; 
		//int[] data= {31,45,31,54,67,36,39}; 
		

		for(int i=0;i<data.length;i++) {
			System.out.println("1. 일반 데이터 | "+data[i]);
			total+=data[i];
			if(data[i]%2==0) {
				System.out.println("2. 짝수 데이터 | "+data[i]); 						
			}			
		}
		for(int i=0;i<data.length;i++) {
			if(data[i]>50) {
				cnt++;
				}
		}
		System.out.println("3. 50이 넘는 데이터 갯수 | "+cnt);
		System.out.println("4. total | "+total);
		System.out.println("5. average |"+(double)total/data.length);		

	}

}
