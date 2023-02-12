package 조건문기초;

import java.util.Scanner;

public class ex03 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		// 1. 정수를 입력하세요 를 출력
		System.out.println("정수를 입력하세요 >>");
		// 2. 정수형 데이터 입력받기
		int num = scan.nextInt();
		// 2-1. 입력받는 도구 꺼내오기

		// 2-2. 입력받기
		if (num % 3 == 0 && num % 5 == 0) {
			System.out.println("3과 5의 배수입니다.");
		}
		

	}

}
