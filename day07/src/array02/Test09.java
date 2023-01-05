package array02;

public class Test09 {
	public static void main(String[] args) {
		
//		30, 50, 20, 10, 40을 선택정렬(Selection sort) 방식으로 정렬하세요
//
//		다음 사이트를 참고하여 구현하세요
//
//		https://visualgo.net/en/sorting
//		상단 메뉴에서 정렬 방식을 SEL(선택 정렬, SELECTION SORT)로 지정합니다
//		하단 Create(A) 버튼을 눌러 데이터 입력란에 30, 10, 20, 50, 40을 입력하고 Go를 누릅니다
//		하단 Sort 버튼을 누르면 정렬되는 과정을 시각적으로 확인할 수 있습니다
		
		//데이터 준비
		int[] data = new int[] {30, 50, 20, 10, 40};

		//처리
		//- 선택정렬 1회차 : 0~4 에서 가장 작은 값을 찾아 맨 앞의 데이터와 교체
		//- 선택정렬 2회차 : 1~4 에서 가장 작은 값을 찾아 맨 앞의 데이터와 교체
		//- 선택정렬 3회차 : 2~4 에서 가장 작은 값을 찾아 맨 앞의 데이터와 교체
		//- 선택정렬 4회차 : 3~4 에서 가장 작은 값을 찾아 맨 앞의 데이터와 교체
		for(int k=0; k < data.length-1; k++) {//회차
			int index = k;
			for(int i=k+1; i < data.length; i++) {//정렬
				if(data[index] > data[i]) {//index위치보다 더 작은 데이터가 i에 존재한다면
					index = i;//index를 i로 변경해라!
				}
			}
			//System.out.println("index = " + index);

			int backup = data[k];
			data[k] = data[index];
			data[index] = backup;
		}

		//출력
		for(int i=0; i < data.length; i++) {
			System.out.print(data[i]);
			System.out.print(" ");
		}
		System.out.println();

	}
}