package condition3;

import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("년, 월을 입력하세요");
		
		String m = sc.next();
		
		switch(m) {
		case "1":
			System.out.println("31");
			break; 
		case "2":
			System.out.println("28");
			break;
		case "3":
			System.out.println("30");
			break;
		case "4":
			System.out.println("31");
			break; 
		case "5":
			System.out.println("30");
			break;
		case "6":
			System.out.println("31");
			break;
		case "7":
			System.out.println("30");
			break; 
		case "8":
			System.out.println("30");
			break;
		case "9":
			System.out.println("29");
			break;
		case "10":
			System.out.println("31");
			break; 
		case "11":
			System.out.println("30");
			break;
		case "12":
			System.out.println("31");
			break;
		default :
			System.out.println("이상한 숫자.");
			break;
		}

	

		}
		
	}


