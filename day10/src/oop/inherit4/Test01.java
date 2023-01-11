package oop.inherit4;

public class Test01 {
	public static void main(String[] args) {
		
		Mp4 a = new Mp4();
		a.setFilename("hey sirri");
		a.setFilesize(10);
		a.setSpeed(442);
		a.execute();
		a.forward();
		a.rewind();
		
		System.out.println();
		
		Mp3 b = new Mp3();
		b.setFilename("aassd");
		b.setFilesize(44);
		b.setDuration(22);
		b.execute();
		b.forward();
		b.rewind();
		
		System.out.println();
		
		Hwp c = new Hwp();
		c.setFilename("qqwe");
		c.setFilesize(124);
		c.setPagesize(320);
		c.execute();
		c.preview();
		
		System.out.println();
		
		PPT d = new PPT();
		d.setFilename("phillip");
		d.setFilesize(12);
		d.setPagesize(32);
		d.execute();
		d.slideShow();
	}

		
		
		
	
}
