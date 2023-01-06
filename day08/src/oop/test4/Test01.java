package oop.test4;

public class Test01 {

	public static void main(String[] args) {

		Olimpic p1 = new Olimpic();
		Olimpic p2 = new Olimpic();
		Olimpic p3 = new Olimpic();
		
		p1.name = "진종오";
		p1.event = "사격";
		p1.div = "하계";
		p1.Gmedal=4;
		p1.Smedal=2;
		p1.Cmedal=0;
		
		p2.name = "김수녕";
		p2.event = "양궁";
		p2.div = "하계";
		p2.Gmedal=4;
		p2.Smedal=1;
		p2.Cmedal=1;
		
		p3.name = "전이경";
		p3.event = "쇼트";
		p3.div = "동계";
		p3.Gmedal=4;
		p3.Smedal=0;
		p3.Cmedal=1;
		
		System.out.print(p1.name+" | ");
		System.out.print(p1.event+" | ");
		System.out.print(p1.div+" | ");
		System.out.print(p1.Gmedal+" | ");
		System.out.print(p1.Smedal+" | ");
		System.out.print(p1.Cmedal+" | ");
		
		
	}

}
