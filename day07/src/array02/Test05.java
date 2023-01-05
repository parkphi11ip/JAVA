package array02;

public class Test05 {

	public static void main(String[] args) {
		
//		//# Test05
//
//30, 50, 20, 10, 40을 배열에 저장한 뒤 
//모든 데이터의 순서를 거꾸로 뒤집어서 재배치하고 출력
//
//- 최초 : 30, 50, 20, 10, 40
//- 변경 : 40, 10, 20, 50, 30
		
		
		
		int[]data=new int[] {30,50,20,10,40};
		
		//보여주기식 방법. 좋지않은 방법
		for (int i = data.length - 1; i >= 0 ; i--) {
            System.out.println(data[i]);
        }
   
		System.out.println();
		
		for (int i = 0; i < data.length; i++) {
			System.out.println(data[i]);
		}
		System.out.println();

	}

}
