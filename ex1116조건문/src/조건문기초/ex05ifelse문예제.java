package 조건문기초;

import java.util.Scanner;

public class ex05ifelse문예제 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("점수를 입력하세요 : ");
		int grade = scan.nextInt();
		if (grade >= 60) {
			System.out.println("합격입니다.");
		} else {
			System.out.println("불합격입니다.");
		}
		scan.close();
	}

}
