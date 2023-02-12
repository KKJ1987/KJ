package switch문;

import java.util.Scanner;

public class ex01switch문연습연습연습 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("월을 입력하세요 : ");
		int month = sc.nextInt();
		
		switch (month/3) {
		case 1:
			System.out.println(month+"월은 봄입니다.");
			break;
		case 2:
			System.out.println(month+"월은 여름입니다.");
			break;
		case 3:
			System.out.println(month+"월은 가을입니다.");
			break;
		default :
			System.out.println(month+"월은 겨울입니다.");
			break;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
