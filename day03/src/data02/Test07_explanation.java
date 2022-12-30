package data02;

public class Test07_explanation {

	public static void main(String[] args) {

		//4의 배수 윤년으로 간주
		//윤년에는 2월이 29일 366일
		//100의 배수인 해는 4의배수라도 윤년이 아님
		//400의 배수인 해는 100의 배수라도 윤년으로 간주
		
		//이 기준을 토대로 특정년도가 윤년인지 아닌지 판정해서 출력
		
//		int ry = 2020;
//	//	double ly = 365.25;
//		
//		int a1=2,a2=1,a3=0,a4=0; 
//		
//		boolean ryProof1 = ry%4 == 0;
//		boolean ryProof2 = a2==1||a2==2||a2==3||a2==5||a2==6||a2==7||a2==9 == false;
//		boolean ryProof3 = a2%4==0 || a3 ==0 || a4 == 0;
//	
//		boolean ryProof = ryProof1 || ryProof2 && ryProof3;
//		
//		System.out.println(ryProof);
		
		//윤년 계산기

				//입력
				int year = 2100;

				//처리
				//1. 4의배수면 윤년
				//2. 100의 배수면 1번이라도 윤년이 아님
				//3. 400의 배수면 2번이라도 윤년
				boolean is4 = year % 4 == 0;
				boolean is100 = year % 100 == 0;
				boolean is400 = year % 400 == 0;

				//(참고) 논리에서 true와 같냐는 코드는 덧셈의 +0, 곱셈의 *1과 같은 코드이다.
				//boolean leap = 4의 배수이면서 100의 배수면 안되고 400의 배수면;
				//boolean leap = 4의 배수 && 100의 배수가 아님 || 400의 배수;
				//boolean leap = year % 4 == 0 
				//					&& year % 100 != 0 
				//					|| year % 400 == 0;
				//boolean leap = is4 == true && is100 == false || is400 == true;
				boolean leap = is4 && !is100 || is400;

				//출력
				System.out.println(leap);
			}
		}