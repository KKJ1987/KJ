package 자판기프로그램;

import java.util.Scanner;

public class ex01자판기프로그램선생님이랑같이 {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in); // 스캐너도구
		System.out.print("금액입력 : "); // 금액 입력 표시
		int money = sc.nextInt(); // 스캐너에 입력하는 값을 머니라는 정수값으로 명명
		System.out.println("메뉴를 고르세요"); // 메뉴를 고르세요 를 표시
		System.out.print("1. 아우터700 2.이구동성1000 3.에그몽500 >> "); // 실제로 표시되는 메뉴판을 표시
		int menu = sc.nextInt(); // 스캐너에 입력되는 값을 메뉴라는 정수값으로 명명

		int change = money; // 머니를 잔액으로 명명
		
		if(menu == 1) { // 메뉴가 1번이 맞다면
			change = money - 700; // 체인지는 입력값 머니에서 700원 뺀 값을 표시하겟음
			if(change<0) { // 만약에 체인지 값이 0보다 작다면 
				System.out.println("잔액이 부족합니다."); // 잔액부족을 표시하겟음
				change = money; // 이때 체인지는 위에 입력햇던 머니값을 그대로 표시하겟음
			}
		}else if(menu == 2) { // 만약에 선택한 메뉴값이 1이 아니고 2였다면...
			change = money - 1000;
			if(change<0) {
				System.out.println("잔액이 부족합니다.");
				change = money;
			}
		}else if(menu == 3) { // 선택한 메뉴가 3이었다면..
			change = money - 500;
			if(change<0) {
				System.out.println("잔액이 부족합니다.");
				change = money;
			}
		}else { // 그외에... 1번 2번 3번 외의 숫자가 입력이 되었다면
			System.out.println("잘못된 메뉴를 입력하셨습니다.");
			change = money;
		}
		System.out.println("잔돈 : "+change); // 선택들이 다 끝나고 난다면 잔돈 : 뒤에 잔액을 표시하겟음
		
		
		
	}

}
