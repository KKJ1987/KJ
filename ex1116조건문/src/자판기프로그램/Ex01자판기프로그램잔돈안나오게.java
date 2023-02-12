package 자판기프로그램;

import java.util.Scanner;

public class Ex01자판기프로그램잔돈안나오게 {

   public static void main(String[] args) {

      Scanner scan = new Scanner(System.in);
      System.out.println("금액을 입력하세요.");
      int money = scan.nextInt();
      System.out.println("메뉴를 고르세요");
      System.out.println("1. 아우터(700원) 2. 이구동성(1000원) 3. 에그몽(500원)");
      int menu = scan.nextInt();
      int o = 700, e = 1000, em = 500;
      
      
      if(menu == 1 && money >= 700) {
         money -= o;
         System.out.println("잔돈 : " + money);
      } else if(menu == 2 && money >= 1000) {
         money -= e;
         System.out.println("잔돈 : " + money);
      } else if(menu == 3 && money >= 500) {
         money -= em;
         System.out.println("잔돈 : " + money);
      } else if(money < o || money < e || money < em) {
         System.out.println("돈이 부족해요 ㅜㅜ");
      }

   } // 돈이 부족할때 잔액이 표기안되게 하는 방법

}