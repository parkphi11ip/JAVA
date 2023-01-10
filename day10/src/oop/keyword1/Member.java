package oop.keyword1;

public class Member {

	private final String nickname;
	private String auth;
	
//	public Member(String nickname) {
//		this.nickname=nickname;
//		this.auth="준회원";
//		this(nickname, "준회원");
//	}
	
	public Member(String nickname, String auth) {
		this.nickname=nickname;
		this.auth=auth;
	}
	
}
