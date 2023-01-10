package 산술연산자;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("첫번째 정수를 입력하세요");
		int num1 = scan.nextInt();
		System.out.println("두번째 정수를 입력하세요");
		int num2 = scan.nextInt();
		
		System.out.println("더한 결과 값" + (num1 + num2));
		System.out.println("뺀 결과 값" + (num1 - num2));
		System.out.println("곱한 결과 값" + (num1 * num2));
		System.out.println("나눈 결과 값" + ((double)num1 / num2));
	}

}
