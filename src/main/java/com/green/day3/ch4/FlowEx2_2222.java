package com.green.day3.ch4;

import java.util.Scanner;

public class FlowEx2_2222 {
    public static void main(String[] args) {
        // (콘솔) 숫자를 하나 입력하세요 >
        // 입력을 기다려야함
        // 숫자를 입력하고 엔터를 누르면
        // (타입자유) 변수에 해당값이 저장될 수 있도록
        // 해당값이 홀수면
        // 00은 홀수 입니다.
        // 해당 값이 짝수면
        // 00은 짝수 입니다.

        //예: 입력을 8로 했다.
        //8은 짝수입니다.
        //입력을 17로 했다.
        // 17은 홀수입니다.

        Scanner scanner = new Scanner(System.in);
        System.out.print("숫자를 하나 입력하세요> ");
        String input = scanner.nextLine();  // scan 은 입력을 기다린다. 입력+Enter
        int num = Integer.parseInt(input);

        // 삼항 연산자

        System.out.println("-------------------");

        if (num == 0) {
            System.out.println("다른 값을 입력해 주세요.");
        }
        else {
            System.out.printf("%d는(은) %s수 입니다.\n", num, num %2 == 0 ? "짝": "홀");
        }
    }
}
