package data02;

public class Test06_ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a1=5, a2=1; //51
		int b1=7, b2=2; //72
		int c1=7, c2=7; //77
		
		int q1=a1%7;
		int q2=a2%7;
		int w1=b1%7;
		int w2=b2%7;
		int e1=c1%7;
		int e2=c2%7;
		
		boolean aye1 = q1==0 || q2==0;
		boolean aye3 = w1==0 || w2==0;
		boolean aye5 = e1==0 || e2==0;
	
		
		System.out.println(aye1);
		System.out.println(aye3);
		System.out.println(aye5);
	}

}
