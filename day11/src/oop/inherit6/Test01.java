package oop.inherit6;

public class Test01 {
	
public static void main(String[] args) {
	
	
	IPhone13 a = new IPhone13();
	a.setColor("red");
	a.setNum("214-124-241");
	
	a.call();
	a.sms();
	a.siri();
	a.itunes();
	System.out.println(a.getColor()+" | "+a.getNum());
	
	
	System.out.println();
	
	
	IPhone14 b = new IPhone14();
	
	b.setColor("White");
	b.setNum("2134-14-2");
	
	b.call();
	b.sms();
	b.siri();
	b.faceTime();
	
	System.out.println(b.getColor()+" | "+b.getNum());
	
	}
}
