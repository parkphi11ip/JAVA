package condition;

public class Test07 {

	public static void main(String[] args) {

//		# Test07
//
//		과속단속 카메라 프로그램
//
//		KH전자에서 만든 과속단속 카메라는 다음 규칙에 따라서 벌금을 계산합니다
//
//		- 50km를 초과하는 속도로 달리는 자동차를 단속
//		- 기본 벌금은 30000원으로 설정
//		- 벌금은 제한속도보다 10km 이상 빨라질 때마다 10000원씩 증가
//
//		자동차 속도를 입력값으로 설정한 뒤 예상되는 벌금을 출력(과속이 아니면 벌금은 없습니다)
		
		int speed = 49;
		
		int nomalPenalty =  30000;
		int overPenalty = 10000;
		
		int overKmFee = (speed/10-5)*overPenalty;
		
		boolean nomalSpeed = speed < 60 && speed > 50;
		boolean overSpeed = speed >= 60;
		
		if(nomalSpeed) {
			System.out.println(nomalPenalty
					+"원입니다 : 기본벌금. ");
		}
		if(overSpeed){
			System.out.println((nomalPenalty+overKmFee
			+ "원입니다 : 10km이상 빨라질때마다 벌금이 증가합니다. "));
		}
		else{
			
			
		}
		
	}

}
