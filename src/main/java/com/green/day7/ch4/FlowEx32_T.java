package com.green.day7.ch4;

import java.util.Scanner;

public class FlowEx32_T {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        while(true) {
            System.out.println("(1) square");
            System.out.println("(2) tri");
            System.out.println("(3) log");
            System.out.println("원하는 메뉴(1~3) 선택하세요. (종료:) >> ");
            int choice = scan.nextInt();

            if (choice == 0) {break;}
            else if(choice < 1 || choice >3) {
                System.out.println("메뉴를 잘못 선택 하셨습니다.");
            } else {
                System.out.printf("선택하신 메뉴는 %d번 입니다.\n", choice);
            }
        }
        System.out.println("프로그램을 종료합니다.");
    }
}