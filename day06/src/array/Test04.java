package array;

public class Test04 {

	public static void main(String[] args) {
		
//		Test04 (과제)
//
//		어떤 반 학생 10명의 성적정보는 다음과 같습니다
//
//		- 점수 : [90, 85, 51, 63, 77, 71, 77, 85, 99, 70]
//
//		요구사항을 지켜 프로그래밍 하세요
//
//		1. 모든 학생의 점수를 출력
//		2. 모든 학생에 대한 평균 점수를 출력
//		3. 재평가자(60점 미만) 인원수를 출력
//		4. 성적 우수자(90점 이상) 인원수를 출력
//		5. 만약 이 반에 새로 들어온 학생이 80점이면 몇 등인지 계산하여 출력
		
		int total = 0;
		int cntLow = 0;
		int cntHigh =0;
		int cntNewstudent =0;
		
		int[] data=new int[] {90, 85, 51, 63, 77, 71, 77, 85, 99, 70, 80};  
		
		for(int i=0;i<data.length;i++) {
			System.out.println("1. 일반 데이터 | "+data[i]);
			total += data[i];
		}
		for(int i=0;i<data.length;i++) {
			if(data[i]<60) {
				cntLow++;
			}
		}
		for(int i=0;i<data.length;i++) {
			if(data[i]>=90) {
				cntHigh++;
			}
		}
		for(int i=0;i<data.length;i++) {
			if(data[i]>=80) {
				cntNewstudent++;
			}
		}
		//
		System.out.println("2. 학생 점수들의 평균 | "+(double)total/data.length);
		System.out.println("3. 재평가자  | "+cntLow);
		System.out.println("4. 성적우수자  | "+cntHigh);
		System.out.println("5. 80점으로 새로 들어온놈 몇등이냐?  | "+cntNewstudent);
		
		
	}
}		