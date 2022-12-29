package data;

public class Test13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


//# Test13
//
//PC방 요금이 한 시간에 1500원입니다.
//PC방 요금이 한 시간에 1300원입니다.
//
//오전 9시 50분부터 오후 1시 35분까지 이용한 고객의 요금을 출력

		
		int pchFee = 1300;		
		int pcMFee = pchFee/60; //21
		
		int customerPcStartM = 540; //
		int customerPcEndM = 815;
		int customerPcTime = customerPcEndM - customerPcStartM;
		
		int customerPcFee = customerPcTime * pcMFee;
		
		System.out.println(customerPcFee); 
		
	}

}
