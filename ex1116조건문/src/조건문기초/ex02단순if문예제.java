package 조건문기초;

import java.util.Scanner;

public class ex02단순if문예제 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);// 입력받는 도구
		System.out.println("나이를 입력하세요");// 도구 사용시 출력되는 문자열
		int age = scan.nextInt();// 변수 초기화
		if (age >= 20) {// 조건문
			System.out.println("성인입니다.");
		}else {
			System.out.println("성인이 아닙니다.");
		}

	}
}
// 1. 나이를 입력하세요를 출력 (줄 바꿈 없이 )
// 2. 정수형 데이터 입력받기
// 2-1) 입력받는 도구 꺼내오기 
// 2-2) 입력받기
// 3. 20보다 입력받은 데이터가 크다면, 성인입니다를 출력
