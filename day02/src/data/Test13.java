package data;

public class Test13 {

	public static void main(String[] args) {
	
		int h = 60;
		
		int hfee = 1300;		
		int mfee = hfee/h; //21
		
		int h1=9;
		int m1=50;
		int h2=13;
		int m2=35;
		
		int pctime = (h2*h+m2)-(h1*h+m1);	
		int pcfee=mfee*pctime;
    
		//System.out.println(pcfee);
		System.out.println(Math.round(pcfee/ 100) * 100);
	}
}