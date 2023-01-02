package condition2;

public class Test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int money = 1000; 

		if(money >= 25000) {
			System.out.println("피자 추천");
		}
		else if(money >= 18000) {
			System.out.println("치킨 추천");
		}
		else if(money >= 5000) { 
			System.out.println("떡볶이 추천");
		}
		else {
			System.out.println("추천할 메뉴가 없음");
		}

	}

}
