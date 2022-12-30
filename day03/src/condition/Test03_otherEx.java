package condition;

public class Test03_otherEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//국밥집 국밥 한그릇 7천
		//65세 이상에게 50% 할인된 가격으로 판매
		
		int age = 70;//손님나이
		int price = 7000;//국밥가격
		int rate = 50;//할인율

		boolean elder = age >= 65;

		if(elder) {
			System.out.println(price * (100 - rate) / 100);
		}
		if(!elder) {
			System.out.println(price);
		}
		
		
							
	}

}
