package oop.method1;

public class Test01 {

	public static void main(String[] args) {

		Mobile a1 = new Mobile();
		Mobile a2 = new Mobile();
		Mobile a3 = new Mobile();
		
		a1.setting("sk", "5G언택트 52",52000,200,1000,2000);
		a2.setting("kt", "5G세이브",45000,100,900,1500);
		a3.setting("lg", "5G시그니처",130000,500,2000,2500);
		
		a1.output();
		a2.output();
		a3.output();
		
	}

}
