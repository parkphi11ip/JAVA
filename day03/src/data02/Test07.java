package data02;

public class Test07 {

	public static void main(String[] args) {

		//4의 배수 윤년으로 간주
		//윤년에는 2월이 29일 366일
		//100의 배수인 해는 4의배수라도 윤년이 아님
		//400의 배수인 해는 100의 배수라도 윤년으로 간주
		
		//이 기준을 토대로 특정년도가 윤년인지 아닌지 판정해서 출력
		
		int ry = 2020;
	//	double ly = 365.25;
		
		int a1=2,a2=1,a3=0,a4=0; 
		
		boolean ryProof1 = ry%4 == 0;
		boolean ryProof2 = a2==1||a2==2||a2==3||a2==5||a2==6||a2==7||a2==9 == false;
		boolean ryProof3 = a2%4==0 || a3 ==0 || a4 == 0;
	
		boolean ryProof = ryProof1 || ryProof2 && ryProof3;
		
		System.out.println(ryProof);
		
		
	}

}
