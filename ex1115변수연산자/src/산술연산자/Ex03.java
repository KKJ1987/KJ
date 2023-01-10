package 산술연산자;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {

//		입력도구 꺼내오기
//		
//		1.정수형 num을 선언
//		사용자한테 값을 입력받기
//		
//		2.num의 백의자리 이하는 버릴 수 있는 산술 연산 작성
//		ex) 456 ---> 400
//		정수형 result
		
		Scanner scan = new Scanner(System.in);
		System.out.println("값을 입력하세요");
		int num = scan.nextInt();
		int result = (num / 100) * 100;
		System.out.println(result);
	}

}
