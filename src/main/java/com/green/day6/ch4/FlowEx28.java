package com.green.day6.ch4;

import java.util.Scanner;

public class FlowEx28 {
    public static void main(String[] args) {
        int input = 0;
        int answer = (int)(Math.random()*100) + 1;
        Scanner s = new Scanner(System.in);

        System.out.println(answer);
        while(true) {
            System.out.println("1 ~ 100 사이의 정수를 입력하세요 >> ");
            input = s.nextInt();

            if (input < answer) {
                System.out.println("Up");
            } else if(input > answer) {
                System.out.println("Down");

            } else {
                System.out.println("정답입니다.");
                break;
            }
        }
    }
}
