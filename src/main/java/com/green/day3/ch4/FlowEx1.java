package com.green.day3.ch4;

public class FlowEx1 {
    public static void main(String[] args) { // 분기문
        int x = 0; // int x 로 변수 선언 후 x에 0이라는 숫자로 초기화함
        System.out.printf("x=%d 일 때, 참인 것은\n", x);

        if (x == 0) {
            System.out.println("x == 0");
        }
        if (x != 0) {
            System.out.println("x != 0");
        }

        System.out.println("-------------");

        x = 1;

        System.out.printf("x=%d 일 때, 참이 아닌 것은\n", x);

        if (x == 0) {
            System.out.println("x == 0");
        }
        if (x != 0) {
            System.out.println("x != 0");
        }

        System.out.println("-------------");

        if (!(x == 0)) {
            System.out.println("x == 0");
        }
        if (!(x != 0)) {
            System.out.println("x != 0");
        }
    }
}
