package switch문;

import java.util.Scanner;

public class ex01switch문연습연습 {

	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	System.out.print("점수 입력 : ");
	int score = sc.nextInt();
	
	switch(score/10) {
	case 10 :
		
	case 9 :		
		System.out.println("A입니다.");
		break;
	case 8 :
		System.out.println("B입니다.");
		break;
	case 7 :
		System.out.println("C입니다.");
		break;
	default :
		System.out.println("D입니다");
		break;
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
