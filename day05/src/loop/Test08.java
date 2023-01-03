package loop;

public class Test08 {

	public static void main(String[] args) {

		long money = 1;
		long total = 0;
		long day = 40;
		
		for(int i=1; i<=day; i++) {
			money *= 2; 
			total += money;
			System.out.println(i+"일 | "+money+"원");
		}
		
		System.out.println(total);
	}

}
