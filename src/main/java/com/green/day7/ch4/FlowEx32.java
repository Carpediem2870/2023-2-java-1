package com.green.day7.ch4;

import java.util.Scanner;

public class FlowEx32 {
    public static void main(String[] args) {
        /*
        (1) square
        (2) tri
        (3) log
        원하는 메뉴(1~3)를 선택하세요. (종료:) >>
        위 내용이 계속 반복 (0을 입력하기 전까지)
        */

        /*
        (1) square
        (2) tri
        (3) log
        원하는 메뉴(1~3)를 선택하세요. (종료:) >> 1(엔터)
        선택하신 메뉴는 1번입니다.
        */

                /*
        (1) square
        (2) tri
        (3) log
        원하는 메뉴(1~3)를 선택하세요. (종료:) >> 2(엔터)
        선택하신 메뉴는 2번입니다.
        */

                /*
        (1) square
        (2) tri
        (3) log
        원하는 메뉴(1~3)를 선택하세요. (종료:) >> 4(엔터)
        메뉴를 잘못 선택 하셨습니다.
        */

        int menu = 0;

        Scanner scan = new Scanner(System.in);

//        while()
            System.out.println("원하는 메뉴(1~3)를 선택하세요. (종료:0) >> ");
            System.out.println("(1) square");
            System.out.println("(2) tri");
            System.out.println("(3) log");
            String input = scan.nextLine();
            menu = Integer.parseInt(input);

            if (menu < 0 || menu > 3) {
                System.out.println("메뉴를 잘못 선택 하셨습니다.");

                while (menu > 0 || menu < 4) {
                    System.out.printf("선택하신 메뉴는 %d번 입니다.\n", menu);
                }
            }
        }
    }
