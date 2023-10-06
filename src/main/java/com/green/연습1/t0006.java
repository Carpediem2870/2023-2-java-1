package com.green.연습1;

import java.util.Scanner;

public class t0006 {
    public static void main(String[] args) {
        System.out.println("*을 출력할 라인의 수를 입력하세요.>");

        int num=0;
        Scanner scan = new Scanner(System.in);
        String tmp = scan.nextLine();
        num=Integer.parseInt(tmp);

        for (int i = 0; i < num; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
