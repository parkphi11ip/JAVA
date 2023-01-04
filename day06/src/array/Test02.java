package array;

public class Test02 {

	public static void main(String[] args) {

		// 배열생성 
		int[] data=new int[5]; //new -> 창조형
		// data ------> [0][0][0][0][0]
		
		data[0]=10;
		data[1]=20;
		data[2]=30;
		data[3]=40;
		data[4]=50;
		
		//System.out.println(data);	//리모컨출력 (의미없음)
		System.out.println(data[0]);//시작점 +0칸
		System.out.println(data[1]);//시작점 +1칸
		System.out.println(data[2]);
		System.out.println(data[3]);
		System.out.println(data[4]);
		//System.out.println(data[5]); //error
		
		int total = data[0]+data[1]+data[2]+data[3]+data[4];
		
		System.out.println(total);
		
		
	}

}
