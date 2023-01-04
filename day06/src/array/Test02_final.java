package array;

public class Test02_final {

	public static void main(String[] args) {


		int total = 0;
		
		int[] data=new int[] {10,20,30,40,50}; 

//		System.out.println(data.length);

		for(int i=0;i<data.length;i++) {
			System.out.println(data[i]); //시작점+i칸
		}

		for(int i=0;i<data.length;i++) {
			total+=data[i];
		}
		
		System.out.println(total);
		
	}

}
