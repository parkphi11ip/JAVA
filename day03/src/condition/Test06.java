package condition;

public class Test06 {

	public static void main(String[] args) {

//		# Test06
//
//		주차장 요금 계산 프로그램
//
//		KH 주차장은 다음과 같이 주차요금을 계산합니다
//
//		- 들어만 오면 1시간은 무조건 기본요금 5000원
//		- 1시간 이후부터는 10분당 500원으로 계산
//
//		입력값으로 들어온 시각/분, 나간 시각/분을 설정하고 주차요금을 계산해서 출력
			
		int hfee = 5000;
		int mfee = 500/10;
		int Overhfee = 3000;
		
		int intimeH = 13, intimeM = 30;		
		int outtimeH = 14, outtimeM = 41;
		
		int prktimeH = outtimeH - intimeH;
		int prktimeM = outtimeM - intimeM;
			
		boolean prkin1hUnder = prktimeH == 0 && prktimeM <= 60;  
		boolean prkin1hOver = prktimeH >= 1;
				
		if(prkin1hUnder) {
			System.out.println(hfee+"원입니다.");
		}
		else {
			System.out.println(hfee+(Overhfee*prktimeH-Overhfee)
					+(mfee*prktimeM)+"원입니다.");
		}
		
	}

}
