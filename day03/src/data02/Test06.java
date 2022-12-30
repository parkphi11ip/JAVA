package data02;

public class Test06 {

	public static void main(String[] args) {

		int a1=5, a2=1;
		int b1=7, b2=2;
		int c1=7, c2=7;
		
		int q1=a1%7;
		int q2=a2%7;
		int w1=b1%7;
		int w2=b2%7;
		int e1=c1%7;
		int e2=c2%7;
		
		boolean aye1 = q1==0;
		boolean aye2 = q2==0;
		boolean aye3 = w1==0;
		boolean aye4 = w2==0;
		boolean aye5 = e1==0;
		boolean aye6 = e2==0;
		
		boolean hay1 = aye1 || aye2;
		boolean hay2 = aye3 || aye4;
		boolean hay3 = aye5 || aye6;
		
		System.out.println(hay1);
		System.out.println(hay2);
		System.out.println(hay3);
		
	}

}
