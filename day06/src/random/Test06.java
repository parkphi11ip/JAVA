//package random;
//
//import java.util.Random;
//import java.util.Scanner;
//
//public class Test06 {
//
//	public static void main(String[] args) {
//
////		# Test06
////
////		업다운 게임
////
////		숫자를 하나 정해두고 이를 맞추는 게임을 업다운 게임이라고 합니다.
////
////		- 프로그램이 랜덤으로 1에서 1000 사이의 숫자를 하나 정합니다.
////		- 사용자가 범위 내에서 숫자를 입력합니다.
////		- 프로그램은 사용자가 입력한 값과 정답을 비교해서 `업`, `다운`, `정답` 세 개중 하나를 알려줍니다.
////			- `업`은 정답이 입력값보다 크다는 의미입니다.
////			- `다운`은 정답이 입력값보다 작다는 의미입니다.
////			- `정답`은 정답과 입력값이 같은 경우를 말하며, 게임이 종료되어야 합니다.
////
////		업다운 게임을 구현하시고 정답을 맞추면 몇 번 만에 맞췄는지 계산해서 출력해주세요.
//		
//		Scanner sc = new Scanner(System.in);
//		Random r = new Random();
//		
//		int cnt = 0;
//		int randomN = r.nextInt(1000)+1;
//		int answerU = sc.nextInt();
//
//		while(true) {
//		if(answerU==randomN){
//			cnt++;
//			System.out.println("Right");
//			break;
//		}else{
//			cnt++;
//			System.out.println("Wrong");
//			if(answerU<randomN) {
//				System.out.println("up");
//				
//				if(answerU>randomN) {
//					System.out.println("down");
//					
//				}
//			}
//		}
//		
//	}
//	}
//}
