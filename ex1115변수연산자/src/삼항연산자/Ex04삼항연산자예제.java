package 삼항연산자;

import java.util.Scanner;

public class Ex04삼항연산자예제 {

	public static void main(String[] args) {
		//1. 농구공의 개수를 입력하세요를 출력
		System.out.print("농구공의 개수를 입력하세요 >> ");
		//2. 정수형 숫자를 입력
		// 2-1) 입력받는 도구 꺼내오기
		Scanner scan = new Scanner(System.in);
		// 2-2) 입력받기
		int num = scan.nextInt();
		
		//3. 필요한 상자의 수를 구하는 로직
		//4. 결과값을 출력
		
		System.out.println(num % 5 == 0 ? num / 5 : (num / 5) + 1);
	}
	
}
