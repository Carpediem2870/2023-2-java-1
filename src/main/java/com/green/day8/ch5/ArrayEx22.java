package com.green.day8.ch5;

import java.util.Arrays;

public class ArrayEx22 {
    public static void main(String[] args) {
        /*
        5개의 방을 갖고 있는 정수형 배열을 만들고
        각 방으 ㅣ1~10의 랜덤한 값을 넣어주세요
        */


        int[] aray1 = new int[5];
        int[] aray2 = new int[6];

        for (int i = 0; i < 100; i++) {
            aray1[i] = (int) (Math.random() * 10) + 1;
            aray2[i] = aray1[i];

            if (!(aray1[i] == aray2[i+1])) {
                System.out.printf("array[%d] : %d\n", i, aray1[i]);
            }


        }
    }
}