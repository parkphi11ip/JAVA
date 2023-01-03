package condition3;

import java.util.Scanner;

public class Test03_Ex {

	public static void main(String[] args) {

		//입력한 연/월에 해당하는 달의 일자수 구하기
		Scanner sc = new Scanner(System.in);

		System.out.println("년, 월을 입력하세요");
		
		int year = sc.nextInt();
		int month = sc.nextInt();

				int day;

				switch(month) {
				case 1: day = 31; break;
				case 2: 
					if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
						day = 29;
					}
					else {
						day = 28;
					}
					break;
				case 3: day = 31; break;
				case 4: day = 30; break;
				case 5: day = 31; break;
				case 6: day = 30; break;
				case 7: day = 31; break;
				case 8: day = 31; break;
				case 9: day = 30; break;
				case 10: day = 31; break;
				case 11: day = 30; break;
				default: day = 31; break;
				}

				//출력
				System.out.println(year+"년 "+month+"월은 "+day+"일까지 있어요");

		

	

		}
		
	}


