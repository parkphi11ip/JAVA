package oop.interface2;

public class Test03 {

	public static void main(String[] args) {
		
		Calculator c = (left, right) -> left+right;
		
		System.out.println(c.process(10, 20));
		
	}
}
