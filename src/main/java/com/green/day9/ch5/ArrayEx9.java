package com.green.day9.ch5;

import java.util.Arrays;
import java.util.Random;

public class ArrayEx9 {
    public static void main(String[] args) {
        int[] code = { -4, -1, 3, 6, 11 };
        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            int ran = (int)(Math.random()*code.length);
            arr[i] = code[ran];  // rIdx에 있는 값을 aaa [i] 에 초기화한다.
        }

        System.out.println(Arrays.toString(arr));

        // arr각 방 code에 있는 값만 랜덤하게 넣어주세요
    }
}
