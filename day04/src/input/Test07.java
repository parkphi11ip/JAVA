package input;

import java.util.Scanner;

public class Test07 {

	public static void main(String[] args) {

//		# Test07
		
		int dfee = 100000;
		
		Scanner sc = new Scanner(System.in);

		System.out.println("여행 갈 년도와 월을 입력하세요");
		int y = sc.nextInt();
		int m = sc.nextInt();
		
		System.out.println("여행인원수를 입력하소");
		int people = sc.nextInt();
		
		System.out.println("여행기간 ㄱ");
		int day = sc.nextInt();
		
		sc.close();
		
		boolean leapYear = (y % 4 == 0 && y % 100 != 0) || y % 400 == 0;
		double springRate = 0.9, summerRate = 0.95, fallRate = 0.7, winterRate = 0.8;
		double leapRate = 0.95;
		
		int pay = dfee*people*day;
		
		if(leapYear) {
			if(m<=3&&m>=1) {
				System.out.println(pay*springRate*leapRate);
			}
			else if(m>=4&&m<=8) {
				System.out.println(pay*summerRate*leapRate);
			}
			else if(m>=9&&m<=11) {
				System.out.println(pay*fallRate*leapRate);
			}
			else {
				System.out.println(pay*winterRate*leapRate);
			}
		}
		
		else{
			if(m<=3&&m>=1) {
				System.out.println(pay*springRate);
			}
			else if(m>=4&&m<=8) {
				System.out.println(pay*summerRate);
			}
			else if(m>=9&&m<=11) {
				System.out.println(pay*fallRate);
			}
			else {
				System.out.println(pay*winterRate);
			}
		
		}
				
	}

}