package com.green.day3.ch4;

import java.util.Scanner;

public class FlowEx4 {
    public static void main(String[] args) {

        int score = 0;
        char m = ' ';
        System.out.print("점수를 입력하세요>");
        Scanner scan = new Scanner(System.in);
        score = scan.nextInt();

        // score값이 90점 보다 같거나 크면 A학점 출력
        // score값이 80점 보다 같거나 크면 B학점 출력
        // score값이 70점 보다 같거나 크면 C학점 출력
        // 나머지 D학점

        if (score >= 90) {
            System.out.println("A학점");
        } else if (score >= 80) {
            System.out.println("B학점");
        } else if (score >= 70) {
            System.out.println("C학점");
        } else {
            System.out.println("D학점");
        }

    }
}
