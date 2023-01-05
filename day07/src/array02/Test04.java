package array02;

public class Test04 {

	public static void main(String[] args) {
		
		
		int[]data=new int[] {10,20,30,40,50};
		//data[0]과 data[3]에 있는 데이터를 서로 교체(swap)하고 싶다면
		// -> 자바는 데이터 맞교환이 불가능하다.
		// -> 별도의 임시변수를 추가하여 교체가 가능하다.
		
		int backup = data[0];
		data[0]=data[3];
		data[3]=backup;
		
		for (int i = 0; i < data.length; i++) {
			System.out.println(data[i]);
		}
		System.out.println();
	}

}
