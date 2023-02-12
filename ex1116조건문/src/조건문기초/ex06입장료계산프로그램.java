package 조건문기초;

import java.util.Scanner;

public class ex06입장료계산프로그램 {

	public static void main(String[] args) {

		// 1. 입력
		Scanner scan = new Scanner(System.in);

		System.out.println("==에버랜드에 오신 걸 환영합니다==");
		System.out.println("나이를 입력하세요 : ");
		int age = scan.nextInt();
		System.out.println("인원수를 입력하세요 : ");
		int num = scan.nextInt();

		if (age < 20) {
			System.out.println("총"+(int) (5000 * 0.5) * num+"원 입니다.");

		} else {
			System.out.println("총"+5000 * num+"원 입니다.");
		}

	}
}
