package 삼항연산자;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {

		/*정수를 입력받아서 홀수/짝수를 판별 프로그램
		1.정수 입력받기
		Scanner scan = new Scanner(System.in);
		System.out.println("정수를 입력하세요");
		int num = scan.nextInt();
		
		2.홀수인지 짝수인지 판별
		System.out.println(num % 2 == 0 ? "짝수입니다." : "홀수입니다.");
		조건문 --> boolean 타입으로 
		*/
		Scanner scan = new Scanner(System.in);
		System.out.println("첫번째 정수를 입력하세요");
		int num1 = scan.nextInt();
		System.out.println("두번째 정수를 입력하세요");
		int num2 = scan.nextInt();
		
		System.out.println(num1 > num2 ? num1 - num2 : num2 - num1);
		
		int result = num1 > num2 ? num1 - num2 : num2 - num1;
		
		System.out.println("결과 확인 : " + result);
	}

}
