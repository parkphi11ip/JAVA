package data;
import java.lang.*;
public class Test06 {

	public static void main(String[] args) {

		//나눗셈, 나머지의 연산
		//*정수(int)끼리 계산하면 정수가 나옴 
		
		System.out.println(10/3);	//나눗셈의 몫
		System.out.println(10%3);	//나눗셈의 나머지
		
		int house = 10;
		int people = 3;
		
		int give = house/people;
		int remain = house%people;
		
		System.out.println(give);
		System.out.println(remain);
		
	}

}
