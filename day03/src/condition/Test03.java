package condition;

public class Test03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//국밥집 국밥 한그릇 7천
		//65세 이상에게 50% 할인된 가격으로 판매
		
		int gb = 7000;
		
		int age = 12;
		
		boolean freegb = age >= 65;
		
		if(freegb){
			System.out.println(gb+"원인데 50퍼할인!해서 3500원입니다.");
		}
		else {
			System.out.println(gb+"원입니다.");
		}
		
		
							
	}

}
