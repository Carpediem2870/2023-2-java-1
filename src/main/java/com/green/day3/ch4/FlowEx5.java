package com.green.day3.ch4;

import java.util.Scanner;

class FlowEx5 {
    public static void main(String[] args) {
        int score = 0;
        char grade = 'D', ttt = ' ';
        System.out.print("점수를 입력하세요>");
        Scanner scan = new Scanner(System.in);
        score = scan.nextInt();

        //score값이 90점보다 같거나 크면 A학점 출력
        //score값이 80점보다 같거나 크면 A학점 출력
        //1의 자리수가 8이상이면 +, 3이하면 -, 나머지는 없음(빈칸)

        //예를 들어 98점 > A+ 출력
        //          83점 > B-출력
        //          75 ~ 79 ~ 71 > C

        if (score >= 90) {
            grade = 'A';
            System.out.println("당신의 학점은 A" + (score <= 98 ? '+' : '-'));

            if (score >= 98) {
                ttt = '+';
            } else if (score >= 94) {
                ttt = '-';
            }

            } else if (score >= 80) {
                grade = 'B';
                if (score >= 88) {
                    ttt = '+';
                } else if (score >= 84) {
                    ttt = '-';
                }

            } else if (score >= 70) {
                grade = 'C';

            } else {
            }
                System.out.printf("당신의 학점은 %c%c입니다.\n", grade, ttt);
        }
    }



