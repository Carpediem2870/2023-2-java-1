package com.green.연습1;

import java.util.Scanner;

public class 메뉴선택 {
    public static void main(String[] args) {
        int menu = 0;
        int num = 0;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1");
            System.out.println("2");
            System.out.println("3");
            System.out.print("원하는메뉴선택(종료0)");

            String tmp = scanner.nextLine();
            menu = Integer.parseInt(tmp);

            if (menu == 0) {
                System.out.println("프로그램종료");
                break;
            } else if (!(1<=menu && menu <= 3)) {
                System.out.println("메뉴를 잘못 선택 했습니다.");
                continue;
            }
            System.out.println("선택하신메뉴는"+menu+"번 입니다.");
        }
    }
}
