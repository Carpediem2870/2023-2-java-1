package com.green.day8.ch5;

import java.util.Arrays;

public class ArrayEx2 {
    public static void main(String[] args) {
        /*
        5개의 방을 갖고 있는 정수형 배열을 만들고
        각 방으 ㅣ1~10의 랜덤한 값을 넣어주세요
        */

        int [] aray1 = new int[5];
        System.out.println(Arrays.toString(aray1));

        for (int i = 0; i < aray1.length; i++) {
            aray1[i] = (int)(Math.random()*10)+1;
            System.out.printf("array[%d] : %d\n",i, aray1[i]);
        }
        System.out.println(Arrays.toString(aray1));
        System.out.println(aray1);

    }
}
