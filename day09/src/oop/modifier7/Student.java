package oop.modifier7;

public class Student {

	private String name;
	private int grade;
	private int kor;
	private int eng;
	private int math;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		if(kor >= 100) {
			return;
		}
		if(kor < 0) {
			return;
		}this.kor=kor;
		
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		if(eng >= 100) {
			return;
		}
		if(eng < 0) {
			return;
		}this.eng=eng;
		
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		if(math >= 100) {
			return;
		}
		if(math < 0) {
			return;
		}this.math=math;
		
	}
	public int getTotal() {
		return kor+eng+math;
	}
	public double getAver() {
		return getTotal()/3.0;
	}
	
	public String getABC() {
		if(getAver()>=90 && getAver()<=100) {
			return "A";
		}
		else if(getAver() >=80 && getAver()<90) {
			return "B";
		}
		else if(getAver() >=70 && getAver()<80) {
			return "C";
		}
		else {
			return "F";
		}
	}
	public Student(String name,int grade,int kor,int eng,int math) {
		this.setName(name);
		this.setGrade(grade);
		this.setKor(kor);
		this.setEng(eng);
		this.setMath(math);
	}
	
	public void output() {
		System.out.println();
		System.out.println("< student grade info >");
		System.out.println();
		System.out.println("name : "+this.name);
		System.out.println("class : "+this.grade);
		System.out.println("kor : "+this.kor);
		System.out.println("eng : "+this.eng);
		System.out.println("math : "+this.math);
		System.out.println("total score : "+getTotal());
		System.out.println("average : "+getAver());
		System.out.println("grade point : "+getABC());

	}
	
	
	
}
