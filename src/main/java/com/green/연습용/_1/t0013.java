package com.green.연습용._1;

import java.util.Scanner;

public class t0013 {
    public static void main(String[] args) {
        int input=0, answer=0;

        answer = (int) (Math.random()*45)+1;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("1과 45사이의 정수를 입력하세요> ");
            input = scanner.nextInt();

            if (input > answer) {
                System.out.println("더 작은 수로 다시 시도해보세요.");
            } else if (input < answer) {
                System.out.println("더 큰 수로 다시 시도해보세요.");
            }
            } while (input!=answer);

            System.out.println("정답입니다.");
    }
}

