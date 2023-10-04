package com.green.day5.ch4;

public class FLowEx13 {
    public static void main(String[] args) {
        // 반복문을 사용하여 1~10을 전부 더한 값을 출력해주세요

        int sum = 0;

        for (int i = 0; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {

            }
            sum += i;
            System.out.printf("%d + %d = \n", sum, i);
        }
        System.out.println(sum);
    }
}