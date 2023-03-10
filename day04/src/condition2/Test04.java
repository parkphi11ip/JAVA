package condition2;

public class Test04 {

	public static void main(String[] args) {

//		# Test04
//
//		SNS와 같은 게시글(피드) 위주의 사이트에서는 요즘 시간을 다음과 같이 표시합니다
//
//		- 예전 : 2023-01-02 12:50:30
//		- 최근 : 방금 전, 30초 전, 1일 전, 오래 전
//
//		최근 방식으로 보여주기 위해서는 현재 시각과 작성 시각의 차이를 알아야 합니다
//
//		작성 시각과 현재 시각의 차이가 초단위로 주어졌을 때 다음 규칙에 맞게 시간 메세지를 출력
//
//		- 10초 미만이면 `방금 전`이라고 출력
//		- 1분 미만이면 `?초 전`이라고 출력
//		- 1시간 미만이면 `?분 전`이라고 출력
//		- 1일 미만이면 `?시간 전`이라고 출력
//		- 1일이 넘어가면 `오래 전`이라고 출력
//
//		참고로 숫자(변수)와 따옴표로 감싸진 문자를 더하면 두 값이 붙어서 출력됩니다
//		```
//		int a = 10;
//		System.out.println("a = " + a);
//		```
		
		int htime = 12, mtime = 32, stime = 21;
		int nowhtime = 22, nowmtime = 33, nowstime = 55; 
		
		int wrotehtime = nowhtime - htime;
		int wrotemtime = nowmtime - mtime; 
		int wrotestime = nowstime - stime;
		int wrotedtime = wrotehtime * 24;
		
//		int h = 1;
//		int d = 24*h;
//		int m = h/60;
//		int s = m/60;
		
		if (wrotestime < 10 || wrotemtime == 0 || wrotehtime == 0) {
			System.out.println("방금 전");
		}
		else if(wrotestime <= 60 ||wrotemtime < 1 || wrotehtime == 0) {
			System.out.println(wrotestime+"초 전");
		}
		else if(wrotestime < 60 ||wrotemtime < 60 ||wrotehtime < 1
				) {
			System.out.println(wrotemtime+"분 전");
		}
		else if(wrotestime < 60 ||wrotemtime < 60 ||wrotehtime < 24||wrotedtime < 1 ) {
			System.out.println(wrotehtime+"시간 전");
		}
		else {
			System.out.println("오래 전");
		}
	

	}


}
