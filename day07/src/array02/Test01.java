package array02;

import java.util.Iterator;

public class Test01 {

	public static void main(String[] args) {

		//1. 실수 5개를 저장하는 배열
		double[] arr1=new double[5];  
		
		// --------> [0.0][0.0][0.0][0.0][0.0]
		
		double[]arr2=new double[] {1.1, 2.2, 3.3, 4.4, 5.5};

		//2. 문자열 5개를 저장하는 배열(값을 모를때)
		String[]arr3=new String[5];
		// arr3 ----> [null][null][null][null][null]
		
		//3. 자바, 파이썬, C++, 루비, 안드로이드를 배열에 저장
		String[]arr4=new String[] {"자바","파이썬","C++", "루비","안드로이드"};
	
		for (int i = 0; i < arr4.length; i++) {
			System.out.println(arr4[i]);
		}
	}

}
