package com.green.day8.ch5;

import java.util.Arrays;

public class ArrayRandomMission {
    public static void main(String[] args) {

        // 배열1에 1~5 순서 만들기
        // 2개공간 생성
        // 2번공간에 1번 값넣고 순서 섞기 메스.랜덤
        // 2번공간을 1번에 넣기

        int[] aray1 = new int[6];


        while (true) {
            for (int i = 0; i < aray1.length - 1; i++) {
                aray1[i] = (int) (Math.random() * 10) + 1;
                System.out.printf("array[%d] : %d\n", i, aray1[i]);

                if (aray1[i] == aray1[i + 1]) {
                }
            }
        }
    }
}