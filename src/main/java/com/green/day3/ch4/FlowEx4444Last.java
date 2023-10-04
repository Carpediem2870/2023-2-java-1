package com.green.day3.ch4;

import java.util.Scanner;

public class FlowEx4444Last {
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
            } else if (score >= 80) {
                grade = 'B';
            }

        if (score >= 80) { // C학점 80점 미만은 일의 자리 조건문 +-를 적용에서 배제시키기 위해서 만듦.
            int rMod = score % 10;
            if (rMod >= 8 || (score == 100)) {
                opt = '+';
            } else if (rMod <= 3) {
                opt = '-';
            }

            // 삼항연산
//            opt = (score >= 80 && (score % 10 >= 8 || score == 100)) ? '+' : (score >= 80 && score % 10 <= 3) ? '-' : opt;

            // 바로 위 if 문이 아래문장보다 더 간소화됨
//        if (score % 10 >= 8 || score == 100) {
//            opt = '+';
//        } else if (score % 10 <= 3) {
//            opt = '-';
//        }
            System.out.printf("당신의 학점은 %c%c입니다.\n", grade, opt);
        }
    }
}