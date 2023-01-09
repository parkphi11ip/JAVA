package quiz;

public class q_2 {

	public static void main(String[] args) {
//		2.	
//		다음 요구사항을 처리하기 위한 프로그램 코드를 작성하시오. (35점)
//
//		<요구사항>
//
//		- 국어점수는 50점, 영어점수는 60점, 수학점수는 65점 입니다
//
//		- 각 과목 점수에는 소수점이 있을 수 없습니다
//
//		- 위 값을 변수에 저장한 뒤, 세 과목의 평균 점수를 계산합니다
//
//		- 계산된 값을 콘솔에 출력합니다
//
//		- 데이터 타입을 준수하시기 바랍니다
//
//		- main 내부의 코드만 작성하세요
		
		int kor = 50;
		int eng = 60;
		int math = 65;
		
		int total = kor + eng + math;
		
		int everage = total/3;
		
		System.out.println(everage);
		
		
	}

}
