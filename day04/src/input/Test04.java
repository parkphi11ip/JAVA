package input;

import java.util.Scanner;

public class Test04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("키(cm)를 입력하세요");
		double cm = sc.nextDouble();
		
		System.out.println("몸무게(kg)를 입력하세요");
		double kg = sc.nextDouble();
		
		sc.close();
		
		double m1 = cm/100;
		double m_m = m1*m1;			
		double bmi = kg/m_m;
		double bmin = (bmi*100)/100;

		System.out.println(bmin);
	
		if(bmin>=24.5) {
			System.out.println("과체중");
		}
		else {
			System.out.println("정상");
		}
		
	}

}
