package com.green.연습1;

import java.util.Scanner;

public class 메뉴선택2 {
    public static void main(String[] args) {
        int menu = 0;
        int num = 0;
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.println("원하는 메뉴(1~3) 선택하세요. (종료:0) ");
            System.out.println("(1) square");
            System.out.println("(2) tri");
            System.out.println("(3) log");
            System.out.print(" >> ");
            String tmp = scanner.nextLine();
            menu = Integer.parseInt(tmp);

            if (menu >= 1 && menu < 4) {
                System.out.printf("선택하신 메뉴는 %d번 입니다.\n",menu);

            } else if (menu != 0 && menu < 1 || menu > 3) {
                System.out.println("잘못 누르셨습니다 다시 선택해주세요.");

            } if (menu == 0) {
                System.out.println("프로그램 종료");
                break;
            }
        }
    }
}
