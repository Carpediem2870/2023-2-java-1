package com.green.day5.ch4;

import java.util.Scanner;

public class FlowEx17MissionForx2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("입력하세요> ");
        int num = scanner.nextInt();

        for (int i = num; i > 0; i--) {
            for (int j = 1; j <= num; j++) {

                if (j < i) {
                    System.out.print("_");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}