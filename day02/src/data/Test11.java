package data;

public class Test11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// q. bmi 계산기 --- 조건 남섬 180cm, 80kg
		
		double m = 1.8;
		double kg = 80;		
		double m_m = m*m;			
		double bmi = kg/m_m;
		
		System.out.println(bmi);
		
		
		//소수점 2자리만 살리기
		double bmi2 = bmi*100;
		System.out.println(bmi2);
		int bmi3 = (int)bmi2;
		System.out.println(bmi3);
		double bmi4 = bmi3;
		System.out.println(bmi4);
		double bmi5 = bmi4/100;
		System.out.println(bmi5);
		
		
	}

}
