package com.green.day5.ch4;

import java.util.Scanner;

public class FlowEx17Result2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("입력하세요> ");
        int num = scanner.nextInt();

        for (int i = 0; i < num ; i++) {
            for (int j = 0; j <= i; j++) {

                System.out.print("*");
            }
            System.out.println();
        }
    }
}