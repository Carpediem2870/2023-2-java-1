package com.green.day3.ch4;

import java.util.Scanner;

public class FlowEx4444 {
    public static void main(String[] args) {
        int score = 0;
        char grade = 'C', opt = ' ';
        System.out.print("점수를 입력하세요>");
        Scanner scan = new Scanner(System.in);
        score = scan.nextInt();

        // score값이 90점 보다 같거나 크면 A학점 출력
        // score값이 80점 보다 같거나 크면 B학점 출력
        // score값이 70점 보다 같거나 크면 C학점 출력
        // 나머지 D학점

        if (score >= 90) {
            grade = 'A';
            if (score >= 98) {
                opt = '+';
            } else if (score <= 93) {
                opt = '-';
            }


            } else if (score >= 80) {
                grade = 'B';
                if (score >= 88) {
                    opt = '+';
                } else if (score <= 83) {
                    opt = '-';
                }
            }
            System.out.printf("당신의 학점은 %c%c입니다.\n", grade, opt);


    }
}