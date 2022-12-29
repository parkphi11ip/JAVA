
package data;

import java.lang.*;
import java.net.Socket;

public class Test01 {

	public static void main(String[] args) {
		//데이터 data
		//: 계산에 쓰이는 값 ex.음식재료
		//	숫자는 크게 소수점 유무로 갈린다.(있으면 실수, 없으면 정수)
		
		//정보 information
		//: 계산으로 만들어진 의미있는 결과물 ex.음식
		
		System.out.println("10");// 정수
		System.out.println(1.4); // 실수
		
		
		System.out.println(10+1.4);	//정수+실수=실수
		System.out.println(10+20);	//정수+정수=정수
		
		System.out.println(10/3);	//정수가 출력
		System.out.println(10/3.0);	//실수가 출력
		
		
	}

}
