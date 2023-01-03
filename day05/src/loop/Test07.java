package loop;

public class Test07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int pushup = 5;
		int total = 0;
		
		for(int day=1; day<=30; day++) {
			System.out.println(day+" | "+pushup);
			total +=pushup;
			pushup+=2;
		}
		
		System.out.println(total);
	}
	

}
