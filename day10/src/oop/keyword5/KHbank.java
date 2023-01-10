package oop.keyword5;

public class KHbank {

	private static double nmInterest = 1.2;
//	static {
//		//static 항목에 대한 초기화 코드를 작성할 수 있는 전용공간
//		//ex : 1부터 100까지 더한 결과를 설정
//		//- if, for등 각종 프로그래밍 구문 사용 가능
//		nmInterest = 1.2;
//	}
	private String name;
	private double prfInterest;
	private int balance;
	

	public KHbank(String name,double prfInterest,int balance) {
		this.setName(name);
		this.setPrfInterest(prfInterest);
		this.setBalance(balance);
	}
	
	public void output() {
		System.out.println();
		System.out.println("이름 : "+this.name);
		System.out.println("기본이율 : "+ KHbank.getNmInterest());
		System.out.println("우대이율 : "+ this.prfInterest);
		System.out.println("잔액 : "+ this.balance);
	}
	
	public int getBalance() {
		return balance;
	}
	
	public void setBalance(int balance) {
		if(balance>0) {
		this.balance = balance;
		}
		if(balance<0) {
			return;
		}
	}
	public static double getNmInterest() {
		return nmInterest;
	}
	public static void setNmInterest(double nmInterest) {
		KHbank.nmInterest = nmInterest;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrfInterest() {
		return prfInterest;
	}
	public void setPrfInterest(double prfInterest) {
		if(prfInterest>0) {
		this.prfInterest = prfInterest;	
		}
		if(prfInterest<0) {
			return;
		}
	}
	
	
}
