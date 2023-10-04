package com.green.day4.ch4;

import java.util.Scanner;

public class Abs {
    public static void main(String[] args) {

        // 10은 절대값 10
        // -9는(은) 절대값 9
        // -6는(은) 절대값 6

        Scanner scanner = new Scanner(System.in);
        System.out.println("숫자를 입력하세요> ");
        String sss = scanner.nextLine();
        int num = Integer.parseInt(sss);

//        if (num < 0) {
//            num = -num;
//        }

        // 1번 방법
        num = num < 0 ? -num : num;
        System.out.printf("%d는(은) 절대값%d\n", num, num);


        System.out.println("-------------------------");

        // 2번 방법
        System.out.printf("%d는(은) 절대값%d", num, num < 0 ? -num : num);
    }
}
