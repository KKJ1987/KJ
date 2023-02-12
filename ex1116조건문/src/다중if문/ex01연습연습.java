package 다중if문;

import java.lang.ref.Cleaner.Cleanable;
import java.util.Scanner;

public class ex01연습연습 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
				
		
		System.out.println("점수 입력 : ");
		int score = sc.nextInt();
		
		char grade = 'a';
		if(score>=90) {
			grade = 'A';
		}else if(score>=80) {
			grade = 'B';
		}else if(score>=70) {
			grade = 'C';
		}else {
			grade = 'D';		
			
		}
		System.out.println(grade+"학점입니다.");
		
			
		
	}

}
