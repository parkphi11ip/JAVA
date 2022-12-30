package data;

import java.net.Socket;

public class Test14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//실수는 어떠한 경우에도 정수보다 큽니다.
		
		int a = 2100000000 + 2100000000; // 범위초과
		System.out.println(a);
		
		long b = 2200000000L;
		System.out.println(b);
		
		double d =(Math.PI);
		float e =(float) (Math.PI);
		System.out.println(d);
		System.out.println(e);
		
	}

}
