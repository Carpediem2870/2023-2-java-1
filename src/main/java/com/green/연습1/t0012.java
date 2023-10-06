package com.green.연습1;

import java.util.Scanner;

public class t0012 {
    public static void main(String[] args) {
        int num;
        int sum = 0;
        boolean flag = true;
        Scanner scanner = new Scanner(System.in);


        System.out.println("합계를 구할 숫자를 입력하세요. (끝내려면 0을 입력)");
        System.out.println();

        while(flag) {
            System.out.print(">> ");

            String tmp = scanner.nextLine();
            num = Integer.parseInt(tmp);

            if (num != 0) {
                sum += num;
            } else {
                flag = false;
            }
        }
        System.out.println("합계 : " + sum);
    }
}