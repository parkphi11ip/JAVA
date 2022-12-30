package data02;

public class Test04 {

	public static void main(String[] args) {

		//지하철 무임승차 대상 판정
		//	영유아 7세이하
		//	어르신 65세 이상
		
		//
		int age = 15;
		
		boolean free = age <= 7 || age>=65; //  || <- "또는"이라는 뜻
		
		System.out.println(free);
		
	}

}
