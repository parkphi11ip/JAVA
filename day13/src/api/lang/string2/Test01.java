package api.lang.string2;

import java.util.Iterator;

public class Test01 {
	
	public static void main(String[] args) {
		
		//String의 문제점
		// 문자열이 불변이라는 성질 때문에 합성에서 문제가 생김

		
		StringBuffer buffer = new StringBuffer();	
//		StringBuilder buffer = new StringBuilder();
	
		long start = System.currentTimeMillis();
		
		for(int i=0; i<1000000; i++) {
			buffer.append("*");
		}
		
		long finish = System.currentTimeMillis();
		System.out.println(finish-start);
//		System.out.println(buffer.toString());
	
		
	}

}
