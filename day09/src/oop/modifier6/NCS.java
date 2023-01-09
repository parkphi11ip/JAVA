package oop.modifier6;

public class NCS {

	private String name;
	private String subj;
	private int score;
	private int cheak;
	
		// TODO Auto-generated constructor stub
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSubj() {
		return subj;
	}
	public void setSubj(String subj) {
		this.subj = subj;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		if(score >= 100) {//30시간 단위가 아닐 경우(30의 배수면)
			return;
		}
		if(score < 0) {
			return;
		}this.score=score;

	}
	public int getCheak() {
		return cheak;
	}
	public void setCheak(int cheak) {
		this.cheak = cheak;
	}
	public int getTotal() {
		return getScore() + getCheak();
	}
	public double getAverage() {
		return getTotal()/2;
	}
	public boolean getPass() {
		return getScore() >= 40 && getCheak() >=40 && getAverage()>=60;
	}
	
	NCS(String name, String subj, int score, int cheak) {
		this.setName(name);
		this.setSubj(subj);
		this.setScore(score);
		this.setCheak(cheak);
	}
		
	public void output() {
		System.out.println("-NCS 평가 정보-");
		System.out.println(this.name);
		System.out.println(this.subj);
		System.out.println(this.score);
		System.out.println(this.cheak);
		System.out.println(getTotal());
		System.out.println(getAverage());
		if(getPass()) {
			System.out.println("통과");
		}else {
			System.out.println("재평가");
		}
		System.out.println();
	}
		
		
		
	
}
