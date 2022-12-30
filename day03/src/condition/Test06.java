package condition;

public class Test06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 들어만 오면 주차요금 1시간은 무조건 5000원
		// 1시간 이후부터는 10분당 500원
		// 입력값으로 들어온 시각/분, 나간 시각/분을 설정하고 주차요금을 계산하여 출력
		
		
		
		int hfee = 5000;
		int mfee = 500/10;
		
		int intimeH = 13, intimeM = 30;		
		int outtimeH = 13, outtimeM = 50;
		//1h20m
		
		int prktimeH = outtimeH - intimeH;
		int prktimeM = outtimeM - intimeM;
			
		boolean prkin1hUnder = prktimeH == 0 && prktimeM <= 60;  
		boolean prkin1hOver = prktimeH >= 1;
		
		//boolean finalFee = prkin1hOver && prkin1hUnder;
		
		//System.out.println();..
		
				
		if(prkin1hUnder) {
			System.out.println(hfee);
		}
		else {
			System.out.println((5000*prktimeH)+(mfee*prktimeM));
		}
				
		
	}

}
