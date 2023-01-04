package array;

public class Test02_3 {

	public static void main(String[] args) {

		// 배열생성 //new -> 창조형
//		int[] data=new int[5]; 
		// data ------> [0][0][0][0][0]
		
		int[] data=new int[] {10,20,30,40,50}; 
		// data ------> [10][20][30][40][50]
					//	<----data.length---->
		
		System.out.println(data.length);
		
		//data = 10; //error
//		data[0]=10;
//		data[1]=20;
//		data[2]=30;
//		data[3]=40;
//		data[4]=50;
		
		//System.out.println(data);	//리모컨출력 (의미없음)
		
		for(int i=0;i<data.length;i++) {
			System.out.println(data[i]);
		}
		
//		System.out.println(data[0]);//시작점 +0칸
//		System.out.println(data[1]);//시작점 +1칸
//		System.out.println(data[2]);
//		System.out.println(data[3]);
//		System.out.println(data[4]);
		//System.out.println(data[5]); //error
		
//		int total = data[0]+data[1]+data[2]+data[3]+data[4];
		int total = 0;
		for(int i=0;i<data.length;i++) {
			total+=data[i];
		}
		
//		total+=data[0];
//		total+=data[1];
//		total+=data[2];
//		total+=data[3];
//		total+=data[4];
		
		System.out.println(total);
		
		
	}

}
