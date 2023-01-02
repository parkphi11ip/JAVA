package input;

import java.util.Scanner;

public class Test05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int subj = 3; //과목수
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("국어점수를 입력하세요");
		int kor = sc.nextInt();
		
		System.out.println("수학점수를 입력하세요");
		int math = sc.nextInt();
		
		System.out.println("영어점수를 입력하세요");
		int eng = sc.nextInt();

		sc.close();
		
		int passEverage = (kor+math+eng)/subj;
		boolean passScore = kor >= 40 && math >= 40 && eng >= 40;
	
		if(passEverage >= 60 && passScore) {
			System.out.println("합격 !!!!!!!!!!");
		}
		else {
			System.out.println("불합격 !!!!!!!!!");
		}
	}

}
