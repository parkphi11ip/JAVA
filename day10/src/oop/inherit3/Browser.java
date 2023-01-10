package oop.inherit3;

public class Browser {

	// super class.
//	주소를 저장할 수 있어야 한다(url)1111
//	새로고침 기능이 존재해야 한다(refresh)1111
//	페이지 이동 기능이 존재해야 한다(move)1111

	private String url;
	private String refresh;
	private String move;
	
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getRefresh() {
		return refresh;
	}
	public void setRefresh(String refresh) {
		this.refresh = refresh;
	}
	public String getMove() {
		return move;
	}
	public void setMove(String move) {
		this.move = move;
	}
	
	public void url() {
		System.out.println("url.");
	}
	public void refresh() {
		System.out.println("refresh.");
	}
	public void move() {
		System.out.println("move.");
	}
	
	
	
	
	
}
