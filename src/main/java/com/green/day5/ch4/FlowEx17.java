package com.green.day5.ch4;

import java.util.Scanner;

public class FlowEx17 {
    public static void main(String[] args) {
        // Scanner를 이용하여 정수를 입력받는다.
        // *을 출력할 라인의 수를 입력하세요 >> "

        // 만약 3을 입력
        // *
        // **
        // ***

        Scanner scanner = new Scanner(System.in);
        System.out.println("당*을 출력할 라인의 수를 입력하세요 >> ");
        int sss = scanner.nextInt();//5

        //i: 0
        for (int i = 0; i <= sss; i++) {
            //j: 0
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
