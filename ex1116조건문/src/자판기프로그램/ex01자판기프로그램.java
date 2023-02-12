package 자판기프로그램;

import java.util.Scanner;

public class ex01자판기프로그램 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("금액을 입력하세요 >> ");
		int money = sc.nextInt();
		
		System.out.println("메뉴를고르세요.");
		System.out.print("1.아우터(700원) 2.이구동성(1000원) 3.에그몽(500원) >> ");
		int num = sc.nextInt();
		
		
		
		if(num == 1) {
			money -=700;
		}else if(num == 2) {
			money -=1000;
		}else if(num == 3) {
			money -= 500;
		}else{
		}
		System.out.println("잔돈 : "+money+"원 입니다");
		if(money<0) {
			System.out.println("잔액이 부족합니다.");
		}
		
		
		
		
		
		
		
		
				
		
		
		
		
		
		
	}

}
