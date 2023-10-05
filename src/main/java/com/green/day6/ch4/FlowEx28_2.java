package com.green.day6.ch4;

import java.util.Scanner;

public class FlowEx28_2 {
    public static void main(String[] args) {
        int input = 0;
        int answer = (int)(Math.random()*100) + 1;
        Scanner s = new Scanner(System.in); // 스캐너 객체생성은 반복문 바깥에서 한번만 하면 된다.

        System.out.println(answer);
        while(true) {
            System.out.println("1 ~ 100 사이의 정수를 입력하세요 >> ");
            input = s.nextInt();

            if (input == answer) {
                System.out.println("정답입니다.");break;}
            System.out.println(input<answer ? "UP" : "Down");
            }
        }
    }